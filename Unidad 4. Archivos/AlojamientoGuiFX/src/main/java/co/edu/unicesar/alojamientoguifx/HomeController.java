/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx;


import co.edu.unicesar.alojamientoguifx.entidades.Alojamiento;
import co.edu.unicesar.alojamientoguifx.logica.Logica;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;


/**
 * FXML Controller class
 *
 * @author Jairo F
 */
public class HomeController implements Initializable {
    
    private Logica logica = new Logica();
    @FXML private StackPane panelTrabajo;
    private StackPane panelRegistro, panelConsulta;
    
    
    /**
     * Initializes the controller class.
     */
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try{
            this.panelRegistro = (StackPane) App.loadComponent("registro");
            this.panelRegistro.setVisible(false);
            this.panelTrabajo.getChildren().clear();
            this.panelTrabajo.getChildren().add(panelRegistro);
        }
        catch(IOException ioe){
        }
        
        
        
    }    
    
    @FXML
    private void clcikBtnRegistro(){
          this.panelRegistro.setVisible(true);
    }
    
    @FXML
    private void clickBtnConsulta(){
        this.panelRegistro.setVisible(false);
        // mostra el panel de consulta
        
        for(Alojamiento a: this.logica.getAlojamientos()){
            System.out.println(a);
        }
        
    }
}
