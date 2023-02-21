package iestr.jmff.pizzeria;

public class Pizza {
    private static int pedidas=0;
    private static int servidas=0;

    private String tipo;
    private String tamanio;
    private boolean servida;

    public Pizza(String tipo, String tamanio){
        this.tipo=tipo;
        this.tamanio=tamanio;
        this.servida=false;
        pedidas++;
    }

    public void sirve(){
        if(servida){
            System.out.println("Esta pizza ya se ha servido");
        }else{
            servida=true;
            servidas++;

        }
    }

    @Override
    public String toString(){
        return "pizza "+this.tipo+" ("+this.tamanio+") Servida: "+this.servida+".";
    }
    /////////////////////////////////////
    public static int getPedidas() {
        return pedidas;
    }

    public static int getServidas() {
        return servidas;
    }
}
