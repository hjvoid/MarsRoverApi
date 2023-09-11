package com.conderscampus.marsroverapi.service;

import com.conderscampus.marsroverapi.response.MarsRoverApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {
    @Value("${api.key}")
    private String API_KEY;
    public MarsRoverApiResponse getRoverData(String roverType, Integer marSol){
        RestTemplate rt = new RestTemplate();
        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol="+marSol+"&api_key="+API_KEY, MarsRoverApiResponse.class);
        return response.getBody();
    }
}
