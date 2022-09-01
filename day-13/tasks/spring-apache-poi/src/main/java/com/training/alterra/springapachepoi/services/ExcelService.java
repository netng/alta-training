package com.training.alterra.springapachepoi.services;

import com.training.alterra.springapachepoi.dtos.ExportCoinPriceResponseDTO;
import com.training.alterra.springapachepoi.entities.CoinPrice;
import com.training.alterra.springapachepoi.repositories.CoinPriceRepository;
import com.training.alterra.springapachepoi.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

@Service
public class ExcelService implements IExcelService{

    @Autowired
    CoinPriceRepository coinPriceRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<ExportCoinPriceResponseDTO> exportExcel(MultipartFile file) {
        try {
            List<CoinPrice> coinPrices = ExcelUtil.excelToCoinPrice(file.getInputStream());
            List<CoinPrice> coinPriceList = coinPriceRepository.saveAll(coinPrices);

            if (!coinPriceList.isEmpty()) {
                return coinPriceList.stream()
                        .map(coinPrice -> modelMapper.map(coinPrice, ExportCoinPriceResponseDTO.class))
                        .collect(Collectors.toList());
            }
        } catch (IOException exception) {
            throw new RuntimeException(String.format("Gagal export data ke database --ERR: %s", exception.getMessage()));
        }

        return Collections.emptyList();
    }

    private ExportCoinPriceResponseDTO convertToDto(CoinPrice coinPrice) {
        return modelMapper.map(coinPrice, ExportCoinPriceResponseDTO.class);
    }
}
