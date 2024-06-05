/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx;

import co.edu.unicesar.alojamientoguifx.entidades.Alojamiento;
import co.edu.unicesar.alojamientoguifx.logica.Logica;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Jairo F
 */
public class RegistroController implements Initializable {
    // se asocia el controlador con la logica de registro de alojamiento
    private Logica logica = new Logica();
    
    @FXML private StackPane root;
    @FXML private TextField txtPais;
    @FXML private TextField txtCodigo;
    @FXML private TextField txtDireccion;
    @FXML private ComboBox cmbCiudad;
    @FXML private ComboBox cmbTipoAlojamiento;
    @FXML private ComboBox cmbNoPersonas;
    @FXML private ComboBox cmbNoCuartos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        //Asina los valores de las listas desplegables
        this.cmbTipoAlojamiento.getItems().addAll("Cabaña","Habitacion");
        this.cmbNoCuartos.getItems().addAll(1,2,3,4);
        this.cmbNoPersonas.getItems().addAll(1,2,3);
        this.cmbCiudad.getItems().addAll("Barranquilla", "Valledupar", "Santa Marta");
        
        // Asigna valor por default a txt pais
        this.txtPais.setText("Colombia");
        this.txtPais.setDisable(true);
        
    }  
    
    // Evento click en el como tipo alojamiento
    @FXML
    public void clickTipoAlojamiento(){
        int indexSeleccionado=this.cmbTipoAlojamiento.getSelectionModel().getSelectedIndex();
        this.cmbNoCuartos.setDisable(indexSeleccionado!=0);
        this.cmbNoPersonas.setDisable(indexSeleccionado!=1);
    }
    
    @FXML
    public void clickBtnGuardar(){
        int codigo = Integer.parseInt(this.txtCodigo.getText());
        String pais = this.txtPais.getText();
        String direccion = this.txtDireccion.getText();
        String ciudad = this.cmbCiudad.getSelectionModel().getSelectedItem().toString();
        int tipo = this.cmbTipoAlojamiento.getSelectionModel().getSelectedIndex()+1;
        int valor = (tipo==2)?Integer.parseInt(this.cmbNoPersonas.getSelectionModel().getSelectedItem().toString())
                :
                Integer.parseInt(this.cmbNoCuartos.getSelectionModel().getSelectedItem().toString());
        Alojamiento a=this.logica.crearAlojamiento(codigo, direccion, ciudad, pais,valor, tipo);
        
        this.logica.registrarAlojamiento(a);
        System.out.println(a);
        System.out.println(this.logica.getAlojamientos().size() + " registrados");
    }
    
    @FXML
    public void clickBtnSalir(){
        this.limpiar();
        this.root.setVisible(false);
    }
    
    public void limpiar(){
        this.txtCodigo.setText(null);
        this.txtDireccion.setAccessibleHelp(null);
        this.txtPais.setText(null);
        this.txtDireccion.setText(null);
        this.cmbCiudad.getSelectionModel().select(-1);
        this.cmbNoCuartos.getSelectionModel().select(-1);
        this.cmbNoPersonas.getSelectionModel().select(-1);
        this.cmbTipoAlojamiento.getSelectionModel().select(-1);
        this.txtCodigo.requestFocus();
    }
    
    
    
}
