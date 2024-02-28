/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorectangulo;

/**
 *
 * @author Jairo F
 */
public class Rectangulo {
    
    private double base;
    private double altura;
    
    public static final String COLOR="ROJO";
    
    public Rectangulo(){
        this(5, 10);
    }
    
    public Rectangulo(double b, double a){
        this.altura=a;
        this.base=b;
    }
    
    public Rectangulo(double a){
        this(a,20);
    }
    
    
    
    
    public double getAltura(){
        return this.altura;
    }
    
    public double getBase(){
        return this.base;
    }
    
    public void setAltura(double a){
        this.altura=a;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    public double calcularPerimetro(){
        return 2 * (this.base+this.altura);
    }
}
