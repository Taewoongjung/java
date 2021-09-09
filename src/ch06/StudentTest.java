package ch06;

public class StudentTest { // Object를 가져다 쓰는 코드를 클라이언트 코드라고 한다.
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.grade = 1;
        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(123456, "Kim", 3);
        System.out.println(studentKim.showStudentInfo());
    }
}
