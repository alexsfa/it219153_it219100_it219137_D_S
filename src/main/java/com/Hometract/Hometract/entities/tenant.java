package com.Hometract.Hometract.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Entity
@Table(name = "tenants")
public class tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tenant_id",nullable = false)
    private long id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "date_of_ID")
    private LocalDate date_of_ID_issue;
    @Column(name = "service_of_id")
    private String service_of_ID_issue;
    @Column(name = "VAT")
    @Length(min=10, max=10, message = "VAT Number must be 10 digits")
    private int VAT;

    @Column(name = "Telephone number")
    @Length(min=10, max=10, message = "Telephone Number must be 10 digits")
    private int telephone_number;
    @Column(name = "Address")
    private String address;

    @Column(name = "Email")
    @Email(message = "Please enter a valid email")
    @Size(max = 50)
    private String email;
    @Column(name = "password")
    private String password;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contract")
    private contract contract;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="property")
    private property property;

    public tenant () {}

    public tenant(long id,
                  String first_name,
                  LocalDate date_of_ID_issue,
                  String service_of_ID_issue,
                  int VAT,
                  int telephone_number,
                  String address,
                  String email,
                  String password,
                  contract contract,
                  property property) {
        this.id = id;
        this.first_name = first_name;
        this.date_of_ID_issue = date_of_ID_issue;
        this.service_of_ID_issue = service_of_ID_issue;
        this.VAT = VAT;
        this.telephone_number = telephone_number;
        this.address = address;
        this.email = email;
        this.password = password;
        this.contract = contract;
        this.property = property;
    }

    @Override
    public String toString() {
        return "tenant{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", date_of_ID_issue=" + date_of_ID_issue +
                ", service_of_ID_issue='" + service_of_ID_issue + '\'' +
                ", VAT=" + VAT +
                ", telephone_number=" + telephone_number +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contract=" + contract +
                ", property=" + property +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public com.Hometract.Hometract.entities.contract getContract() {
        return contract;
    }

    public void setContract(com.Hometract.Hometract.entities.contract contract) {
        this.contract = contract;
    }

    public com.Hometract.Hometract.entities.property getProperty() {
        return property;
    }

    public void setProperty(com.Hometract.Hometract.entities.property property) {
        this.property = property;
    }
}
