package iestr.gag.setterproblematico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krip
 */
public class Componente {
    private String nombre;
    private float precio;

    public Componente(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Componente(Componente c){
        this(c.nombre,c.precio);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  nombre + "(" + precio + "€)";
    }
    
}
