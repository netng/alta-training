package com.training.alterra.springapachepoi.repositories;

import com.training.alterra.springapachepoi.entities.CoinPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinPriceRepository extends JpaRepository<CoinPrice, Long> {
}
