/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacionparcial;

import java.util.ArrayList;

/**
 *
 * @author Jairo F
 */
public class Grupo {
    private String nombre;
    private ArrayList<Estudiante> elementos;

    public Grupo() {
        this.elementos= new ArrayList();
    }

    public Grupo(String nombre) {
        this();
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the elementos
     */
    public ArrayList<Estudiante> getElementos() {
        return elementos;
    }

    /**
     * @param elementos the elementos to set
     */
    public void setElementos(ArrayList<Estudiante> elementos) {
        this.elementos = elementos;
    }
    
    // buscar un elemento con el mismo estado en el grupo
    // retorna [true-> encontrado ,  false-> no encontrado]
    public boolean buscarElemento(Estudiante elemento){
        for(Estudiante e: this.elementos){
            if(e.compararEstado(elemento)){
                return true;
            }
        }
        return false;
    }
    
    // imprime si elemento pertenece al grupo
    public void pertenencia(Estudiante elemento){
        
        boolean pertenece = this.buscarElemento(elemento);
        if(pertenece){
            System.out.println(elemento + " pertenece a " + this.nombre);
        }
        else{
            System.out.println(elemento + " no pertenece a " + this.nombre);
        }
        
    }
    
    // imprime si elementos es un subconjunto del grupo
    public void pertenencia(Grupo grupo){
        
    }
    
    //agrega un elemento al conjunto
    //verifica que el elemento no pertenezca al conjunto
    // imprime "agregado" o "no agregado" segun el resultado
    public void agregarElemento(Estudiante elemento){
        boolean pertenece = this.buscarElemento(elemento);
        if(pertenece){
            System.out.println(elemento + " no agregado a " + this.nombre);
        }
        else{
                this.elementos.add(elemento);
                System.out.println(elemento + " agregado a " + this.nombre);
        }
    }
    
    // imprime el grupo resultado de la union con g
    public void union(Grupo g){
        
    }
    
    // imprime el grupo resultado de la interseccion con g
    public void interseccion(Grupo g){
        
    }
    
    // imprime el grupo resultado de la diferencia con g
    public void diferencia(Grupo g){
        
    }
    
}
