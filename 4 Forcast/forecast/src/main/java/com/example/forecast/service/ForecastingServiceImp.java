package com.example.forecast.service;


import com.example.forecast.entity.ForecastingEntity;
import com.example.forecast.repository.ForecastingRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
public class ForecastingServiceImp implements ForecastingService {

    @Autowired
    private ForecastingRepo forecastingRepo;

    @Override
    public String saveForecasting(int pForecastItemID, int pForecastingTypeID, double pForecastingValue, LocalDateTime pForecastDateTime, LocalDateTime pCreatedDateTime, LocalDateTime pUpdateDateTime, char pIsActive) throws Exception {

        ForecastingEntity newObjectForecastingEntity = new ForecastingEntity(pForecastItemID, pForecastingTypeID, pForecastingValue, pForecastDateTime, pCreatedDateTime, pUpdateDateTime, pIsActive);

        try {
            forecastingRepo.save(newObjectForecastingEntity);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Successfully Inserted!";
    }

    @Override
    public void deleteForecastingById(int id) throws Exception {
        forecastingRepo.deleteById(id);
    }


}
