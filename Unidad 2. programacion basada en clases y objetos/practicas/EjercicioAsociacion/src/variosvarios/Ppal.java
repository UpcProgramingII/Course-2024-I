/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variosvarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jairo F
 */
public class Ppal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Cuenta cuentaA = new Cuenta(0, 0, LocalDate.now());
        Cuenta cuentaB = new Cuenta(500, 50000, LocalDate.of(2024, 3, 5));
        
        System.out.print("Nombre: ");
        String nombre = entrada.next();
        System.out.print("Apellido: ");
        String apellido = entrada.next();
        System.out.print("Id: ");
        String id = entrada.next();
        
        Cliente clienteA = new Cliente(nombre, apellido, id);
        
        Cliente clienteB = new Cliente();
        System.out.print("Nombre: ");
        clienteB.setNombre(entrada.next());
        System.out.print("Apellido: ");
        clienteB.setApellido(entrada.next());
        System.out.print("Id: ");
        clienteB.setId(entrada.next());
        
        cuentaA.agregarTitular(clienteA);
        clienteA.agregarCuenta(cuentaA);
        cuentaA.agregarTitular(clienteB);
        clienteB.agregarCuenta(cuentaA);
        
        cuentaB.agregarTitular(clienteA);
        clienteA.agregarCuenta(cuentaB);
        
        System.out.println("Info cliente A");
        System.out.println(clienteA);
        System.out.println("---------------");
        System.out.println("Info cliente B");
        System.out.println(clienteB);
        System.out.println("Info cuenta A");
        System.out.println(cuentaA);
        System.out.println("Info cuenta B");
        System.out.println(cuentaB);
        
        
    }
    
}
