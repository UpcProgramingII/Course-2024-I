/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx;


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
    private StackPane panelRegistro;
    private StackPane panelConsulta;
    
    
    /**
     * Initializes the controller class.
     */
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try{
            this.panelRegistro = (StackPane) App.loadComponent("registro");
            this.panelRegistro.setVisible(false);
            this.panelConsulta = (StackPane) App.loadComponent("consulta");
            this.panelConsulta.setVisible(false);
            
//            this.panelTrabajo.getChildren().clear();
//            this.panelTrabajo.getChildren().add(panelRegistro);
//            this.panelTrabajo.getChildren().add(this.panelConsulta);
            
            
            
        }
        catch(IOException ioe){
        }
        
        
        
    }    
    
    @FXML
    private void clcikBtnRegistro(){
          this.panelTrabajo.getChildren().clear();
          this.panelTrabajo.getChildren().add(this.panelRegistro);
          this.panelRegistro.setVisible(true);
          
          
    }
    
    @FXML
    private void clickBtnConsulta() throws IOException{
        this.panelTrabajo.getChildren().clear();
        this.panelConsulta = (StackPane) App.loadComponent("consulta");
        this.panelTrabajo.getChildren().add(this.panelConsulta);
        this.panelConsulta.setVisible(true);
        
        
    }
}
