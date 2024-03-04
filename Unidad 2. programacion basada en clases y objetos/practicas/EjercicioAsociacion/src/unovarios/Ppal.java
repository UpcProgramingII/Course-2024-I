/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unovarios;

import java.time.LocalDate;

/**
 *
 * @author Jairo F
 */
public class Ppal {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jairo", "Seoanes", "123");
        Cuenta c1 = new Cuenta(0, 1000, LocalDate.now());
        Cuenta c2 = new Cuenta(500, 20000, LocalDate.of(2024, 3, 3));
        cliente.agregarCuenta(c1);
        cliente.agregarCuenta(c2);
        System.out.println("Info Cliente: ");
        System.out.println("-------------------------------");
        System.out.println(cliente);
        
    }
    
}
