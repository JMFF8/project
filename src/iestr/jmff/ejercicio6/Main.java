package iestr.jmff.ejercicio6;

public class Main {
    public static void main(String[] args){
        Tiempo t1=Tiempo.nuevoTiempo(1,40,53);
        Tiempo t2=Tiempo.nuevoTiempo(3,10,39);

        System.out.println("T1: "+t1);
        System.out.println("T2: "+t2);

        Tiempo t3=Tiempo.suma(t1,t2);
        System.out.println("T3 (T1+T2): "+t3);

        System.out.println("Contador de intervalos: "+Tiempo.getContador());
    }
}