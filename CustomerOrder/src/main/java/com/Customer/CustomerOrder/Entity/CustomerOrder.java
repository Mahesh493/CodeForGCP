package com.Customer.CustomerOrder.Entity;

import javax.persistence.*;

@Entity
@Table
public class CustomerOrder {

    @Id
    private String orderId;
    private String date;
    private String customerIdentificationNumber;
    private double total;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerIdentificationNumber() {
        return customerIdentificationNumber;
    }

    public void setCustomerIdentificationNumber(String customerIdentificationNumber) {
        this.customerIdentificationNumber = customerIdentificationNumber;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
