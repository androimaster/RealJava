package chap19;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample19 {

    public static void main(String[] args)  {
        //엑셀 workbook 생성
        XSSFWorkbook workbook = new XSSFWorkbook(); 
         
        //엑셀 sheet 생성
        XSSFSheet sheet = workbook.createSheet("1학년 1반 성적");

        //일반 cell의 style 정의
        CellStyle stringStyle = workbook.createCellStyle();
        
        //날짜 cell의 style 정의
        CellStyle dateStyle = workbook.createCellStyle();
        
        //첫단위 숫자 cell의 style 정의
        CellStyle numberStyle = workbook.createCellStyle();

        //정렬
        stringStyle.setAlignment(HorizontalAlignment.LEFT); //왼쪽 정렬
        stringStyle.setVerticalAlignment(VerticalAlignment.CENTER); //높이 가운데 정렬
        
        dateStyle.setAlignment(HorizontalAlignment.CENTER); //가운데 정렬
        dateStyle.setVerticalAlignment(VerticalAlignment.CENTER); //높이 가운데 정렬
        
        numberStyle.setAlignment(HorizontalAlignment.RIGHT); //우측 정렬
        numberStyle.setVerticalAlignment(VerticalAlignment.CENTER); //높이 가운데 정렬
        
        //폰트
        Font normalFont = workbook.createFont();
        normalFont.setFontHeightInPoints((short)12);   // 폰트사이즈
        
        stringStyle.setFont(normalFont);          // 스타일에 폰트 적용
        dateStyle.setFont(normalFont);
        numberStyle.setFont(normalFont);

        //테두리 선
        stringStyle.setBorderLeft(BorderStyle.THIN);
        stringStyle.setBorderRight(BorderStyle.THIN);
        stringStyle.setBorderTop(BorderStyle.THIN);
        stringStyle.setBorderBottom(BorderStyle.THIN);
        dateStyle.setBorderLeft(BorderStyle.THIN);
        dateStyle.setBorderRight(BorderStyle.THIN);
        dateStyle.setBorderTop(BorderStyle.THIN);
        dateStyle.setBorderBottom(BorderStyle.THIN);
        numberStyle.setBorderLeft(BorderStyle.THIN);
        numberStyle.setBorderRight(BorderStyle.THIN);
        numberStyle.setBorderTop(BorderStyle.THIN);
        numberStyle.setBorderBottom(BorderStyle.THIN);

        CreationHelper createHelper = workbook.getCreationHelper();  
        dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("yyyy-mm-dd"));
        numberStyle.setDataFormat(createHelper.createDataFormat().getFormat("#,##0"));

        // Row 생성
        Row row = sheet.createRow(0);

        // Cell 생성
        Cell cell = row.createCell(0);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("20202021");
        
        cell = row.createCell(1);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("빵형");
        
        cell = row.createCell(2);
        cell.setCellStyle(dateStyle);
        cell.setCellValue("2020-04-01");
        
        cell = row.createCell(3);
        cell.setCellStyle(numberStyle);
        cell.setCellValue("1000");
        
        cell = row.createCell(4);
        cell.setCellStyle(numberStyle);
        cell.setCellValue("300");
        
        cell = row.createCell(5);
        cell.setCellStyle(numberStyle);
        cell.setCellValue("9999");
        
        // cell 넓이 설정
        sheet.setColumnWidth(0, 2800);
        sheet.setColumnWidth(1, 2800);
        sheet.setColumnWidth(2, 2800);
        sheet.setColumnWidth(3, 2800);
        sheet.setColumnWidth(4, 2800);
        sheet.setColumnWidth(5, 2800);
        
        // 엑셀 파일 작성
        try(FileOutputStream out = new FileOutputStream(new File("점수.xlsx"))) {
            workbook.write(out);
            System.out.println("엑셀 파일이 작성되었습니다.");
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }

}
