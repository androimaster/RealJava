package chap20;

import static java.util.stream.Collectors.toList;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Sample03 {

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
            imgFileList.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
