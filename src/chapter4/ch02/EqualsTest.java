package chapter4.ch02;

public class EqualsTest {

    public static void main(String[] args) {
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");
        Student std3 = std1;

        System.out.println(std1 == std2); // 두 개의 주소값이 같냐고 물어보는 것
        System.out.println(std1 == std3);
        System.out.println(std1.equals(std2)); // 두 개의 주소값이 같냐고 물어보는 것

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode()); // 위에와 이거 둘 다 다른값 나옴.

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
    }
}
