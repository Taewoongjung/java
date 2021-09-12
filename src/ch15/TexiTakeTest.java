package ch15;

public class TexiTakeTest {
    public static void main(String[] args) {
        Person edw = new Person(20000, "Edward");

        Texi texi = new Texi("잘 간다 운수");
        edw.texiTake(texi);

        edw.show();
        texi.show();

    }
}
