package com.example.automation.excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

import com.example.automation.SpringTestNGTest;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest extends SpringTestNGTest {

    public void readExcel(File fileName, String sheetName) throws IOException {

        FileInputStream inputStream = new FileInputStream(fileName);

        Workbook workbook = null;

        // Find the file extension by splitting file name in substring and getting only
        // extension name

        String fileExtensionName = fileName.toString().substring(fileName.toString().indexOf("."));

        // Check condition if the file is xlsx file

        if (fileExtensionName.equals(".xlsx")) {
            workbook = new XSSFWorkbook(inputStream);

        }

        // Check condition if the file is xls file

        else if (fileExtensionName.equals(".xls")) {
            workbook = new HSSFWorkbook(inputStream);

        }

        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

        // Create a loop over all the rows of excel file to read it

        // for (int i = 0; i < rowCount + 1; i++) {
        // Row row = sheet.getRow(i);
        // // Create a loop to print cell values in a row
        // for (int j = 0; j < row.getLastCellNum(); j++) {
        // // Print Excel data in console
        // System.out.print(returnStringValue(row.getCell(j)) + "|| ");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < rowCount + 1; i++) {
            Row row = sheet.getRow(i);
            // Create a loop to print cell values in a row
            for (int j = 0; j < row.getLastCellNum(); j++) {
                if ((returnStringValue(row.getCell(j)).equalsIgnoreCase("Technical Owner"))) {
                    System.out.println(j);
                    for (int t = 1; t < rowCount + 1; t++) {
                        Row rowT = sheet.getRow(t);
                        if ((returnStringValue(rowT.getCell(1)).equalsIgnoreCase("Eve O'Lution"))) {
                            writeCellValue(rowT.getCell(j), "DeepakSingh@Fnb.co.za");
                        }
                    }
                }
            }
            // System.out.println();
        }

        inputStream.close();

        FileOutputStream output_file = new FileOutputStream(fileName);

        workbook.write(output_file);

        output_file.close();

    }

    // Main function is calling readExcel function to read data from excel file

    private static String returnStringValue(Cell cell) {
        CellType cellType = cell.getCellType();
        switch (cellType) {
            case NUMERIC:
                double doubleVal = cell.getNumericCellValue();
                return String.valueOf(doubleVal);
            case STRING:
                return cell.getStringCellValue();
            case ERROR:
                return String.valueOf(cell.getErrorCellValue());
            case BLANK:
                return "";
            case FORMULA:
                return cell.getCellFormula();
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case _NONE:
                break;
            default:
                break;

        }
        return "error decoding string value of the cell";
    }

    private static void writeCellValue(Cell cell, String value) {
        switch (cell.getCellType()) {
            case NUMERIC:
                cell.setCellValue(Double.parseDouble(value));
                break;
            case STRING:
                cell.setCellValue(value);
                break;
            case BOOLEAN:
                cell.setCellValue(Boolean.parseBoolean(value));
                break;
            case BLANK:
                break;
            case ERROR:
                break;
            case FORMULA:
                break;
            case _NONE:
                break;
            default:
                break;
        }

    }

    public static void main(String... strings) throws IOException {

        // Create an object of the class

        ExcelTest objExcelFile = new ExcelTest();

        // Prepare the path of excel file

        String home = System.getProperty("user.home");
        System.out.println(home);

        File dir = new File(""+home+"/OneDrive - FRG/Downloads");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith("Ownership_AppsAttributes.xls");
            }
        };
        File[] files = dir.listFiles(filter);
        long lastModifiedTime = Long.MIN_VALUE;
        File chosenFile = null;

        if (files != null) {
            for (File file : files) {
                if (file.lastModified() > lastModifiedTime) {
                    chosenFile = file;
                    lastModifiedTime = file.lastModified();
                }
            }
        }

        System.out.println(chosenFile);

        // Call read file method of the class to read data

        objExcelFile.readExcel(chosenFile, "Ownership");

    }

}
