/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variosvarios;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Jairo F
 */
public class Cuenta {
    
    private double saldo;
    private double limite;
    private LocalDate fechaApertura;
    private ArrayList<Cliente> titulares;
    
    public Cuenta() {
        this.titulares = new ArrayList();
    }

    public Cuenta(double saldo, double limite, LocalDate fechaApertura) {
        this();
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public ArrayList<Cliente> getTitulares() {
        return titulares;
    }

    public void setTitulares(ArrayList<Cliente> titulares) {
        this.titulares = titulares;
    }

    @Override
    public String toString() {
        String infoTitulares="";
        int n=1;
        for(Cliente t: this.titulares){
            infoTitulares = infoTitulares.concat("\t"+n+" " + t.getNombre() + " " + t.getApellido()+"\n");
            n++;
        }
        
        return "Cuenta{\n" + 
                "\tsaldo=" + saldo + "\n" +
                "\tlimite=" + limite + "\n" +
                "\tfechaApertura=" + fechaApertura + "\n" +
                "\ttitulares:\n" + infoTitulares + "\n" +
                '}';
    }
    
    public void agregarTitular(Cliente cliente){
        this.titulares.add(cliente);
    }
    
    
    
    
    
}
