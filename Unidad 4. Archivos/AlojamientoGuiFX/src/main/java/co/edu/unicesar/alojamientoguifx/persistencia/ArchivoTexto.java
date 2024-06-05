/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx.persistencia;

import co.edu.unicesar.alojamientoguifx.entidades.Alojamiento;
import co.edu.unicesar.alojamientoguifx.entidades.Cabaña;
import co.edu.unicesar.alojamientoguifx.entidades.Habitacion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jairo F
 */
public class ArchivoTexto implements ICrudRegistroAlojamiento {

    private File archivo;
    private FileWriter archivoEscritura;
    private Scanner archivoLectura;

    public ArchivoTexto(String filename) {
        this.archivo = new File(filename);
    }

    public ArchivoTexto() {
        this("Alojamientos.dat");
    }
    
    private Alojamiento loadAlojamiento(String data){
        String[] datos =  data.split(";");
        int codigo = Integer.parseInt(datos[0]);
        String direccion = datos[1];
        String ciudad = datos[2];
        String pais = datos[3];
        int valor = Integer.parseInt(datos[5]);
        Alojamiento alojamiento;
        if(datos[4].equals("hab")){
            alojamiento = new Habitacion(valor, codigo, direccion, ciudad, pais);
        }else{
            alojamiento = new Cabaña(valor, codigo, direccion, ciudad, pais);
         }
        return alojamiento;
    }
    
    

    @Override
    public boolean agregarAlojamiento(Alojamiento a) {
        PrintWriter pw = null;
        try {
            this.archivoEscritura = new FileWriter(this.archivo, true);
            pw = new PrintWriter(this.archivoEscritura);
            pw.println(a.dataToFile());
            return true;
             
        } catch (IOException ioe) {
            System.out.println("El archivo no pudo ser creado o abierto en escritura");
            return false;
        }
        finally{
            if(pw!=null)
                pw.close();
        }

        
    }

    @Override
    public Alojamiento buscar(int codigo) {
        return null;
    }

    @Override
    public boolean eliminar(Alojamiento a) {
        return true;
    }

    @Override
    public List<Alojamiento> obtenerAlojamientos() {
        List<Alojamiento> leidos = new ArrayList();
       
        if(!this.archivo.exists()){
            return leidos;
        }
                
        try {
            this.archivoLectura = new Scanner(this.archivo);
            while(this.archivoLectura.hasNext()){
                String data = this.archivoLectura.nextLine();
                Alojamiento alojamiento = this.loadAlojamiento(data);
                leidos.add(alojamiento);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("No fue posible abrir el archivo para lectura");
        }
        finally{
            if(this.archivoLectura!=null){
                this.archivoLectura.close();
            }
        }
        return leidos;
    }

}
