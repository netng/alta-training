package com.training.alterra.springapachepoi.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity(name = "CoinPrice")
@Table(name = "coint_prices")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class CoinPrice {

    @Id
    private Long id;

    private String name;
    private String ticker;

    private Long coinId;

    private String code;
    private String exchange;
    private Double invalid;

    //@Temporal(TemporalType.DATE)
    private Double recordTime;

    private BigInteger usd;
    private BigInteger idr;
    private BigInteger hnst;
    private BigInteger eth;
    private BigInteger btc;

    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Temporal(TemporalType.DATE)
    private Date updatedAt;

}
