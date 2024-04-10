/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioempleadopolimorfismo;

import java.util.ArrayList;

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
        
        ArrayList<Empleado> lista = new ArrayList();
        lista.add(new Vendedor(500, "Pablo", "123", 10000));
        lista.add(new Secretario(700, "Ricardo", "987", 15000));
        
        imprimirListaEmpleados(lista);
                
    }
    
    public static void imprimirListaEmpleados(ArrayList<Empleado> listaEmpleados){
        for(Empleado e: listaEmpleados){
            System.out.println(e);
            System.out.println("Nuevo salario=" + e.incrementarSalario());
            System.out.println("-----------------------------------------");
        }
    }
    
}
