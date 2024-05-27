/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jairo F
 */
public class Lector {

    private static Scanner scanner = new Scanner(System.in);

    public static int leerInt(String titulo) {
        int valor=0;
        boolean excepcion;
        do {
            
            try {
                System.out.print(titulo);
                valor = scanner.nextInt();
                excepcion = false;
                
            } catch (InputMismatchException ime) {
                System.out.println("Error: Se requiere un valor numerico");
                scanner.nextLine();
                excepcion=true;
            }
        } while (excepcion);
        return valor;
    }

}
