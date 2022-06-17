package com.example.automation.sanchez.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class ExcelService {
    private String excelName;
    private String excelSheetName;
    private String applicationName;
    private File fileName;

    String home = System.getProperty("user.home");
    File dir = new File("" + home + "/OneDrive - FRG/Downloads");

    public void setData(String excelName, String excelSheetName, String applicationName) {
        this.excelName = excelName;
        this.excelSheetName = excelSheetName;
        this.applicationName = applicationName;
    }

    public String getExcelName() {
        return excelName;
    }

    public String getExcelSheetName() {
        return excelSheetName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public File getFileName() {
        return fileName;
    }

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
        
        System.out.println(cell.getCellType());
        switch (cell.getCellType()) {
            case NUMERIC:
                // if(cell.getCellType() != null ){ 
                //         cell.setCellValue(Double.parseDouble(value));
                //   }
                //  else{
                //     try {
                //         cell.setCellValue(new SimpleDateFormat("yyyy/mm/dd").parse(value));
                //     } catch (ParseException e) {
                //         // TODO Auto-generated catch block
                //         e.printStackTrace();
                //     }
                //  }
                try {
                    cell.setCellValue(Double.parseDouble(value));
                } catch (Exception e) {
                    try {
                        cell.setCellValue(new SimpleDateFormat("yyyy/mm/dd").parse(value));
                    } catch (ParseException e1) {
                        e1.printStackTrace();
                    }
                    
                }
                break;
            case STRING:
                cell.setCellValue(value);
                break;
            case BOOLEAN:
                cell.setCellValue(Boolean.parseBoolean(value));
                break;
            case BLANK:
                cell.setCellValue(value);
                break;
            case ERROR:
                cell.setCellValue(value);
                break;
            case FORMULA:
                cell.setCellValue(value);
                break;
            case _NONE:
                cell.setCellValue(Double.parseDouble(value));
                break;
        }

    }

    public File getFile() {
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(getExcelName());
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
        this.fileName = chosenFile;
        return chosenFile;
    }

    public void readAndWriteExcel(String header, String value) throws IOException {
        // System.out.println(getFile());

        FileInputStream inputStream = new FileInputStream(getFile());

        Workbook workbook = null;

        // Find the file extension by splitting file name in substring and getting only
        // extension name

        String fileExtensionName = getFile().toString().substring(getFile().toString().indexOf("."));

        // Check condition if the file is xlsx file

        if (fileExtensionName.equals(".xlsx")) {
            workbook = new XSSFWorkbook(inputStream);

        }

        // Check condition if the file is xls file

        else if (fileExtensionName.equals(".xls")) {
            workbook = new HSSFWorkbook(inputStream);

        }

        Sheet sheet = workbook.getSheet(this.getExcelSheetName());
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

        // Create a loop over all the rows of excel file to read it

        for (int i = 0; i < rowCount + 1; i++) {
            Row row = sheet.getRow(i);
            // Create a loop to print cell values in a row
            for (int j = 0; j < row.getLastCellNum(); j++) {
                if (((returnStringValue(row.getCell(j)).trim()).equalsIgnoreCase(header))) {
                    for (int t = 1; t < rowCount + 1; t++) {
                        Row rowT = sheet.getRow(t);
                        if ((returnStringValue(rowT.getCell(1)).equalsIgnoreCase(this.getApplicationName()))) {
                            writeCellValue(rowT.getCell(j), value);
                        }
                    }
                }
            }
            // System.out.println();
        }

        inputStream.close();

        FileOutputStream output_file = new FileOutputStream(getFile());

        workbook.write(output_file);

        output_file.close();

    }

}
