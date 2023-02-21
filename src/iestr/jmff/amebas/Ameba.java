package iestr.jmff.amebas;

public class Ameba {
    private int peso;

    public Ameba(){
        this.peso=3;
    }

    public void come(int cantidad){
        this.peso+=cantidad-1;
    }

    public boolean come(Ameba presa){
        if(this.peso<presa.peso){
            return false;
        }else{
            come(presa.peso-1);
            presa.peso=0;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso "+ peso +" microgramos.";
    }

}
