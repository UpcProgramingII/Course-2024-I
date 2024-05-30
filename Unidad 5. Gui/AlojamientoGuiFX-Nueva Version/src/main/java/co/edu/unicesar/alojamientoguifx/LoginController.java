/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx;

import co.edu.unicesar.alojamientoguifx.logica.LogicaUsuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jairo F
 */
public class LoginController implements Initializable {

    // Se asocia los componentes del controlador con la GUI
    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    @FXML private Button btnLogin;
    private LogicaUsuario logicaUsuario=new LogicaUsuario();;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    @FXML
    private void clickBtnLogin() throws IOException{
        String username = this.txtUsername.getText();
        String password = this.txtPassword.getText();
        
        if(this.logicaUsuario.login(username, password)){
            //App.setStage("home");
            App.setNewScene("home");
        }
        else{
        // Genera mensaje de notificacion
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Mensaje de Login");
            alert.setHeaderText("Informacion de credenciales registradas");
            alert.setContentText("Las credenciales registradas no son correctas, "
                    + "intente nuevamente");
            alert.show();
        
        }
        
        
    }
    
}
