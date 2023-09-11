package com.conderscampus.marsroverapi.web;

import com.conderscampus.marsroverapi.dto.HomeDto;
import com.conderscampus.marsroverapi.response.MarsRoverApiResponse;
import com.conderscampus.marsroverapi.service.MarsRoverApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @Autowired
    private MarsRoverApiService roverService;

    @GetMapping(value = "/")
    public String getHomeView(ModelMap model, HomeDto homeDto) {
        if (!StringUtils.hasText(homeDto.getMarsApiRoverData())){
            homeDto.setMarsApiRoverData("opportunity");
        }
        if (homeDto.getMarsSol() == null) {
            homeDto.setMarsSol(1);
        }
        MarsRoverApiResponse roverData = roverService.getRoverData(homeDto.getMarsApiRoverData(), homeDto.getMarsSol());
        model.put("roverData", roverData);
        model.put("homeDto", homeDto);
        return "index";
    }
}
