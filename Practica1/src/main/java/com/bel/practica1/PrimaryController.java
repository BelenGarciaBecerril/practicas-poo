package com.bel.practica1;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private DatePicker dpNacimiento;

    @FXML
    private TextField txtAnios;

    @FXML
    private TextField txtMeses;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }

    @FXML
    private void calcularEdad(ActionEvent event) {
        if (dpNacimiento != null && dpNacimiento.getValue() != null) {
            LocalDate fechaNacimiento = dpNacimiento.getValue();
            LocalDate fechaActual = LocalDate.now();

            Period periodo = Period.between(fechaNacimiento, fechaActual);

            if (txtAnios != null) {
                txtAnios.setText(String.valueOf(periodo.getYears()));
            }
            if (txtMeses != null) {
                txtMeses.setText(String.valueOf(periodo.getMonths()));
            }
        }
    }

    @FXML
    private void limpiar(ActionEvent event) {
        if (dpNacimiento != null) {
            dpNacimiento.setValue(null);
        }
        if (txtAnios != null) {
            txtAnios.setText("");
        }
        if (txtMeses != null) {
            txtMeses.setText("");
        }
    }
}