/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package co.edu.unicesar.alojamientoguifx;

import co.edu.unicesar.alojamientoguifx.dto.AlojamientoDto;
import co.edu.unicesar.alojamientoguifx.entidades.Alojamiento;
import co.edu.unicesar.alojamientoguifx.logica.Logica;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Jairo F
 */
public class ConsultaController implements Initializable {

    @FXML private TableView tablaConsulta;
    @FXML private TableColumn colCodigo;
    @FXML private TableColumn colTipo;
    @FXML private TableColumn colDireccion;
    @FXML private TableColumn colCiudad;
    @FXML private TableColumn colPais;
    
    @FXML private TextField txtFiltro;
    private ObservableList<AlojamientoDto> listadoAlojamiento;
    private Logica logica = new Logica();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.colCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.colDireccion.setCellValueFactory(new PropertyValueFactory("direccion"));
        this.colTipo.setCellValueFactory(new PropertyValueFactory("tipo"));
        this.colCiudad.setCellValueFactory(new PropertyValueFactory("ciudad"));
        this.colPais.setCellValueFactory(new PropertyValueFactory("pais"));
        
        this.cargarConsulta();
    }    
    
    public void cargarConsulta(){
    
        this.listadoAlojamiento = FXCollections.observableArrayList();
        for(Alojamiento a: this.logica.getAlojamientos()){
            AlojamientoDto dto = new AlojamientoDto(a);
            this.listadoAlojamiento.add(dto);
        }
        
        this.tablaConsulta.setItems(this.listadoAlojamiento);
    }
    
}
