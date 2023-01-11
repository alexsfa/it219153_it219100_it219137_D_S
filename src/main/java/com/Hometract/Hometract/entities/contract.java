package com.Hometract.Hometract.entities;

import com.Hometract.Hometract.entities.owner;
import com.Hometract.Hometract.entities.property;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "contracts")
public class contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id",nullable = false)
    private int contract_id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "Terms")
    private String specialTerms;

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="owner_id")
    @JsonBackReference
    private owner owner;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="property_id")
    private property property;

    @Column(name = "Payment in advance")
    private int payment_in_advance;

    @Column(name = "reason_of_use")
    private String reason_of_use;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id")
    private tenant tenant;

    public contract() {}

    public contract(int contract_id,
                    LocalDate startDate,
                    LocalDate endDate,
                    LocalDate creationDate,
                    String specialTerms,
                    com.Hometract.Hometract.entities.owner owner,
                    com.Hometract.Hometract.entities.property property,
                    int payment_in_advance,
                    String reason_of_use,
                    com.Hometract.Hometract.entities.tenant tenant) {
        this.contract_id = contract_id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.creationDate = creationDate;
        this.specialTerms = specialTerms;
        this.owner = owner;
        this.property = property;
        this.payment_in_advance = payment_in_advance;
        this.reason_of_use = reason_of_use;
        this.tenant = tenant;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getSpecialTerms() {
        return specialTerms;
    }

    public void setSpecialTerms(String specialTerms) {
        this.specialTerms = specialTerms;
    }

    public com.Hometract.Hometract.entities.owner getOwner() {
        return owner;
    }

    public void setOwner(com.Hometract.Hometract.entities.owner owner) {
        this.owner = owner;
    }

    public com.Hometract.Hometract.entities.property getProperty() {
        return property;
    }

    public void setProperty(com.Hometract.Hometract.entities.property property) {
        this.property = property;
    }

    public int getPayment_in_advance() {
        return payment_in_advance;
    }

    public void setPayment_in_advance(int payment_in_advance) {
        this.payment_in_advance = payment_in_advance;
    }

    public String getReason_of_use() {
        return reason_of_use;
    }

    public void setReason_of_use(String reason_of_use) {
        this.reason_of_use = reason_of_use;
    }

    public com.Hometract.Hometract.entities.tenant getTenant() {
        return tenant;
    }

    public void setTenant(com.Hometract.Hometract.entities.tenant tenant) {
        this.tenant = tenant;
    }
}
