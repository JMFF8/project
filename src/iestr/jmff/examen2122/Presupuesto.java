package iestr.jmff.examen2122;

public class Presupuesto {
    private float nominas;
    private float licencias;
    private float horasExtra;
    private float imprevistos;

    public Presupuesto(float nominas, float licencias, float horasExtra, float imprevistos) {
        this.nominas = positiviza(nominas);
        this.licencias = positiviza(licencias);
        this.horasExtra = positiviza(horasExtra);
        this.imprevistos = positiviza(imprevistos);

        actualizaTotal();
    }

    private Presupuesto copia(){

    }

    private void actualizaTotal() {
    //@ToDo
    }

    private float positiviza(float original){
        if(original>0) return original;
        else return 1;
    }

    public void incrementa(int dias, int incremento){
        float nominaDiaria=nominas/dias*1.f;
        nominas=nominaDiaria*(dias+incremento);
        float licenciaDiaria=licencias/dias*1.f;
        licencias=licenciaDiaria*(dias+incremento);
        float horaExtraDiaria=horasExtra/dias*1.f;
        horasExtra=horaExtraDiaria*(dias+incremento);
        float imprevistosDiarios=imprevistos/dias*1.f;
        imprevistos=imprevistosDiarios*(dias+incremento);

    }

    public float getImprevistos() {
        return imprevistos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Presupuesto: ").append("\n\t\tNóminas: ").append(String.format("%.2f",nominas));
        sb.append("\n\t\tLicencias: ").append(String.format("%.2f",licencias));
        sb.append("\n\t\tHoras Extra: ").append(String.format("%.2f",horasExtra));
        sb.append("\n\t\tImprevistos: ").append(String.format("%.2f",imprevistos));

        return sb.toString();
    }

}
