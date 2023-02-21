package iestr.jmff.ejercicio13v2;

public class CuentaCorriente {
    private String numcuenta;
    private double saldo;

    private static int contador;

    public CuentaCorriente(double saldo) {
        this.saldo=saldo;
        this.numcuenta = new String(String.format("%010d",contador++));
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
        StringBuilder sb = new StringBuilder();

        sb.append("Número de cta: ");
        sb.append(numcuenta);
        sb.append(" Saldo: ");
        sb.append(saldo);
        sb.append("€");

        return sb.toString();
    }

}
