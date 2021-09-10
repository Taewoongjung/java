package ch08;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Kim", 20, 180, 70);
        System.out.println(driver.showInfo());

        Order order = new Order();
        order.orderNumber = "202011020003";
        order.phoneNumber = "01023450001";
        order.address = "서울시 강남구 역삼동 111-333";
        order.currentData = 20201102;
        order.time = 130258;
        order.thisPrice = 35000;
        order.menuNumber = 0003;
        System.out.println(order.orderInfo());

    }
}
