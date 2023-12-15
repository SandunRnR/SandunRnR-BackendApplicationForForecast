package com.example.forecast.service;

import java.time.LocalDateTime;

public interface ForecastingService {
    public String saveForecasting(int forecastItemID, int forecastingTypeID, double forecastingValue, LocalDateTime forecastDateTime, LocalDateTime createdDateTime, LocalDateTime updatedDateTime, char isActive) throws Exception;

    public void deleteForecastingById(int id) throws Exception;


}
