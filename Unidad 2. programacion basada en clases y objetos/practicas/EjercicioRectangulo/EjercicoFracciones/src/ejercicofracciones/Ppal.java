/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicofracciones;

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
        
        Fraccion a = new Fraccion();
        System.out.println("a = " + a.obtenerFraccion());
        
        Fraccion b = new Fraccion(5,3);
        System.out.println("b = " + b.obtenerFraccion());
        
        Fraccion c = new Fraccion(7);
        System.out.println("c = " + c.obtenerFraccion());
        
        Fraccion suma = a.sumar(b);
        System.out.println("suma (a+b) = " + suma.obtenerFraccion());
        
    }
    
}
