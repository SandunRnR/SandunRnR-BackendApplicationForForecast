package com.example.forecast.repository;

import com.example.forecast.entity.ForecastTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForecastTypeRepo extends JpaRepository<ForecastTypeEntity, Integer> {


}
