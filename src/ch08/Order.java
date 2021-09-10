package ch08;

public class Order {
    public String orderNumber;
    public String phoneNumber;
    public String address;
    public int currentData;
    public int time;
    public int thisPrice;
    public int menuNumber;

    public Order(){}

    public String orderInfo() {
        return "주문 접수 번호 : " + orderNumber + "\n" +
                "주문 핸드폰 번호 : " + phoneNumber + "\n" +
                "주문 집 주소 : " + address + "\n" +
                "주문 날짜 : " + currentData + "\n" +
                "주문 시간 : " + time + "\n" +
                "주문 가격 : " + thisPrice + "\n" +
                "메뉴 번호 : " + menuNumber+ "\n";
    }
}
