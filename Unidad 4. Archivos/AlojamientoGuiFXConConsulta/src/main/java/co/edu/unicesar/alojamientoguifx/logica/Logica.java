/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx.logica;


import co.edu.unicesar.alojamientoguifx.entidades.*;
import co.edu.unicesar.alojamientoguifx.excepciones.*;
import co.edu.unicesar.alojamientoguifx.persistencia.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jairo F
 */
public class Logica {
    
    private ICrudRegistroAlojamiento persistencia;

    public Logica() {
        this.persistencia = new ArchivoObjeto();
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
    
    
    public Cotizacion crearCotizacion(LocalDate inicio, LocalDate fin, Alojamiento alojamiento)
            throws ExcepcionFechaAlojamiento {
    
        if(inicio.isAfter(fin)){
            throw new ExcepcionFechaAlojamiento("La fecha fin no puede ser menor que la fecha inicio");
        }
        
        return new Cotizacion(inicio, fin, alojamiento);
        
    }
    
    public Alojamiento buscarAlojamiento(int codigo){
        
        return this.persistencia.buscar(codigo);
        
    }
    
    public List<Alojamiento> getAlojamientos(){
        
        return this.persistencia.obtenerAlojamientos();
        
    }
    
    
    
}
