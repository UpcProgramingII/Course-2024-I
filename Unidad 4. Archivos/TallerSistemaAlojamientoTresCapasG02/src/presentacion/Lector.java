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

    public static int leerInt(String label) {

        int valor=0;
        boolean excepcion;
        do {
            try {
                System.out.print(label);
                valor = scanner.nextInt();
                excepcion = false;
            } catch (InputMismatchException ime) {
                System.out.println("Error: se requiere valor numerico");
                scanner.nextLine();
                excepcion = true;
            }
        } while (excepcion);
        return valor;
    }

}
