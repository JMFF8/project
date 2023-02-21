package iestr.gag.ci;

public class TarjetaRegalo {
    public static final int MIN=10000;
    public static final int MAX=10004;
    private int id;
    private float saldo;
    private static int contador=0;

    private TarjetaRegalo(float saldo) {
        this.saldo = saldo;
        this.id=10000+contador;
        contador++;
    }

    public static TarjetaRegalo nuevaTarjeta(float saldo){
        if(MIN+contador>MAX){
            return null;
        }else{
            return new TarjetaRegalo(saldo);
        }
    }

    public void gasta(float importe){
        if(importe>saldo){
            System.out.printf("No tiene suficiente saldo para gastar %.2f\n",importe);
        }else{
            saldo-=importe;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otra){
        TarjetaRegalo nueva=nuevaTarjeta(this.saldo+otra.saldo);
        if(nueva!=null){
            this.saldo=0;
            otra.saldo=0;
        }
        return nueva;
    }

    @Override
    public String toString() {
        String saldoTexto=String.format("%.2f€",saldo);
        return "("+contador+")Tarjeta nº "+id+" – Saldo "+saldoTexto;
    }


}
