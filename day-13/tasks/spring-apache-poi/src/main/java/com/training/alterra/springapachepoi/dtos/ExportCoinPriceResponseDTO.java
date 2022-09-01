package com.training.alterra.springapachepoi.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
public class ExportCoinPriceResponseDTO implements Serializable {
    private Long id;
    private String name;
    private String ticker;

    @JsonProperty("coin_id")
    private Long coinId;

    private String code;
    private String exchange;
    private Double invalid;

    //@JsonProperty("record_time")
    private Double recordTime;

    private BigInteger usd;
    private BigInteger idr;
    private BigInteger hnst;
    private BigInteger eth;
    private BigInteger btc;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy", timezone = "Asia/Jakarta")
    @JsonProperty("created_at")
    private Date createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy", timezone = "Asia/Jakarta")
    @JsonProperty("updated_at")
    private Date updatedAt;
}
