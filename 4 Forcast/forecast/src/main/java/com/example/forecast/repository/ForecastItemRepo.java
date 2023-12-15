package com.example.forecast.repository;

import com.example.forecast.entity.ForecastItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForecastItemRepo extends JpaRepository<ForecastItemEntity, Integer> {


}
