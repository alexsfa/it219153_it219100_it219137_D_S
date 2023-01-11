package com.Hometract.Hometract.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;


@Entity
@Table(name="properties")
public class property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_id",nullable = false)
    private int property_id;

    @Column(name = "address")
    private String address;
    @Column(name = "power_registration_number")
    @NotBlank(message = "Please enter the power registration number")
    @Size( max=8 , message = "Power registration number should not be greater than 8 characters")
    private String power_registration_number;
    @Column(name = "energy_class")
    private String energy_class;
    @Column(name = "size")
    private Double size;
    @Column(name = "year_of_construction",length = 4)
    private int year_of_construction;
    @Column(name = "number_of_rooms")
    private int number_of_rooms;
    @Column(name = "floor")
    private int floor;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "id")
    private tenant tenant;

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="owner_id")
    @JsonBackReference
    private owner owner;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "contract_id")
    private contract contract;


    public property() {}

    public property(int property_id,
                    String address,
                    String power_registration_number,
                    String energy_class,
                    Double size,
                    int year_of_construction,
                    int number_of_rooms,
                    int floor,
                    tenant tenant,
                    owner owner,
                    contract contract) {
        this.property_id = property_id;
        this.address = address;
        this.power_registration_number = power_registration_number;
        this.energy_class = energy_class;
        this.size = size;
        this.year_of_construction = year_of_construction;
        this.number_of_rooms = number_of_rooms;
        this.floor = floor;
        this.tenant = tenant;
        this.owner = owner;
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "property{" +
                "property_id=" + property_id +
                ", address='" + address + '\'' +
                ", power_registration_number='" + power_registration_number + '\'' +
                ", energy_class='" + energy_class + '\'' +
                ", size=" + size +
                ", year_of_construction=" + year_of_construction +
                ", number_of_rooms=" + number_of_rooms +
                ", floor=" + floor +
                ", tenant=" + tenant +
                ", owner=" + owner +
                ", contract=" + contract +
                '}';
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPower_registration_number() {
        return power_registration_number;
    }

    public void setPower_registration_number(String power_registration_number) {
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public com.Hometract.Hometract.entities.tenant getTenant() {
        return tenant;
    }

    public void setTenant(com.Hometract.Hometract.entities.tenant tenant) {
        this.tenant = tenant;
    }

    public com.Hometract.Hometract.entities.owner getOwner() {
        return owner;
    }

    public void setOwner(com.Hometract.Hometract.entities.owner owner) {
        this.owner = owner;
    }

    public com.Hometract.Hometract.entities.contract getContract() {
        return contract;
    }

    public void setContract(com.Hometract.Hometract.entities.contract contract) {
        this.contract = contract;
    }
}

