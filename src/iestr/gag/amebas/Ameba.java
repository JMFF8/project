package iestr.gag.amebas;

public class Ameba {
    int peso;

    public Ameba(){
        this.peso=3;
    }

    public void come(int cantidad){
        peso+=cantidad-1;
    }
    public void come(Ameba presa){
        come(presa.peso);
        presa.peso=0;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso "+peso+" microgramos.";
    }
}
