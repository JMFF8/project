package iestr.jmff.ejercicio13v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String PREGUNTA= "\n1) Dar de alta una cuenta sin saldo\n2) Dar de alta una cuenta con un saldo inicial\n4) Hacer un cargo\n5) Hacer un traspaso\n6) Mostrar el estado de las cuentas\n7) Mostrar los movimientos de una cuenta\n0) Salir";
        final String PEDIRSALDO= "\nIntroduce el saldo de la cuenta: ";
        final String PEDIRIMPORTE= "\nIntroduce el importe: ";
        final String PEDIRORIGEN= "\nIntroduce el ID de la cuenta origen: ";
        final String PEDIRDESTINO= "\nIntroduce el ID de la cuenta destino: ";
        final String CREACIONEXITOSA= "\nLa cuenta se ha creado correctamente";

        int opcion;

        do {
            System.out.println(PREGUNTA);
            opcion = sc.nextInt();

            switch (opcion){
                case 0:{
                    break;
                }
                case 1:{
                    new CuentaCorriente();
                    System.out.println(CREACIONEXITOSA);
                    break;
                }
                case 2:{
                    System.out.println(PEDIRSALDO);
                    double saldo = sc.nextDouble();
                    new CuentaCorriente(saldo);
                    System.out.println(CREACIONEXITOSA);
                    break;
                }
                case 3:{
                    System.out.println(PEDIRORIGEN);

                }
                case 4:{

                }
                case 5:{

                }
                case 6:{
                    System.out.println();
                }
                case 7:{

                }
            }
        }while (opcion!=0);
    }
}
