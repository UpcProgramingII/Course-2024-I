/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherenciasimple;

/**
 *
 * @author Jairo F
 */
public class Doctor extends Person {
    
    private String especialty;
    private String hospital;
    
    public Doctor(){
     super();
     this.especialty="Ginecologo";
     this.hospital = "HEAD";
    }
    
    public Doctor(int id, String name, String lastName, int age, String especialty, String hospital){
        super(id, name, lastName, age);
        this.especialty=especialty;
        this.hospital = hospital;
    }

    /**
     * @return the especialty
     */
    public String getEspecialty() {
        return especialty;
    }

    /**
     * @param especialty the especialty to set
     */
    public void setEspecialty(String especialty) {
        this.especialty = especialty;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString()  + ", especialty=" + especialty + ", hospital=" + hospital + '}';
    }
    
    
    
}
