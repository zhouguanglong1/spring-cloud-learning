package com.zhougl.springcloudstreamrabbitmq.stream.bean;

/**
 * @author zhougl
 * 2019/2/2
 **/
public class Order {
    private String orderId;
    private Integer quantity;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
