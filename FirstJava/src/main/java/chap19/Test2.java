package chap19;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test2 {
    
    public static void main(String[] args) {
        System.out.print("년월 정보를 입력하세요(yyyymm) : ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd");
        LocalDate dt = LocalDate.parse(date + "01", formatter);
        int dtMonth = dt.getMonthValue();
        int weekCnt = 0;
        int[][] days = new int[6][7]; //6주 7일
        int day = 1;
        int weekNum = dt.getDayOfWeek().getValue(); //1일의 요일
        do {
            days[weekCnt][weekNum] = dt.getDayOfMonth();
            if(weekNum == 6) {
                weekCnt++;
                weekNum = 0;
            }
            else {
                weekNum++;
            }
            dt = dt.plusDays(day);
        } while(dtMonth == dt.getMonthValue()); //달이 바뀌면 종료
        
        //**배열의 내용을 출력
        //엑셀 workbook 생성
        XSSFWorkbook workbook = new XSSFWorkbook(); 
        //엑셀 sheet 생성
        XSSFSheet sheet = workbook.createSheet(date);
        //일반 cell의 style 정의
        CellStyle stringStyle = workbook.createCellStyle();
        stringStyle.setAlignment(HorizontalAlignment.CENTER); //가운데 정렬
        stringStyle.setVerticalAlignment(VerticalAlignment.CENTER); //높이 가운데 정렬
        
        // Row 생성
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellStyle(stringStyle);
        cell.setCellValue(dt.getYear() + "년 " + dtMonth+ "월");
        cell = row.createCell(1);
        cell = row.createCell(2);
        cell = row.createCell(3);
        cell = row.createCell(4);
        cell = row.createCell(5);
        cell = row.createCell(6);

        //셀 병합
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,6)); //row 시작, row 종료, cell 시작, cell 종료

        //요일 출력
        row = sheet.createRow(2);
        cell = row.createCell(0);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("SUN");
        cell = row.createCell(1);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("MON");
        cell = row.createCell(2);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("TUE");
        cell = row.createCell(3);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("WEZ");
        cell = row.createCell(4);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("THU");
        cell = row.createCell(5);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("FRI");
        cell = row.createCell(6);
        cell.setCellStyle(stringStyle);
        cell.setCellValue("SAT");
        
        int r = 2;
        for(int[] week : days) {
            row = sheet.createRow(++r);
            int t = 0;
            for(int today : week) {
                cell = row.createCell(t++);
                cell.setCellStyle(stringStyle);
                cell.setCellValue("" + (today == 0? "" : today));
            }
        }

        // 엑셀 파일 작성
        try(FileOutputStream out = new FileOutputStream(new File(dt.getYear() + "년 " + dtMonth+ "월.xlsx"))) {
            workbook.write(out);
            System.out.println("엑셀 파일이 작성되었습니다.");
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }

}
