package com.example.forecast.controller;


import com.example.forecast.dto.ForecastItemDTO;
import com.example.forecast.dto.ForecastTypeDTO;
import com.example.forecast.entity.ForecastItemEntity;
import com.example.forecast.entity.ForecastTypeEntity;
import com.example.forecast.entity.ForecastingEntity;
import com.example.forecast.service.ForecastTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/forecastType")
public class ForecastTypeController {

    @Autowired
    private ForecastTypeService forecastTypeService;

    @PostMapping("saveForecastType")
    public String saveForecastType(@RequestBody ForecastTypeDTO pForecastTypeDTO) throws Exception {
        return forecastTypeService.saveForecastType(pForecastTypeDTO.getName(), pForecastTypeDTO.getContributionOrder());
    }

    @DeleteMapping("delete/{id}")
    public String deleteForecastTypeById(@PathVariable int id) throws Exception {
        forecastTypeService.deleteForecastTypeById(id);
        return "Successfully Deleted!";
    }

    @GetMapping("getAll")
    public List<ForecastTypeEntity> getAllForecastType() throws Exception {
        return forecastTypeService.getAllForecastTypeEntity();
    }

    @PutMapping("/update/{id}")
    public String updateForecastType(@PathVariable int id, @RequestBody ForecastTypeDTO pForecastTypeDTO) throws Exception {
        return forecastTypeService.updateForecastType(id, pForecastTypeDTO.getName(),
                pForecastTypeDTO.getContributionOrder());
    }


}
