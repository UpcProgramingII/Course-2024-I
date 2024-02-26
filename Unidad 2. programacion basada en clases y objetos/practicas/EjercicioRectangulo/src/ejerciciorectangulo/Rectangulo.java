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
        this.altura=10;
        this.base=5;
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
