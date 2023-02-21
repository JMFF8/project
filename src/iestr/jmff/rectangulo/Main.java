package iestr.jmff.rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4,2);
        System.out.println(r1);
        Rectangulo r2 = new Rectangulo(6,3);
        System.out.println(r2);
        Rectangulo r3 = new Rectangulo(10,5);
        System.out.println(r3);
        r2.girar();
        System.out.println(r2);
    }
}
