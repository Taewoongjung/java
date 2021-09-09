package ch07;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userLee = new UserInfo(); // 생성자로 인스턴스 생성
        userLee.userId = "a12345";
        userLee.userPassWord = "zxc123";
        userLee.userName = "Lee";
        userLee.phoneNumber = "01011111111";
        userLee.userAddress = "Seoul, Korea";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("b12345", "0987mba", "Jung"); // 다른 종류의 생성자로 다른 인스턴스를 생성
        System.out.println(userKim.showUserInfo());
    }
}
