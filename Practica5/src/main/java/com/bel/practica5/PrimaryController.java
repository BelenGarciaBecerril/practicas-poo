package com.bel.practica5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtAlimentacion;
    @FXML
    private TextField txtRefrigerios;
    @FXML
    private TextField txtTransporte;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtOtros;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtMayor;

    @FXML
    private void calcularEstadisticas(ActionEvent event) {
        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefono = Integer.parseInt(txtTelefono.getText());
        int otros = Integer.parseInt(txtOtros.getText());

        int total = alimentacion + refrigerios + transporte + telefono + otros;
        txtTotal.setText(String.valueOf(total));

        int mayor = alimentacion;
        String nombreMayor = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            nombreMayor = "Refrigerios";
        }
        if (transporte > mayor) {
            mayor = transporte;
            nombreMayor = "Transporte";
        }
        if (telefono > mayor) {
            mayor = telefono;
            nombreMayor = "Telefonía";
        }
        if (otros > mayor) {
            mayor = otros;
            nombreMayor = "Otros";
        }

        txtMayor.setText(nombreMayor);
    }

    @FXML
    private void limpiar(ActionEvent event) {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefono.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtMayor.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}