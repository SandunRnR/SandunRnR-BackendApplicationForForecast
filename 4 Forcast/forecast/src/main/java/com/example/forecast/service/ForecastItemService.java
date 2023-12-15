package com.example.forecast.service;

import com.example.forecast.entity.ForecastItemEntity;

import java.util.List;

public interface ForecastItemService {
    public String saveForecastItem(String pItemName, int pForecastingInterval) throws Exception;


    public void deleteForecastItemById(int id) throws Exception;

    public List<ForecastItemEntity> getAllDeviceForecastItems() throws Exception;

    public String updateForecastItem(int id, String pItemName, int pForecastingInterval) throws Exception;

}
