package chap20;

import static java.util.stream.Collectors.toList;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Sample04 {

    public static void main(String[] args) {
        Document document;
        try {
            document = Jsoup.connect("https://www.namgarambooks.co.kr/").get();
            Elements elements = (Elements) document.select("#ttItem1434785977 .tt-wrap-item li div a img");
            // 1. 이미지 파일 경로 | 도서 제목 | 이미지 확장자 
            List<String> list = 
            elements.stream()
                    .map(element -> {
                        String path = element.attr("src");
                        String ext = path.split("\\.")[(path.split("\\.").length-1)];
                        //4자 이하는 확장자가 아님, 확장자가 없으면 jpg로 처리
                        ext = (ext.length() > 4 || "".contentEquals(ext))?"jpg":ext;
                        return element.attr("src") + "|" + element.attr("alt") +"|" + ext;
                     })
                    .collect(Collectors.toList());

            // 2. 다운로드 이미지 파일 리스트
            List<String> imgFileList = 
                list.stream()
                    .map(mapper -> {
                         String returnVal = mapper.split("\\|")[1] + "." + mapper.split("\\|")[2];
                         URL url;
                         try {
                             url = new URL(mapper.split("\\|")[0]);
                             try(InputStream in = new BufferedInputStream(url.openStream());
                                     OutputStream out = new BufferedOutputStream(
                                         new FileOutputStream(returnVal)))
                                 {
                                     for ( int i; (i = in.read()) != -1; ) {
                                         out.write(i);
                                     }
                                 } catch (Exception e) {
                                     System.out.println(e.getMessage());
                                 }
                         } catch (MalformedURLException e1) {
                             System.out.println(e1.getMessage());
                         }
                         return returnVal;
                     })
                    .collect(toList());

            // 3. 압축하기
            try(FileOutputStream fos = new FileOutputStream("book.zip");
                ZipOutputStream  zos = new ZipOutputStream(fos)) {
                imgFileList.stream()
                           .forEach(file -> {
                             byte[] bytes = new byte[1024];
                             File f = new File(file);
                             // zip 파일의 output Stream
                             try(FileInputStream fis      = new FileInputStream(f)) {
                                 ZipEntry        zipEntry = new ZipEntry(f.getName());
                                 
                                 // 압출할 파일 추가
                                 zos.putNextEntry(zipEntry);
                                 
                                 // 전달받은 파일을 압축하여 파일에 씀
                                 int length;
                                 while((length = fis.read(bytes)) >= 0) {
                                     zos.write(bytes, 0, length);
                                 }
                             } catch (Exception e) {
                                 System.out.println(e.getMessage());
                             }
                             //압축 후 원본 이미지 삭제
                             f.deleteOnExit();
                         });
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("이미지가 모두 압축되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
