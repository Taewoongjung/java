package chapter2.ch01;

public class Order {
    int orderId;
    String buyerId;
    String sellerId;
    int productId;
    String orderDate;

    public void showOrder(String letter) {
        System.out.println("뭐라하노 =  " + letter);
    }

    public void showALl() {
        System.out.println(
                "orderId = " + orderId +
                "buyerId = " + buyerId +
                "sellerId = " + sellerId +
                "productId = " + productId +
                "orderDate = " + orderDate
        );
    }

    public int getId(){
        return orderId;
    }
    public void setProductId(int put) {
        productId = put;
    }
}
