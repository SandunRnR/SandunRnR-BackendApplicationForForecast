package com.example.forecast.controller;

import com.example.forecast.dto.ForecastingDTO;
import com.example.forecast.service.ForecastingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/forecasting")
public class ForecastingController {

    @Autowired
    private ForecastingService forecastingService;

    @PostMapping("/saveDTO")
    public String saveForecasting(@RequestBody ForecastingDTO pForecastingDTO) throws Exception {
        return forecastingService.saveForecasting(pForecastingDTO.getForecastItemID(), pForecastingDTO.getForecastingTypeID(), pForecastingDTO.getForecastingValue(),
                pForecastingDTO.getForecastDateTime(), pForecastingDTO.getCreatedDateTime(), pForecastingDTO.getUpdatedDateTime(), pForecastingDTO.getIsActive());
    }

    @DeleteMapping("/delete/{id}")
    public String deleteForecasting(@PathVariable int id) throws Exception {
        forecastingService.deleteForecastingById(id);
        return "Successfully Deleted!";
    }


}
