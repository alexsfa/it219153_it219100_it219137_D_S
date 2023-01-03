package com.Hometract.Hometract.entities;

import com.Hometract.Hometract.entities.owner;
import com.Hometract.Hometract.entities.property;

import java.util.Date;

public class contract {
    private property Property;
    private Date startDate;
    private Date endDate;
    private Date creationDate;
    private String specialTerms;
    private owner contractOwner;
    private int payment_in_advance;
    private String reason_of_use;

    public contract(property property,
                    Date startDate,
                    Date endDate,
                    Date creationDate,
                    String specialTerms,
                    owner contractOwner,
                    int payment_in_advance,
                    String reason_of_use)
    {
        Property = property;
        this.startDate = startDate;
        this.endDate = endDate;
        this.creationDate = creationDate;
        this.specialTerms = specialTerms;
        this.contractOwner = contractOwner;
        this.payment_in_advance = payment_in_advance;
        this.reason_of_use = reason_of_use;
    }

    @Override
    public String toString() {
        return "contract{" +
                "Property=" + Property +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", creationDate=" + creationDate +
                ", specialTerms='" + specialTerms + '\'' +
                ", contractOwner=" + contractOwner +
                ", payment_in_advance=" + payment_in_advance +
                ", reason_of_use='" + reason_of_use + '\'' +
                '}';
    }

    public property getProperty() {
        return Property;
    }

    public void setProperty(property property) {
        Property = property;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getSpecialTerms() {
        return specialTerms;
    }

    public void setSpecialTerms(String specialTerms) {
        this.specialTerms = specialTerms;
    }

    public owner getContractOwner() {
        return contractOwner;
    }

    public void setContractOwner(owner contractOwner) {
        this.contractOwner = contractOwner;
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
}
