package com.Hometract.Hometract.property;

import java.util.List;

public class property {
    private String address;
    private long power_registration_number;
    private String energy_class;
    private Double size;
    private int year_of_construction;
    private int number_of_rooms;
    private List<String> benefits;
    private int floor;

    public property(String address,
                    long power_registration_number,
                    String energy_class,
                    Double size,
                    int year_of_construction,
                    int number_of_rooms,
                    List<String> benefits,
                    int floor)
    {
        this.address = address;
        this.power_registration_number = power_registration_number;
        this.energy_class = energy_class;
        this.size = size;
        this.year_of_construction = year_of_construction;
        this.number_of_rooms = number_of_rooms;
        this.benefits = benefits;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "property{" +
                "address='" + address + '\'' +
                ", power_registration_number=" + power_registration_number +
                ", energy_class='" + energy_class + '\'' +
                ", size=" + size +
                ", year_of_construction=" + year_of_construction +
                ", number_of_rooms=" + number_of_rooms +
                ", benefits=" + benefits +
                ", floor=" + floor +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPower_registration_number() {
        return power_registration_number;
    }

    public void setPower_registration_number(long power_registration_number) {
        this.power_registration_number = power_registration_number;
    }

    public String getEnergy_class() {
        return energy_class;
    }

    public void setEnergy_class(String energy_class) {
        this.energy_class = energy_class;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public int getYear_of_construction() {
        return year_of_construction;
    }

    public void setYear_of_construction(int year_of_construction) {
        this.year_of_construction = year_of_construction;
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }

    public List<String> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<String> benefits) {
        this.benefits = benefits;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
