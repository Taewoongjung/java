package chapter1.ch04;

public class BinaryTest {

    public static void main(String[] args) {

        int num = 10;
        int bNum = 0B1010;  // "0B"는 뒤에 나오는 것들은 2진수 라는 것을 알려준다
        int oNum = 012; // "0"은 8진수라는 것을 알려준다
        int xNum = 0XA; // "0X"는 16진수이다.

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);
    }
}
