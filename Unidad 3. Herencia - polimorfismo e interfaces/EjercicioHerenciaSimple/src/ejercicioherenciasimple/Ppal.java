/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioherenciasimple;

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
        
        Person jairo = new Person();
        System.out.println(jairo);
        System.out.println("--------------------");
        
        Doctor doctorJairo = new Doctor();
        System.out.println(doctorJairo);
        System.out.println("--------------------");
        
        Doctor doctorSobrecargado = new Doctor(234, "Pepito", "Perez", 30, "Cirujano", "HRPL");
        System.out.println(doctorSobrecargado);
        System.out.println("--------------------");
    }
    
}
