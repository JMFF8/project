package iestr.gag.banco;

import java.util.Random;

public class CuentaCorriente {
    private double saldo;
    private long id;
    private static Random r=new Random();

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        id=r.nextLong(1,10000000000L);
    }

    public CuentaCorriente(){
        this(0.0f);
    }

    public void ingreso(double cantidad){
        saldo+=cantidad;
    }

    public void cargo(double cantidad){
        saldo-=cantidad;
    }

    public void transferencia(CuentaCorriente destino, double cantidad){
        this.cargo(cantidad);//this.saldo-=cantidad;
        destino.ingreso(cantidad);//destino.saldo+=cantidad;
    }

    @Override
    public String toString() {
        return "Número de cta: "+ String.format("%010d",id) +" Saldo: "+ String.format("%.2f€",saldo);
    }
}
