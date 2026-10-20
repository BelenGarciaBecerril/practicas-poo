
package com.bel.practica1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


public class PrimaryController implements Initializable {

    @FXML
    private DatePicker dpNacimiento;
    @FXML
    private Button btnLimpiar;
    @FXML
    private TextField txtAnios;
    @FXML
    private TextField txtMeses;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void calcularedad(ActionEvent event) {
    }

    @FXML
    private void limpiar(ActionEvent event) {
    }
    
}
