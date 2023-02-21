/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iestr.gag.setterproblematico;

import java.util.Arrays;

/**
 *
 * @author krip
 */
public class Producto {
    private String nombre;
    private Componente c1;
    private Componente c2;

    public Producto(String nombre) {
        this.nombre = nombre;
        c1=null;
        c2=null;
    }

    public String getNombre() {
        return nombre;
    }

    public Componente getC1() {
        return c1;
    }

    public void setC1(Componente c1) {
        if(c1.getPrecio()>100){
            System.out.println("No se aceptan precios mayores de 100");
            return;
        }
        //this.c1=c1;
        this.c1 =new Componente(c1);
    }

    public Componente getC2() {
        return c2;
    }

    public void setC2(Componente c2) {
        if(c2.getPrecio()>100){
            System.out.println("No se aceptan precios mayores de 100");
            return;
        }
        //this.c2=c2;
        this.c2 = new Componente(c2);
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("Producto: ");
        sb.append(nombre);
        sb.append("\n\t").append(c1);
        sb.append("\n\t").append(c2);
        float precio=0f;
        if(c1!=null) precio+=c1.getPrecio();
        if(c2!=null) precio+=c2.getPrecio();
        sb.append(String.format("\n\t%.2f€",precio));
        return sb.toString();
    }
    
    
}
