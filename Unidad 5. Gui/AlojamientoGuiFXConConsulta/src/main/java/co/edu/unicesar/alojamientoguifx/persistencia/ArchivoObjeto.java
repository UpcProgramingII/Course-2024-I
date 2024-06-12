/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx.persistencia;

import co.edu.unicesar.alojamientoguifx.entidades.Alojamiento;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jairo F
 */
public class ArchivoObjeto implements ICrudRegistroAlojamiento {

    private File archivo;
    private FileOutputStream aEscritura;
    private FileInputStream aLectura;
    
    public ArchivoObjeto(String name){
        this.archivo = new File(name);
    }
    
    public ArchivoObjeto(){
        this("alojamientos.obj");
    }
    
    
    
    private ICrudRegistroAlojamiento leer(){
        
        ICrudRegistroAlojamiento coleccion = null;
        if(!this.archivo.exists()){
            return new RegistroAlojamientoImplArrayList();
        }
        ObjectInputStream ois = null;
        try {
            this.aLectura = new FileInputStream(this.archivo);
            ois = new ObjectInputStream(this.aLectura);
            coleccion = (ICrudRegistroAlojamiento)ois.readObject();
            ois.close();
            this.aLectura.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir o crear archivo de lectura");
        } catch (IOException ex) {
            System.out.println("Error al crear objeto de lectura");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al leer objeto");
        }
        
        return coleccion;
    }
    
    private void guardar(ICrudRegistroAlojamiento coleccion){
        ObjectOutputStream oos = null;
        try {
            this.aEscritura = new FileOutputStream(this.archivo);
            oos = new ObjectOutputStream(this.aEscritura);
            oos.writeObject(coleccion);
            oos.close();
            this.aEscritura.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir o crear archivo de escritura");
        } catch (IOException ex) {
            System.out.println("Error al crear objeto de escritura");
        }
    }
    
    @Override
    public boolean agregarAlojamiento(Alojamiento a) {
        ICrudRegistroAlojamiento coleccion = this.leer();
        coleccion.agregarAlojamiento(a);
        this.guardar(coleccion);
        return true;
    }

    @Override
    public Alojamiento buscar(int codigo) {
        ICrudRegistroAlojamiento coleccion = this.leer();
        return coleccion.buscar(codigo);
    }

    @Override
    public boolean eliminar(Alojamiento a) {
         ICrudRegistroAlojamiento coleccion = this.leer();
         coleccion.eliminar(a);
         this.guardar(coleccion);
         return true;
    }

    @Override
    public List<Alojamiento> obtenerAlojamientos() {
             ICrudRegistroAlojamiento coleccion = this.leer();
             return coleccion.obtenerAlojamientos();
    }
    
}
