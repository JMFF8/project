package iestr.jmff.examen2122;

import java.util.Arrays;

public class Proyecto {
    private static int MAX_INCIDENCIAS=100;
    //Para utilizar como valores por defecto para un proyecto
    private static Presupuesto PRESUPUESTO_DEFECTO=new Presupuesto(50000,2000,10000,10000);
    private static int DIAS_DEFECTO=30;

    private final String nombre;
    private Presupuesto presupuesto;
    private int dias;
    private Incidencia incidencias[] = new Incidencia[MAX_INCIDENCIAS];
    private int contadorIncidencias=0;
    private float costeIncidencias=0f;

    public Proyecto(String nombre, Presupuesto presupuesto, int dias) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.dias = Math.max(1,dias);
    }



    public Proyecto(String nombre){
        this(nombre, PRESUPUESTO_DEFECTO, DIAS_DEFECTO);
    }


    ///////////////////////////////////////////////////////////////////////////
    public void prolongar(int incremento){
        if(incremento<=0) return;
        presupuesto.incrementa(dias,incremento);
        this.dias+=incremento;
    }

    public void registraIncidencia(String descripcion, float coste){
        coste=Math.max(0,coste);

        if(contadorIncidencias>MAX_INCIDENCIAS){
            System.out.printf("ERROR: No se puede registrar mas de %i incidencias\n",MAX_INCIDENCIAS);
            return;
        }
        if(costeIncidencias+coste>presupuesto.getImprevistos()){
            System.out.println("ERROR: No se puede registrar la incidencia por falta de presupuesto");
            return;
        }

        Incidencia nueva = new Incidencia(contadorIncidencias+1,descripcion,coste);
        System.out.printf("\nRegistrando incidencia... %s",nueva);
        incidencias[contadorIncidencias]=nueva;
        contadorIncidencias++;
        costeIncidencias+=coste;

    }

    public void resuelveIncidencia(int id){
        if(id<=0 || id > MAX_INCIDENCIAS){
            System.out.println("ERROR: esa incidencia no existe ");
            return;
        }
        incidencias[id-1].resolver();
    }

    ///////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder(nombre.toUpperCase())
                .append("\n\tDuración: ").append(dias).append(" días")
                .append("\n\t").append(presupuesto)
                .append("\n\tIncidencias(").append(String.format("%.2f",costeIncidencias)).append("€)");
        for(int i=0;i<contadorIncidencias;i++){
            sb.append("\n\t\t").append(incidencias[i]);
        }
        return sb.toString();
    }

    ///////////////////////////////////////////////////////////////////////////
}
