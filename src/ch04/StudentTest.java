package ch04;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(); // 자바에서는 객체를 사용할 때 생성자를 사용해야한다.( new Student() )
        studentLee.studentID = 12345;
//        studentLee.setStudentName("Jung");
        studentLee.studentName = "Lee";
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
//        studentKim.setStudentName("Jung");
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();
    }
}
