/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioempleadopolimorfismo;

/**
 *
 * @author Jairo F
 */
public class Secretario extends Empleado {
    
    private double bonificacion;

    public Secretario() {
    }

    public Secretario(double bonificacion, String nombre, String cedula, double salario) {
        super(nombre, cedula, salario);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return "Secretario{" + super.toString() + 
               ", bonificacion=" + bonificacion + 
               ", incremento salario="+this.incrementarSalario() + '}';
    }

    @Override
    public double incrementarSalario() {
        return this.getSalario() + this.bonificacion;
    }
    
    
    
}
