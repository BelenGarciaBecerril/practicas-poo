package com.bel.practicaconteo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtClics;
    @FXML private Button btnContar;
    @FXML private ProgressBar progressBar;
    @FXML private Button btnEsperar;

    private int contadorClics = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (txtClics != null) {
            txtClics.setText("0");
        }
        if (progressBar != null) {
            progressBar.setProgress(0.0);
        }
    }

    @FXML
    private void contarClic(ActionEvent event) {
        contadorClics++;
        if (txtClics != null) {
            txtClics.setText(String.valueOf(contadorClics));
        }
    }

    @FXML
    private void iniciarEspera(ActionEvent event) {
        if (btnEsperar != null) {
            btnEsperar.setDisable(true);
        }
        if (progressBar != null) {
            progressBar.setProgress(0.0);
        }

        Thread hilo = new Thread(() -> {
            int totalPasos = 100;
            int milisegundosTotales = 10000;
            int tiempoPaso = milisegundosTotales / totalPasos;

            for (int i = 1; i <= totalPasos; i++) {
                final double progreso = (double) i / totalPasos;
                try {
                    Thread.sleep(tiempoPaso);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    if (progressBar != null) {
                        progressBar.setProgress(progreso);
                    }
                });
            }

            Platform.runLater(() -> {
                if (btnEsperar != null) {
                    btnEsperar.setDisable(false);
                }
            });
        });

        hilo.start();
    }
}