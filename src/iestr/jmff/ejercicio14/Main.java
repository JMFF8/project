package iestr.jmff.ejercicio14;

public class Main {
    public static void main(String[] args) {
        FichaDomino f1 = FichaDomino.nuevaFicha(6, 1);
        FichaDomino f2 = FichaDomino.nuevaFicha(0, 4);
        FichaDomino f3 = FichaDomino.nuevaFicha(3, 3);
        FichaDomino f4 = FichaDomino.nuevaFicha(0, 1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
    }
}
