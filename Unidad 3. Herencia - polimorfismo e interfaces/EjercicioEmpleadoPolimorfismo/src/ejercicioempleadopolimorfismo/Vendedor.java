/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioempleadopolimorfismo;

/**
 *
 * @author Jairo F
 */
public class Vendedor extends Empleado {
    
    private double comision;

    public Vendedor() {
    }

    public Vendedor(double comision, String nombre, String cedula, double salario) {
        super(nombre, cedula, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Vendedor{"+ super.toString() + 
               ", comision=" + comision +
               ", incremento salario="+this.incrementarSalario() + '}';
    }

    @Override
    public double incrementarSalario() {
        return this.getSalario() + this.comision;
    }
    
    
    
}
