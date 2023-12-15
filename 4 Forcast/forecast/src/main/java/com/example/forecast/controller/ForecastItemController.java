package com.example.forecast.controller;

import com.example.forecast.dto.ForecastItemDTO;
import com.example.forecast.entity.ForecastItemEntity;
import com.example.forecast.service.ForecastItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/forecastItem")
public class ForecastItemController {

    @Autowired
    private ForecastItemService forecastItemService;

    @PostMapping("/saveDTO")
    public String saveForecastItemDTO(
            @RequestBody ForecastItemDTO pForecastItemDTO) throws Exception {
        return forecastItemService.saveForecastItem(pForecastItemDTO.getItemName(),
                pForecastItemDTO.getForecastingInterval()
        );
    }

    @DeleteMapping("/delete/{id}")
    public String deleteForecastItemById(@PathVariable int id) throws Exception {
        forecastItemService.deleteForecastItemById(id);
        return "Successfully Deleted!";
    }


    @GetMapping("/getAll")
    public List<ForecastItemEntity> getAllDeviceForecastItems() throws Exception {
        return forecastItemService.getAllDeviceForecastItems();
    }

    @PutMapping("/update/{id}")
    public String updateForecastItem(@PathVariable int id, @RequestBody ForecastItemDTO pForecastItemDTO) throws Exception {
        return forecastItemService.updateForecastItem(id, pForecastItemDTO.getItemName(),
                pForecastItemDTO.getForecastingInterval());
    }


}
