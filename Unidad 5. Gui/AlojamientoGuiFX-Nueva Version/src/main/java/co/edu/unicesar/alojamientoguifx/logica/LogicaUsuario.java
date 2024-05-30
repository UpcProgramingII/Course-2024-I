/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx.logica;

/**
 *
 * @author Jairo F
 */
public class LogicaUsuario {
    
    private final String USER = "Seuz";
    private final String PASSWORD = "12345";

    public LogicaUsuario() {
    }
    
    public boolean login(String username, String password){
        // implementar logica para validacion de credenciales de ususario
        return (username.equals(USER)&&password.equals(PASSWORD));
    }
    
}
