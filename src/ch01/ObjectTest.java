package ch01;

import java.util.Scanner;

public class ObjectTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputIt = scanner.nextInt();
        String thisis = scanner.next();
        Order orderObject = new Order();
        orderObject.orderId = inputIt;
        orderObject.getId();
        orderObject.setProductId(12);
        orderObject.showOrder(thisis);
        orderObject.showALl();
    }
}
