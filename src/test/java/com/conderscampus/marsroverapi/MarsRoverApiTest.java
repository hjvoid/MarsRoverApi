package com.conderscampus.marsroverapi;

import com.conderscampus.marsroverapi.response.MarsRoverApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverApiTest {

    @Test
    public void smallTest(){
        RestTemplate rt = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=dIFGODbt5tLfTYI9obIF7HcUWdChDccwD9uyparC", MarsRoverApiResponse.class);
        System.out.println(response.getBody());
    }
}
