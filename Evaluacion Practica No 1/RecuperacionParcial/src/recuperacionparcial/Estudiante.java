/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacionparcial;

import java.util.Objects;

/**
 *
 * @author Jairo F
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private double promedioNotas;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, char sexo, double promedioNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.promedioNotas = promedioNotas;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the promedioNotas
     */
    public double getPromedioNotas() {
        return promedioNotas;
    }

    /**
     * @param promedioNotas the promedioNotas to set
     */
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    @Override
    public String toString() {
        return " " + nombre + " ";
    }

    // comparar estado con otro estudiante 
    // retorno [true->mismo estado, false-> estado diferente]
    public boolean compararEstado(Estudiante otroEstudiante){
        if(!otroEstudiante.nombre.equals(nombre))
            return false;
        if(!otroEstudiante.apellido.equals(apellido))
            return false;
        if(otroEstudiante.edad!=edad)
            return false;
        if(otroEstudiante.sexo!=sexo)
            return false;
        if(otroEstudiante.promedioNotas!=promedioNotas)
            return false;
        
        return true;
    }
    
    
    
    
}
