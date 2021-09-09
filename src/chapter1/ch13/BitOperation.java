package chapter1.ch13;

public class BitOperation {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;

        System.out.println( num1 | num2 );
        System.out.println( num1 & num2 );
        System.out.println( num1 ^ num2 );
        System.out.println( ~num1 );
//        System.out.println( num1 << 2 );  // 5 x 2^2
        System.out.println( num1 <<= 2 );  // 5 x 2^2
        System.out.println( num1 );
    }
}
