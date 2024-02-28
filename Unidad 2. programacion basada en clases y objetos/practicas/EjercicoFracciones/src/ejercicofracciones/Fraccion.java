/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicofracciones;

/**
 *
 * @author Jairo F
 */
public class Fraccion {
    
    private int numerador;
    private int denominador;
    
    public Fraccion(){
       this(1,1);
    }
    
    public Fraccion (int n, int d){
        this.numerador = n;
        this.denominador = d;
    }
    
    public Fraccion (int n){
       this(n,1);
    }
    
    /**
     * @return the numerador
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * @param numerador the numerador to set
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * @return the denominador
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * @param denominador the denominador to set
     */
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    
    public String obtenerFraccion(){
        return this.getNumerador() + " / " + this.getDenominador();
    }
    
    public Fraccion sumar(Fraccion f){
        int numerador = (this.getDenominador()*f.getNumerador()) + (this.getNumerador()*f.getDenominador());
        int denominador = this.getDenominador() * f.getDenominador();
        Fraccion res = new Fraccion(numerador, denominador);
        return res;
        
    }

    
}
