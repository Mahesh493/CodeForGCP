package com.Payment.OMS.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderProduct {

    @Id
    private String orderProductId;
    private String orderId;
    private String productId;
    private int quantity;
    @OneToOne(mappedBy = "orderProduct")
    private Product product;

    public String getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(String orderProductId) {
        this.orderProductId = orderProductId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
