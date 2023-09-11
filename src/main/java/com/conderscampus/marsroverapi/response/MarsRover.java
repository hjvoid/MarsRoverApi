package com.conderscampus.marsroverapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class MarsRover {

    private Long id;
    private String name;
    @JsonProperty("landing_date")
    private Date landingDate;
    @JsonProperty("launch_date")
    private String launchDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLandingDate() {
        return landingDate;
    }

    public void setLandingDate(Date landingDate) {
        this.landingDate = landingDate;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", landingDate=" + landingDate +
                ", launchDate='" + launchDate + '\'' +
                '}';
    }
}
