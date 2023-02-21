package iestr.gag.ci;

public class Main {
    public static void main(String[] args) {
        TarjetaRegalo t1 = TarjetaRegalo.nuevaTarjeta(100);
        TarjetaRegalo t2 = TarjetaRegalo.nuevaTarjeta(120);
        System.out.println(t1);
        System.out.println(t2);
        t1.gasta(45.90f);
        t2.gasta(5);
        t2.gasta(200);
        t1.gasta(3.55f);
        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        TarjetaRegalo t4 = TarjetaRegalo.nuevaTarjeta(400);
        TarjetaRegalo t5 = TarjetaRegalo.nuevaTarjeta(500);
        TarjetaRegalo t6 = t4.fusionaCon(t5);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
    }
}