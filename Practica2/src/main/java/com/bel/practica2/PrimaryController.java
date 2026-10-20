package com.bel.practica2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtDinero;
    @FXML
    private TextArea txtResultado;

    @FXML
    private void desglosar(ActionEvent event) {
        
        int dinero = Integer.parseInt(txtDinero.getText());
        
      
        txtResultado.setText("");

        
        int[] valores = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] nombres = {"Billetes de $500", "Billetes de $200", "Billetes de $100", 
                            "Billetes de $50", "Billetes de $20", "Monedas de $10", 
                            "Monedas de $5", "Monedas de $2", "Monedas de $1"};

       
        for (int i = 0; i < valores.length; i++) {
            int cantidad = dinero / valores[i]; 
            dinero = dinero % valores[i];      
            
            
            txtResultado.appendText(nombres[i] + ": " + cantidad + "\n");
        }
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtDinero.clear();
        txtResultado.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
}