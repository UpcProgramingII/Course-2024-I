/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Alojamiento;
import entidades.Cabaña;
import entidades.Cotizacion;
import entidades.Habitacion;
import java.time.LocalDate;
import persistencia.ICrudRegistroAlojamiento;
import persistencia.RegistroAlojamientoImplArrayList;

/**
 *
 * @author Jairo F
 */
public class Logica {
    
    private ICrudRegistroAlojamiento persistencia;

    public Logica() {
        this.persistencia = new RegistroAlojamientoImplArrayList();
    }
    
    public Alojamiento crearAlojamiento(int codigo, String dir, String ciudad, String pais, int valor, int tipo){
        
        switch (tipo) {
            case 1:
                return new Habitacion(valor, codigo, dir, ciudad, pais);
               
            case 2:
                return new Cabaña(valor, codigo, dir, ciudad, pais);
               
            default: return null;
        }
        
    }
    
    public boolean registrarAlojamiento(Alojamiento alojamiento){
        
        return this.persistencia.agregarAlojamiento(alojamiento);
        
    }
    
    
    public Cotizacion crearCotizacion(LocalDate inicio, LocalDate fin, Alojamiento alojamiento){
        
        return new Cotizacion(inicio, fin, alojamiento);
        
    }
    
    public Alojamiento buscarAlojamiento(int codigo){
        
        return this.persistencia.buscar(codigo);
        
    }
    
    
}
