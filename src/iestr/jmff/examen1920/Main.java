package iestr.jmff.examen1920;

import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean terminar=false;
        String opcion;

        int id;
        String cliente;
        double importe;
        Factura factura;
        Factura[] facturas= new Factura[Factura.TOPE];//Creación de ARRAY

        int pendientes;
        do{
            System.out.println("\n1)CreaFactura 2)ModificaImporte 3)Abona 4)Lista 5)Resumen 6)Morosos");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Introduce cliente e importe (en dos líneas)");
                    cliente = sc.nextLine();
                    importe = solicitaImporte();
                    sc.nextLine();
                    factura = Factura.nuevaFactura(cliente, importe);//Creación
                    if (factura == null) {
                        System.out.println("ERROR: No se pueden crear más facturas");
                    } else {
                        System.out.println("...creando factura... OK: " + factura);
                        facturas[Factura.getContador() - 1] = factura;//-1 ya que la dirección del array debe ser uno menos al empezar en 0
                    }
                    break;
                case "2":
                    System.out.println("Introduce Id de la factura y nuevo importe (en dos líneas)");

                    id = solicitaID();
                    if (id > Factura.getContador()) {
                        System.out.println("Esa factura no existe");
                    } else {
                        importe = solicitaImporte();
                        if (!facturas[id - 1].setImporteNeto(importe)) {
                            System.out.println("...modificando importe... ERROR: No se ha podido modificar (Ya se ha abonado)");
                        } else {
                            System.out.println("...modificando importe... OK");
                        }
                        ;
                    }

                    break;
                case "3":
                    System.out.println("Introduce Id de la factura");
                    id = solicitaID();
                    if (id > Factura.getContador()) {
                        System.out.println("Esa factura no existe");
                    } else {
                        if (facturas[id - 1].Abonar()) {
                            System.out.println("...abonando factura... OK: " + facturas[id - 1]);
                        } else {
                            System.out.println("ERROR: No se ha podido abonar la factura " + facturas[id - 1]);
                        }
                    }

                    break;
                case "4":
                    for (int i = 0; i < Factura.getContador(); i++) {
                        System.out.println(facturas[i]);
                    }

                    break;
                case "5":
                    System.out.println("Facturas abonadas ("+ Factura.getContadorPagadas() +") --> "+ Factura.getImportePagadas() +"€");
                    System.out.println("Facturas pendientes ("+ Factura.getContadorPendientes() +") --> "+ Factura.getImportePendientes() +"€");

                    break;
                case "6":
                    for(int i=0; i<Factura.getContador();i++){
                        if(!facturas[i].isAbonada()){
                            System.out.print("| "+facturas[i].getCliente()+" |");
                        }
                    }

                    break;
                default://Si elige cualquier otra opción se termina el programa
                    terminar = true;
                    System.out.println("Saliendo...");
                    break;
            }
        }while(!terminar);
    }




    private static double solicitaImporte(){
        double importe;
        while(!sc.hasNextDouble()) sc.next();
        while((importe=sc.nextDouble())<0) sc.next();

        return importe;
    }

    private static int solicitaID(){
        int id;
        while(!sc.hasNextInt()) sc.next();
        while((id=sc.nextInt()) <1) sc.next();
        sc.nextLine();
        return id;
    }
}
