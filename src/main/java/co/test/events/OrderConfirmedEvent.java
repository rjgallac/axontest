package co.test.events;

import java.util.Objects;

public class OrderConfirmedEvent {

    private String orderId;

    // default constructor, getters, equals/hashCode and toString


    public OrderConfirmedEvent() {
    }


    public OrderConfirmedEvent(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderConfirmedEvent that = (OrderConfirmedEvent) o;
        return Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}
