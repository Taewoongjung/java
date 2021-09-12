package chapter2.ch08;

public class Driver {
    public String name;
    public int age;
    public int height;
    public int weight;

    public Driver(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String showInfo() {
        return "\n" + "키가 " + age + " 이고 몸무게가 " + weight + "킬로인 남성이 있습니다. " +
                "이름은 " + name + " 이고 나이는 " + age + "세입니다." + "\n";
    }
}
