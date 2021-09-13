package chapter2.ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        /*

        Company는 외부에서 생성할 수 없고 getInstance 메서드만 제공되고 있기 때문에 이 메서드로 생성할 수 있다.

        */

        Company company1 = Company.getInstance(); // static인 경우에는 클래스 이름으로 가져다 써야한다.
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
    }
}
