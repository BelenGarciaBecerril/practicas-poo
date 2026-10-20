package com.bel.practica4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtNumero;
    @FXML
    private TextArea txtResultado;

    @FXML
    private void calcular(ActionEvent event) {
        
        int numero = Integer.parseInt(txtNumero.getText());
        
        
        txtResultado.setText("");

        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
           
            txtResultado.appendText(numero + " x " + i + " = " + resultado + "\n");
        }
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtNumero.clear();
        txtResultado.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}