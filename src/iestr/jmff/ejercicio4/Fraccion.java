package iestr.jmff.ejercicio4;

public class Fraccion {
    int numerador;
    int denominador;

    private Fraccion(int numerador, int denominador){//Constructor
        this.numerador=numerador;
        this.denominador=denominador;
        simplifica();
    }

    public static Fraccion nuevaFraccion(int numerador, int denominador){//PseudoConstructor con comprobaciones
        Fraccion f;
        if(denominador==0){
            f=null;
        }else{
            f=new Fraccion(numerador, denominador);//llamada al constructor
        }
        return f;
    }

    @Override
    public String toString() {
        String resultado=""+numerador;
        if(numerador!=0 && denominador!=1) resultado+="/"+denominador;
        return resultado;
    }

    public void simplifica(){
        if(denominador<0){
            numerador=numerador*-1;
            denominador=denominador*-1;
        }

        int minimo=Math.min(Math.abs(numerador),Math.abs(denominador));
        int mcd=1;

        for(int i=2;i<=minimo;i++){
            if(numerador%i==0 && denominador%i==0){
                mcd=i;
            }
        }
        numerador = numerador / mcd;
        denominador = denominador / mcd;
    }

    public static Fraccion multiplica(Fraccion primera, Fraccion segunda){ //Crea una nueva fracción, producto de dos fracciones
        Fraccion resultado = new Fraccion(primera.numerador*segunda.numerador, primera.denominador*segunda.denominador);
        resultado.simplifica();
        return resultado;
    }

    public static Fraccion invierte(Fraccion original){
        Fraccion invertida;

        if(original.numerador==0){
            invertida=null;
        }else{
            invertida=nuevaFraccion(original.denominador, original.numerador);
        }

       return invertida;
    }

    public static Fraccion divide(Fraccion dividendo, Fraccion divisor){
        Fraccion resultado;

        Fraccion invertida=invierte(divisor);

        if(invertida==null){
            resultado=null;
        }else{
            resultado=multiplica(dividendo,invertida);
        }

        return resultado;
    }

    public static Fraccion suma(Fraccion sumando1, Fraccion sumando2){
        Fraccion resultado;

        resultado=nuevaFraccion(sumando1.numerador*sumando2.denominador + sumando1.denominador*sumando2.numerador, sumando1.denominador* sumando2.denominador);

        return resultado;
    }

    public static Fraccion resta(Fraccion sustraendo, Fraccion minuendo){
        Fraccion resultado;

        resultado=nuevaFraccion(sustraendo.numerador*minuendo.denominador - sustraendo.denominador*minuendo.numerador, sustraendo.denominador* minuendo.denominador);

        return resultado;
    }
}
