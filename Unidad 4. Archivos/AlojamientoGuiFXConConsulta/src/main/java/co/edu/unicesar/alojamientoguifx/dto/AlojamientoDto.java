/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx.dto;

import co.edu.unicesar.alojamientoguifx.entidades.Alojamiento;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Jairo F
 */
public class AlojamientoDto {
    private SimpleIntegerProperty codigo;
    private SimpleStringProperty tipo;
    private SimpleStringProperty direccion;
    private SimpleStringProperty ciudad;
    private SimpleStringProperty pais;

    public AlojamientoDto(Alojamiento obj) {
        this.codigo = new SimpleIntegerProperty(obj.getCodigo());
        this.tipo = new SimpleStringProperty(obj.getTipo());
        this.direccion = new SimpleStringProperty(obj.getDireccion());
        this.ciudad = new SimpleStringProperty(obj.getCiudad());
        this.pais = new SimpleStringProperty(obj.getPais()); 
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo.get();
    }

    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo.get();
    }

    

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion.get();
    }

    
    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad.get();
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais.get();
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo.set(codigo);
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo.set(tipo);
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad.set(ciudad);
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais.set(pais);
    }

    
}
