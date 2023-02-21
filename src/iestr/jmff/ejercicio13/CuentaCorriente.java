package iestr.jmff.ejercicio13;

import java.util.Random;

public class CuentaCorriente {
    private long numcuenta;
    private double saldo;

    private static Random generador = new Random();


    public CuentaCorriente(double saldo) {
        this.saldo=saldo;
        this.numcuenta = generador.nextLong(1, 10000000000L);
    }

    public CuentaCorriente() {
        this(0);
    }


    public void ingreso(double cantidad){
        this.saldo+=cantidad;
    }


    public void cargo(double cantidad){
        this.saldo-=cantidad;
    }


    public void transferencia(CuentaCorriente destino, double cantidad){
        this.cargo(cantidad);
        destino.ingreso(cantidad);
    }



    @Override
    public String toString() {
        return "Número de cta: "+ numcuenta +" Saldo: "+ saldo +"€";
    }

}
