package com.training.alterra.springapachepoi.controllers;

import com.training.alterra.springapachepoi.dtos.ExportCoinPriceResponseDTO;
import com.training.alterra.springapachepoi.services.IExcelService;
import com.training.alterra.springapachepoi.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExportController {

    @Autowired
    IExcelService excelService;

    @PostMapping("/export")
    public ResponseEntity<List<ExportCoinPriceResponseDTO>> exportFile(@RequestParam("file") MultipartFile file) {
        System.out.println(file.getContentType());

        if (ExcelUtil.isExcelFormat(file)) {
            try {
                List<ExportCoinPriceResponseDTO> response = excelService.exportExcel(file);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } catch (Exception exception) {
                System.out.println("executed");
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
