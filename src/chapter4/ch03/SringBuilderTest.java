package chapter4.ch03;

public class SringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        StringBuilder buffer = new StringBuilder(java);
        buffer.append(android);
        System.out.println(System.identityHashCode(java));

        String test = buffer.toString();
        System.out.println(test);
    }
}
