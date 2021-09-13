package chapter2.ch16;

public class Employee {

    private static int serialNum = 1000; // EmployeeTest에 있는 두 개의 인스턴스가 하나의 static으로 된 변수인 serialNum을 공유한다는 것을 알 수 있다.

    private int employeeId;
    private String employeeName;
    private String department;

    public static int getSerialNum() {

//        employeeName = "Lee";  // 에서는 인스턴스변수인 employeeName이 빨간줄이 뜬다. 이유는 간단하다. 메모리 문제이다. 일반 함수들에서는 사용가능하나 static함수는 아니다.
                               // 왜냐하면 일반함수들은 로드 될 때 메모리가 있는 상태이기 때문이다. 인스턴트가 생성되지 않은 상태에서 가져다 쓸 수 없다. 그러나 지역변수는 사용 가능하다.

        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

    public Employee() { // 일반함수에서는
        serialNum++;
        employeeId = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
