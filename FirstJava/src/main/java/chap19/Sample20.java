package chap19;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample20 {

    public static void main(String[] args)  {
        List list = new ArrayList<String>();
        try (FileInputStream in = new FileInputStream(new File("점수.xlsx"))) {
            //엑셀 workbook 생성
            XSSFWorkbook workbook = new XSSFWorkbook(in);

            //엑셀 sheet 읽기
            XSSFSheet sheet = workbook.getSheet("1학년 1반 성적");

            //엑셀 sheet로 부터 데이터가 있는 모든 Row를 읽어옵니다.
            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.forEachRemaining(row -> {
                //Row에 있는 모든 Cell 정보를 Iterator 정보로 읽어옵니다.
                Iterator<Cell> cellIterator = row.cellIterator();
                //학번, 이름, 시험일자, 국어, 영어, 수학
                var data = new HashMap<String, Object>();
                data.put("학번"   , row.getCell(0).getStringCellValue());
                data.put("이름"   , row.getCell(1).getStringCellValue());
                data.put("시험일자", row.getCell(2).getStringCellValue());
                data.put("국어"   , row.getCell(3).getStringCellValue());
                data.put("영어"   , row.getCell(4).getStringCellValue());
                data.put("수학"   , row.getCell(5).getStringCellValue());
                list.add(data);
            });
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // 엑셀에서 읽어 온 데이터 출력
        System.out.println(list.toString());
    }

}
