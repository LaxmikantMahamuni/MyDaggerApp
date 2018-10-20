package com.laxmikant.mydaggerapp.mrasAPI;

/**
 * Created by Laxmikant Mahamuni on 10/16/2014.
 */

public class Result {
    private String id;

    private String name;

    private Areas[] areas;

    private String availabilityResult;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Areas[] getAreas() {
        return areas;
    }

    public void setAreas(Areas[] areas) {
        this.areas = areas;
    }

    public String getAvailabilityResult() {
        return availabilityResult;
    }

    public void setAvailabilityResult(String availabilityResult) {
        this.availabilityResult = availabilityResult;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", name = " + name + ", areas = " + areas + ", availabilityResult = " + availabilityResult + "]";
    }
}