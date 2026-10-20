package com.bel.practica3;

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
    private TextField txtCantidadCifras;
    @FXML
    private TextField txtSumaImpares;
    @FXML
    private TextField txtSumaPares;
    @FXML
    private TextField txtSumaTotal;
    @FXML
    private TextField txtMayor;
    @FXML
    private TextField txtMenor;
    @FXML
    private TextArea txtDivisores;

    @FXML
    private void analizar(ActionEvent event) {
        int numero = Integer.parseInt(txtNumero.getText());
        String numeroTexto = txtNumero.getText();
        
        int cantidadCifras = numeroTexto.length();
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int mayor = -1;
        int menor = 10;

        for (int i = 0; i < numeroTexto.length(); i++) {
            char caracter = numeroTexto.charAt(i);
            int digito = Character.getNumericValue(caracter);

            sumaTotal = sumaTotal + digito;

            if (digito % 2 == 0) {
                sumaPares = sumaPares + digito;
            } else {
                sumaImpares = sumaImpares + digito;
            }

            if (digito > mayor) {
                mayor = digito;
            }
            if (digito < menor) {
                menor = digito;
            }
        }

        txtCantidadCifras.setText(String.valueOf(cantidadCifras));
        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));

        txtDivisores.setText("");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                txtDivisores.appendText(i + "\n");
            }
        }
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtNumero.clear();
        txtCantidadCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtMayor.clear();
        txtMenor.clear();
        txtDivisores.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}