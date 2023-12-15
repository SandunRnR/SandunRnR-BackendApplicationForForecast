package com.example.forecast.repository;

import com.example.forecast.entity.ForecastingEntity;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForecastingRepo extends JpaRepository<ForecastingEntity, Integer> {

}
