package ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

//    public VIPCustomer() {
////        super();  // 생성자 호출됨, 그런데 없어도 컴파일러가 넣어줌
//        super(0, null);  // 디폴트 생성자가 아닐 때는 현재 이 클래스의 생성자에서 부모 클래스의 생성자를 이렇게 불러주든
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int ID, String name) {
        super(ID, name);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) call");
    }

    public int getAgentID() {
        return agentID;
    }
}
