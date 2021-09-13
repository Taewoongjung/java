package chapter2.ch15;

public class Texi {
    int passengerCount;
    int money;
    String name;

    public Texi(String name) {
        this.name = name;
    }

    public void take (int pay) {
        this.money += pay;
        passengerCount++;
    }

    public void show () {
        System.out.println(name + "택시 수입은 " + money + "원 입니다.");
    }
}
