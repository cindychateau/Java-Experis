import java.util.Scanner;
import java.util.InputMismatchException;
//import java.util.*;
public class NumeroAlCuadrado {

    public static void main(String[] args) {

        //Scanner: permite obtener información desde la terminal/teclado el usuario
        Scanner scan = new Scanner(System.in);
        int numero;
        boolean continuar;

        do {
            try {
                System.out.println("Ingresa un numero:");
                numero = scan.nextInt();
                int numeroAlCuadrado = numero*numero;
                System.out.println("El numero al cuadrado es:"+numeroAlCuadrado);
                continuar = false;
            } catch (InputMismatchException excepcion) {
                continuar = true;
                System.out.println("Debe ingresar un numero de manera obligatoria");
                scan.next();
            }
        } while(continuar);
        
        
        
    }

}