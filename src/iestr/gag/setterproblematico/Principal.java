/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iestr.gag.setterproblematico;

/**
 *
 * @author krip
 */
public class Principal {
    public static void main(String[] args) {
        Componente c1=new Componente("teclado", 15.00f);
        Componente c2=new Componente("memoria", 93.00f);
        Componente c3=new Componente("monitor", 120.00f);
        Componente c4=new Componente("ssd", 101.00f);
        Componente c5=new Componente("grafica", 300.00f);
        Producto p=new Producto("Ordenador");
        p.setC1(c1);
        p.setC2(c2);
        System.out.println(p);
        System.out.println("----------------------");
        c2.setPrecio(3500.0f);
        System.out.println(p);
    }
}
