package com.Hometract.Hometract.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="owners")
public class owner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id",nullable = false)
    private int id;

    @Column(name = "first_name", nullable = false)
    @NotBlank(message = "Please enter the first name of the owner")
    @Size( max=30 , message = "First name should not be greater than 30 characters")
    private String first_name;

    @Column(name = "last_name", nullable = false)
    @NotBlank(message = "Please enter the last name of the owner")
    @Size( max=30 , message = "Last name should not be greater than 30 characters")
    private String last_name;


    @Column(name = "Date_of_id_issue")
    private LocalDate date_of_id_issue;

    @Column(name = "Service_of_id_issue")
    private String Service_of_id_issue;

    @Column(name = "VAT",nullable = false)
    private String VAT;

    @Column(name = "phone_number")
    private int telephone_number;

    @Column(name = "address")
    private String address;

    @Column(name = "email", unique = true,nullable = false)
    @Email(message = "Please enter a valid email")
    @Size(max = 50)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @OneToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH},
            mappedBy = "owner")
    @JsonManagedReference
    private List<contract> contracts;

    @OneToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH},
            mappedBy = "owner")
    @JsonManagedReference
    private List<property> properties;

    public owner() {}

    public owner(int id,
                 String first_name,
                 String last_name,
                 LocalDate date_of_id_issue,
                 String service_of_id_issue,
                 String VAT,
                 int telephone_number,
                 String address,
                 String email,
                 String password,
                 List<contract> contracts,
                 List<property> properties) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_id_issue = date_of_id_issue;
        Service_of_id_issue = service_of_id_issue;
        this.VAT = VAT;
        this.telephone_number = telephone_number;
        this.address = address;
        this.email = email;
        this.password = password;
        this.contracts = contracts;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "owner{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date_of_id_issue=" + date_of_id_issue +
                ", Service_of_id_issue='" + Service_of_id_issue + '\'' +
                ", VAT='" + VAT + '\'' +
                ", telephone_number=" + telephone_number +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contracts=" + contracts +
                ", properties=" + properties +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getDate_of_id_issue() {
        return date_of_id_issue;
    }

    public void setDate_of_id_issue(LocalDate date_of_id_issue) {
        this.date_of_id_issue = date_of_id_issue;
    }

    public String getService_of_id_issue() {
        return Service_of_id_issue;
    }

    public void setService_of_id_issue(String service_of_id_issue) {
        Service_of_id_issue = service_of_id_issue;
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }

    public int getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(int telephone_number) {
        this.telephone_number = telephone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<contract> contracts) {
        this.contracts = contracts;
    }

    public List<property> getProperties() {
        return properties;
    }

    public void setProperties(List<property> properties) {
        this.properties = properties;
    }
}
