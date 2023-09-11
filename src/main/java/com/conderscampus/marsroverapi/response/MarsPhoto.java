package com.conderscampus.marsroverapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhoto {
    private Long id;
    private Integer sol;
    private MarsCamera camera;
    @JsonProperty("img_src")
    private String imgSrc;
    @JsonProperty("earth_date")
    private String earthData;
    private MarsRover rover;

    public MarsCamera getCamera() {
        return camera;
    }

    public void setCamera(MarsCamera camera) {
        this.camera = camera;
    }

    public String getEarthData() {
        return earthData;
    }

    public void setEarthData(String earthData) {
        this.earthData = earthData;
    }

    public MarsRover getRover() {
        return rover;
    }

    public void setRover(MarsRover rover) {
        this.rover = rover;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSol() {
        return sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public MarsCamera getMarsCamera() {
        return camera;
    }

    public void setMarsCamera(MarsCamera marsCamera) {
        this.camera = marsCamera;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    @Override
    public String toString() {
        return "MarsPhoto{" +
                "id=" + id +
                ", sol=" + sol +
                ", camera=" + camera +
                ", imgSrc='" + imgSrc + '\'' +
                ", earthData='" + earthData + '\'' +
                ", rover=" + rover +
                '}';
    }
}
