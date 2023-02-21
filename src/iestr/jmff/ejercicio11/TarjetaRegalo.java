package iestr.jmff.ejercicio11;

import java.util.Random;

public class TarjetaRegalo {
    private int id;
    private float saldo;
    private static Random generador=new Random();

    public TarjetaRegalo(float saldo) {
        this.saldo = saldo;
        this.id = generador.nextInt(1,99999);

    }

    public void gasta(float cantidad){
        if(this.saldo<cantidad){
            System.out.printf("No tiene suficiente saldo para gastar %.2f",cantidad);
        }else{
            this.saldo-=cantidad;
        }

    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otra){
        TarjetaRegalo nueva=new TarjetaRegalo(this.saldo+ otra.saldo);
        this.saldo=0;
        otra.saldo=0;
        return nueva;
    }

    @Override
    public String toString(){
        String saldoTexto=String.format("%.2f€",saldo);
        return "Tarjeta nº" +id+ " - "+saldoTexto;
    }
}
