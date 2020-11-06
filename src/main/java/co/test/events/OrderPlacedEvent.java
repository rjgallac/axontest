package co.test.events;

import java.util.Objects;

public class OrderPlacedEvent {

    private  String orderId;
    private  String product;

    // default constructor, getters, equals/hashCode and toString


    public OrderPlacedEvent() {
    }

    public OrderPlacedEvent(String orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPlacedEvent that = (OrderPlacedEvent) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, product);
    }
}
