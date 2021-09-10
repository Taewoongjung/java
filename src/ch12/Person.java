package ch12;

public class Person {

    String name;
    int age;

    public Person() {
        this("no name", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + "," + age);
    }

    public Person getPerson() { // 현재 class의 생성자를 불러온다.
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();
        System.out.println(person);

        Person person2 = person.getPerson();
        person2.showPerson();
        System.out.println(person2);
    }
}
