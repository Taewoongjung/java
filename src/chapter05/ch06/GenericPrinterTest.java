package chapter05.ch06;

public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

        powderPrinter.setMaterial(powder);
        plasticPrinter.setMaterial(plastic);

        Powder p = powderPrinter.getMaterial();
        Plastic pl = plasticPrinter.getMaterial();
    }
}
