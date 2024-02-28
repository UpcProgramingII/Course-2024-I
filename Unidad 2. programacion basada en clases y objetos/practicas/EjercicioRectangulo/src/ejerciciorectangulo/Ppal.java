/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorectangulo;

/**
 *
 * @author Jairo F
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo r = new Rectangulo();
        r.setAltura(30);
        imprimirRectangulo(r);
        
        Rectangulo r2 = new Rectangulo(50, 20);
        imprimirRectangulo(r2);
        
        Rectangulo r3 = new Rectangulo(30);
        imprimirRectangulo(r3);
    }
    
    public static void imprimirRectangulo(Rectangulo r){
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: "+r.getAltura());
        System.out.println("Color: "+Rectangulo.COLOR);
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro:" + r.calcularPerimetro());
        System.out.println("--------------------------------");
    }
    
}
