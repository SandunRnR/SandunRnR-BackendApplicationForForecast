package com.example.forecast.service;

import com.example.forecast.entity.ForecastTypeEntity;

import java.util.List;

public interface ForecastTypeService {

    public String saveForecastType(String pName, char pContributionOrder);

    public void deleteForecastTypeById(int id) throws Exception;

    public List<ForecastTypeEntity> getAllForecastTypeEntity() throws Exception;

    public String updateForecastType(int id, String name, char contributionOrder) throws Exception;
}
