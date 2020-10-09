package Main;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Operaciones obj = new Operaciones();

        obj.datos();

        int opcion;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("¿Qué operación deseas realizar? ");
            System.out.println("1.-Suma");
            System.out.println("2.-Resta");
            System.out.println("3.-Multiplicar");
            System.out.println("4.-Salir");

            System.out.println("¿Qué quieres hacer?: ");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    obj.suma();
                    break;
                 case 2:
                    obj.resta();
                    break;
                 case 3:
                     obj.multi();
                     break;
            }
           
            

        } while (opcion != 0 && opcion != 4);

    }
}
