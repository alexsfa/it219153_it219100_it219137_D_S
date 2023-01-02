package com.Hometract.Hometract.owner;

import com.Hometract.Hometract.contract.contract;
import com.Hometract.Hometract.property.property;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Entity
public class owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
  /*  private String name;
    private LocalDate date_of_id_issue;
    private String Service_of_id_issue;
    private int VAT;
    private int telephone_number;
    private String address;
    private String email;
    private String password;
    private List<contract> contracts;

    private List<property> properties;*/

    public owner() {}
    public owner(long id)
                 /*String name,
                 LocalDate date_of_id_issue,
                 String service_of_id_issue,
                 int VAT,
                 int telephone_number,
                 String address,
                 String email,
                 String password,
                 List<contract> contracts,
                 List<property> properties)*/
    {
        this.id = id;
//        this.name = name;
//        this.date_of_id_issue = date_of_id_issue;
//        Service_of_id_issue = service_of_id_issue;
//        this.VAT = VAT;
//        this.telephone_number = telephone_number;
//        this.address = address;
//        this.email = email;
//        this.password = password;
//        this.contracts = contracts;
//        this.properties = properties;
    }

/*    @Override
    public String toString() {
        return "owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date_of_id_issue=" + date_of_id_issue +
                ", Service_of_id_issue='" + Service_of_id_issue + '\'' +
                ", VAT=" + VAT +
                ", telephone_number=" + telephone_number +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contracts=" + contracts +
                ", properties=" + properties +
                '}';
    }*/

    public long getId() {
        return id;
    }

  /*  public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getVAT() {
        return VAT;
    }

    public void setVAT(int VAT) {
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
    }*/
}
