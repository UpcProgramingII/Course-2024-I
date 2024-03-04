/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unouno;

import java.time.LocalDate;


/**
 *
 * @author Jairo F
 */
public class Cuenta {
    private double saldo;
    private double limite;
    private LocalDate fechaApertura;
    private Cliente titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, double limite, LocalDate fechaApertura, Cliente titular) {
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
        this.titular = titular;
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

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", limite=" + limite + ", fechaApertura=" + fechaApertura + ", titular=" + titular + '}';
    }

    
    
}
