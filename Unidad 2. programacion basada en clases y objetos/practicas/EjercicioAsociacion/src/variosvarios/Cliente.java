/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variosvarios;

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
        this.cuentas = new ArrayList<>();
    }

    public Cliente(String nombre, String apellido, String id) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        
        String infoCuentas="";
        int n=1;
        for(Cuenta c: this.cuentas){
            infoCuentas = infoCuentas.concat("\t"+n+ " Saldo: " + c.getSaldo()+"\n");
            n++;
        }
        
        return "Cliente{\n" + 
                "\tnombre=" + nombre + "\n"+
                "\tapellido=" + apellido + "\n"+
                "\tid=" + id + "\n"+
                "\tcuentas:\n" + infoCuentas + "\n"+
                '}';
    }
    
    public void agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }
    
    
    
}
