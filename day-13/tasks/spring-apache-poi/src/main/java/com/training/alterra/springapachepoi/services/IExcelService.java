package com.training.alterra.springapachepoi.services;

import com.training.alterra.springapachepoi.dtos.ExportCoinPriceResponseDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IExcelService {
    List<ExportCoinPriceResponseDTO> exportExcel(MultipartFile file);
}
