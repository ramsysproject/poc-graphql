package com.emramirez.pocs.graphql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class CustomerOrder {
    @Id
    @Column
    private Long id;
    @Column
    private LocalDateTime createdDate;
    @Column
    private String status;
    @Column
    private Integer billNumber;
    @Column
    private String billType;
    @Column
    private Long customerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(Integer billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
