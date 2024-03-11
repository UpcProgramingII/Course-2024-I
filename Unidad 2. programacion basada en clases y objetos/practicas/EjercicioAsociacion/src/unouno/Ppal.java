/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unouno;

import java.time.LocalDate;

/**
 *
 * @author Jairo F
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente("Jairo", "Seoanes", "123");
        Cuenta cuenta = new Cuenta(0, 1000, LocalDate.now(), cliente);
        System.out.println("Cuenta: " + cuenta);
        Cliente nuevo = new Cliente("Pepito", "Perez","345");
        cuenta.setTitular(nuevo);
        System.out.println("Cuenta: " + cuenta);
        
    }
    
}
