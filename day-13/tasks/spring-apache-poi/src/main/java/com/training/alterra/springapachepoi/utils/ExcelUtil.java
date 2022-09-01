package com.training.alterra.springapachepoi.utils;

import com.training.alterra.springapachepoi.dtos.ExportCoinPriceResponseDTO;
import com.training.alterra.springapachepoi.entities.CoinPrice;
import com.training.alterra.springapachepoi.repositories.CoinPriceRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.jdbc.Work;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.Root;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelUtil {
    public static final String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    static String SHEET = "schedule_coin_price_history";

    public static boolean isExcelFormat(MultipartFile file) {
        if (!TYPE.equals(file.getContentType())) {
            return false;
        }
        return true;
    }

    public static List<CoinPrice> excelToCoinPrice(InputStream inputStream) {
        try {
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();
            List<CoinPrice> coinPrices = new ArrayList<>();
            int rowNumber = 0;

            while (rows.hasNext()) {
                Row currentRow = rows.next();

                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsRow = currentRow.iterator();
                CoinPrice coinPrice = new CoinPrice();
                int cellId = 0;

                while (cellsRow.hasNext()) {
                    Cell currentCell = cellsRow.next();

                    switch (cellId) {
                        case 0 -> {
                            coinPrice.setId((long) currentCell.getNumericCellValue());
                        }

                        case 1 -> {
                            coinPrice.setName(currentCell.getStringCellValue());
                        }

                        case 2 -> {
                            coinPrice.setTicker(currentCell.getStringCellValue());
                        }

                        case 3 -> {
                            coinPrice.setCoinId((long) currentCell.getNumericCellValue());
                        }

                        case 4 -> {
                            coinPrice.setCode(currentCell.getStringCellValue());
                        }

                        case 5 -> {
                            coinPrice.setExchange(currentCell.getStringCellValue());
                        }

                        case 6 -> {
                            coinPrice.setInvalid(currentCell.getNumericCellValue());
                        }

                        case 7 -> {
                            continue;
                            //coinPrice.setRecordTime(currentCell.getNumericCellValue());

                        }

                        case 8 -> {
                            coinPrice.setUsd(BigInteger.valueOf((long) currentCell.getNumericCellValue()));
                        }

                        case 9 -> {
                            coinPrice.setIdr(BigInteger.valueOf((long) currentCell.getNumericCellValue()));
                        }

                        case 10 -> {
                            coinPrice.setHnst(BigInteger.valueOf((long) currentCell.getNumericCellValue()));
                        }

                        case 11 -> {
                            coinPrice.setEth(BigInteger.valueOf((long) currentCell.getNumericCellValue()));
                        }

                        case 12 -> {
                            coinPrice.setBtc(BigInteger.valueOf((long) currentCell.getNumericCellValue()));
                        }

                        case 13 -> {
                            continue;
                            //coinPrice.setCreatedAt(currentCell.getDateCellValue());
                        }

                        case 14 -> {
                            continue;
                            //coinPrice.setUpdatedAt(currentCell.getDateCellValue());
                        }

                        default -> {
                        }
                    }

                    cellId++;

                }

                coinPrices.add(coinPrice);

            }

            workbook.close();
            return coinPrices;

        } catch (IOException e) {
            throw new RuntimeException(String.format("Gagal memparsing file excel --ERR: %s", e.getMessage()));
        }
    }
}
