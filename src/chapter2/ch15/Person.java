package chapter2.ch15;

public class Person {
    int money;
    String name;

    public Person(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public void texiTake (Texi texi) {
        texi.take(10000);
        this.money -= 10000;
    }

    public void show() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
