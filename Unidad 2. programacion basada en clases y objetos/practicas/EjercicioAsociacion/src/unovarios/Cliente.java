/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unovarios;

import java.util.ArrayList;

/**
 *
 * @author Jairo F
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private ArrayList<Cuenta> cuentas;

    public Cliente() {
        this.cuentas = new ArrayList();
    }

    public Cliente(String nombre, String apellido, String id) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the cuentas
     */
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * @param cuentas the cuentas to set
     */
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{\n" + 
               "\tnombre=" + nombre + ",\n" + 
               "\tapellido=" + apellido + ",\n"+
               "\tid=" + id +",\n"+
               "\tCuentas:\n" + 
               "\t"+this.cuentas+
               "\n}";
    }
    
   public void agregarCuenta(Cuenta cuenta){
       this.cuentas.add(cuenta);
   }
    
    
}
