package chapter2.ch06;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public  Student(){} // 디폴 생성자는 마음대로
    public Student(int studentNumber, String studentName, int grade) { // 생성자

        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {

        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}
