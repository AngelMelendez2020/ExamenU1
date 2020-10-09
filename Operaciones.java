package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {

    List<Integer> Lista = new ArrayList<Integer>();
    Scanner leer = new Scanner(System.in);
    int dato = 0;
    int ing;

    public void datos() {
        System.out.println("Ingresa 10 datos: ");

        do {
            dato = leer.nextInt();
            Lista.add(dato);
        } while (dato <= 9);

    }

    public void suma() {

        for (int j = 1; j <= 4; j++) {
System.out.println("Ingrese 3 datos de la lista que ingresó: ");
            ing = Lista.get(j);
            
            
            
        }

    }

    public void resta() {

    }

    public void multi() {

    }
}
