/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacionparcial;

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
        
        Grupo A = new Grupo("A");
        Grupo B = new Grupo("B");
        Grupo C = new Grupo("C");
        
        Estudiante luis = new Estudiante("Luis", "Perez", 15, 'M', 2.5);
        Estudiante carlos = new Estudiante("Carlos", "Lopez", 20, 'M', 4.2);
        Estudiante jorge = new Estudiante("Jorge", "Acosta", 17, 'M', 4);
        Estudiante maria = new Estudiante("Maria", "Cotes", 25, 'F', 3);
        Estudiante eva = new Estudiante("Eva", "Ruiz", 22, 'F', 4);
        Estudiante luis2 = new Estudiante("Luis", "Perez", 15, 'M', 2.5);
        Estudiante eva2 = new Estudiante("Eva", "Ruiz", 22, 'F', 4);
        
        A.agregarElemento(luis);
        A.agregarElemento(carlos);
        A.agregarElemento(eva);
        A.agregarElemento(luis2);
         
        B.agregarElemento(jorge); 
        B.agregarElemento(maria); 
        B.agregarElemento(eva); 
        B.agregarElemento(eva2); 
        
        C.agregarElemento(luis); 
        C.agregarElemento(carlos); 
        
        A.pertenencia(luis2);
        A.pertenencia(C);
        A.union(B);
        A.interseccion(B);
        A.diferencia(B);
        
        
        
        
    }
    
}
