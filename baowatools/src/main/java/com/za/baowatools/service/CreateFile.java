package com.za.baowatools.service;

import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public interface CreateFile {
    static void createFile(int rowNum, boolean isId, boolean isName, boolean isLicense, boolean isPhoneNum, boolean isStr, int strleng, boolean isNum, int numleng, boolean isStrnNum, int strnumleng, boolean isDate, String date1, String date2) {
        String filePath = "D:/test0418.xlsx";
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("sheetName");

        for(int i = 0; i <= rowNum; ++i) {
            XSSFRow row = sheet.createRow(i);
            int j = 0;
            XSSFCell cellDate;
            if (isId) {
                cellDate = row.createCell(j);
                if (i == 0) {
                    cellDate.setCellValue("身份证号");
                } else {
                    cellDate.setCellValue(IdNumGenerator.verificationCodeAppend());
                }

                ++j;
            }

            if (isName) {
                cellDate = row.createCell(j);
                if (i == 0) {
                    cellDate.setCellValue("姓名");
                } else {
                    cellDate.setCellValue(NameGenerator.setFamilyName() + NameGenerator.setGivenName() + NameGenerator.setGivenName());
                }

                ++j;
            }

            if (isLicense) {
                cellDate = row.createCell(j);
                if (i == 0) {
                    cellDate.setCellValue("车牌号");
                } else {
                    cellDate.setCellValue(LicensePlateNumGenerator.setAreaPrivinceCode("浙江") + LicensePlateNumGenerator.setPlateNum());
                }

                ++j;
            }

            if (isPhoneNum) {
                cellDate = row.createCell(j);
                if (i == 0) {
                    cellDate.setCellValue("电话号码");
                } else {
                    cellDate.setCellValue(PhoneNumGenerator.setNumPrefix() + PhoneNumGenerator.setNumSuffix());
                }

                ++j;
            }

            if (isStr) {
                cellDate = row.createCell(j);
                if (i == 0) {
                    cellDate.setCellValue("随机字符（字母）串");
                } else {
                    cellDate.setCellValue(LetterStringGenerator.setLetterRandom(strleng));
                }

                ++j;
            }

            if (isNum) {
                cellDate = row.createCell(j);
                if (i == 0) {
                    cellDate.setCellValue("随机数字串");
                } else {
                    cellDate.setCellValue(NumStringGenerator.setLetterRandom(numleng));
                }

                ++j;
            }

            if (isStrnNum) {
                cellDate = row.createCell(j);
                if (i == 0) {
                    cellDate.setCellValue("随机数字字母串");
                } else {
                    cellDate.setCellValue(LetterAndNumGenerator.setLetterAndNum(strnumleng));
                }

                ++j;
            }

            if (isStrnNum) {
                cellDate = row.createCell(j);
                if (i == 0) {
                    cellDate.setCellValue("日期");
                } else {
                    cellDate.setCellValue(DateGenerator.dateRangeRandom(date1, date2));
                }

                ++j;
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            wb.write(outputStream);
            outputStream.close();
        } catch (Exception var21) {
            var21.printStackTrace();
        }

    }

    static void main(String[] args) {
        createFile(100, true, true, true, true, true, 10, true, 8, true, 6, true, "2017-08-12", "2019-11-11");
    }
}
