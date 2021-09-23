package chapter05.ch04;

import chapter05.ch02.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if( isFull() ) {
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public boolean isFull() {

        if( top == arrayStack.ARRAY_SIZE) {
            return true;
        }
        else return false;
    }

}
