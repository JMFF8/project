package iestr.jmff.ejercicio4;

import java.util.Scanner;

public class Main {
    public static final String CABECERA="Selecciona una de estas opciones:";
    public static final String OPC1="1) Invierte una fracción";
    public static final String OPC2="2) Sumar dos fracciones";
    public static final String OPC3="3) Restar dos fracciones";
    public static final String OPC4="4) Multiplicar dos fracciones";
    public static final String OPC5="5) Dividir dos fracciones";
    public static final String OPC6="6) Salir";

    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);

        do{
            int opcion;
            int numerador, denominador, numerador2, denominador2;

            muestraMenu();

            do {
                opcion = reader.nextInt();
            } while (opcion<1 || opcion>6);

            switch (opcion) {
                case 1: {
                    System.out.println("Introduce el numerador: ");
                    numerador = reader.nextInt();

                    System.out.println("Introduce el denominador: ");
                    denominador = reader.nextInt();

                    Fraccion f = Fraccion.nuevaFraccion(numerador,denominador);
                    System.out.println(f+"\n |\n V\n"+Fraccion.invierte(f));
                    break;
                }
                case 2: {
                    System.out.println("Introduce el numerador de la primera fracción: ");
                    numerador = reader.nextInt();

                    System.out.println("Introduce el denominador de la primera fracción: ");
                    denominador = reader.nextInt();

                    System.out.println("Introduce el numerador de la segunda fracción: ");
                    numerador2 = reader.nextInt();

                    System.out.println("Introduce el denominador de la segunda fracción: ");
                    denominador2 = reader.nextInt();

                    Fraccion f1 = Fraccion.nuevaFraccion(numerador, denominador);
                    Fraccion f2 = Fraccion.nuevaFraccion(numerador2, denominador2);
                    Fraccion f3 = Fraccion.suma(f1,f2);
                    System.out.println(f1 + " + " + f2 + " = " + f3);
                    break;
                }
                case 3: {
                    System.out.println("Introduce el numerador de la primera fracción: ");
                    numerador = reader.nextInt();

                    System.out.println("Introduce el denominador de la primera fracción: ");
                    denominador = reader.nextInt();

                    System.out.println("Introduce el numerador de la segunda fracción: ");
                    numerador2 = reader.nextInt();

                    System.out.println("Introduce el denominador de la segunda fracción: ");
                    denominador2 = reader.nextInt();

                    Fraccion f1 = Fraccion.nuevaFraccion(numerador, denominador);
                    Fraccion f2 = Fraccion.nuevaFraccion(numerador2, denominador2);
                    Fraccion f3 = Fraccion.resta(f1,f2);
                    System.out.println(f1 + " - " + f2 + " = " + f3);
                    break;
                }
                case 4: {
                    System.out.println("Introduce el numerador de la primera fracción: ");
                    numerador = reader.nextInt();

                    System.out.println("Introduce el denominador de la primera fracción: ");
                    denominador = reader.nextInt();

                    System.out.println("Introduce el numerador de la segunda fracción: ");
                    numerador2 = reader.nextInt();

                    System.out.println("Introduce el denominador de la segunda fracción: ");
                    denominador2 = reader.nextInt();

                    Fraccion f1 = Fraccion.nuevaFraccion(numerador, denominador);
                    Fraccion f2 = Fraccion.nuevaFraccion(numerador2, denominador2);
                    Fraccion f3 = Fraccion.multiplica(f1, f2);
                    System.out.println(f1 + " * " + f2 + " = " + f3);
                    break;
                }
                case 5: {
                    System.out.println("Introduce el numerador de la primera fracción: ");
                    numerador = reader.nextInt();

                    System.out.println("Introduce el denominador de la primera fracción: ");
                    denominador = reader.nextInt();

                    System.out.println("Introduce el numerador de la segunda fracción: ");
                    numerador2 = reader.nextInt();

                    System.out.println("Introduce el denominador de la segunda fracción: ");
                    denominador2 = reader.nextInt();

                    Fraccion f1 = Fraccion.nuevaFraccion(numerador, denominador);
                    Fraccion f2 = Fraccion.nuevaFraccion(numerador2, denominador2);
                    Fraccion f3 = Fraccion.divide(f1, f2);
                    System.out.println(f1 + " / " + f2 + " = " + f3);
                    break;
                }
                case 6: return;
            }
        }while (true);
    }

    private static void muestraMenu() {
        System.out.println(CABECERA + "\n" + OPC1 + "\n" + OPC2 + "\n" + OPC3 + "\n" + OPC4 + "\n" + OPC5 + "\n" + OPC6);
    }
}

