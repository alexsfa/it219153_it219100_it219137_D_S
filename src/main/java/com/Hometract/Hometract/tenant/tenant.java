package com.Hometract.Hometract.tenant;

import java.time.LocalDate;

public class tenant {
    private String name;
    private int ID_Number;
    private LocalDate date_of_ID_issue;
    private String service_of_ID_issue;
    private int VAT;
    private int telephone_number;
    private String address;
    private String email;
    private long userID;
    private String password;

    public tenant(String name,
                  int ID_Number,
                  LocalDate date_of_ID_issue,
                  String service_of_ID_issue,
                  int VAT,
                  int telephone_number,
                  String address,
                  String email,
                  long userID,
                  String password)
    {
        this.name = name;
        this.ID_Number = ID_Number;
        this.date_of_ID_issue = date_of_ID_issue;
        this.service_of_ID_issue = service_of_ID_issue;
        this.VAT = VAT;
        this.telephone_number = telephone_number;
        this.address = address;
        this.email = email;
        this.userID = userID;
        this.password = password;
    }

    @Override
    public String toString() {
        return "tenant{" +
                "name='" + name + '\'' +
                ", ID_Number=" + ID_Number +
                ", date_of_ID_issue=" + date_of_ID_issue +
                ", service_of_ID_issue='" + service_of_ID_issue + '\'' +
                ", VAT=" + VAT +
                ", telephone_number=" + telephone_number +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", userID=" + userID +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID_Number() {
        return ID_Number;
    }

    public void setID_Number(int ID_Number) {
        this.ID_Number = ID_Number;
    }

    public LocalDate getDate_of_ID_issue() {
        return date_of_ID_issue;
    }

    public void setDate_of_ID_issue(LocalDate date_of_ID_issue) {
        this.date_of_ID_issue = date_of_ID_issue;
    }

    public String getService_of_ID_issue() {
        return service_of_ID_issue;
    }

    public void setService_of_ID_issue(String service_of_ID_issue) {
        this.service_of_ID_issue = service_of_ID_issue;
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

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
