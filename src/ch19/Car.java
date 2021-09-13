package ch19;

public class Car {

    private static int serialNum = 1000;
    private int count;

    public Car() {
        serialNum++;
        count = serialNum;
    }

    public int getCarNum(){ return count; }

    public void setCarNum(int carNum) {
        this.count = carNum;
    }
}
