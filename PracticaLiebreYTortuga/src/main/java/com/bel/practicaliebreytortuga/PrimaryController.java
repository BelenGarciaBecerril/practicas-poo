package com.bel.practicaliebreytortuga;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController implements Initializable {

    @FXML private ProgressBar pbLiebre;
    @FXML private ProgressBar pbTortuga;
    @FXML private Label lblLiebreEstado;
    @FXML private Label lblTortugaEstado;
    @FXML private Button btnIniciar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (pbLiebre != null) pbLiebre.setProgress(0.0);
        if (pbTortuga != null) pbTortuga.setProgress(0.0);
    }

    @FXML
    private void iniciarCarrera(ActionEvent event) {
        if (btnIniciar != null) btnIniciar.setDisable(true);
        if (pbLiebre != null) pbLiebre.setProgress(0.0);
        if (pbTortuga != null) pbTortuga.setProgress(0.0);
        if (lblLiebreEstado != null) lblLiebreEstado.setText("¡Está corriendo!");
        if (lblTortugaEstado != null) lblTortugaEstado.setText("¡Está corriendo!");

        Thread hiloLiebre = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                final double prog = i / 100.0;
                
                try { Thread.sleep(30); } catch (InterruptedException e) {}

                Platform.runLater(() -> {
                    if (pbLiebre != null) pbLiebre.setProgress(prog);
                });

                if (i == 40) {
                    Platform.runLater(() -> {
                        if (lblLiebreEstado != null) lblLiebreEstado.setText("¡Se durmió!");
                    });
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {}
                    
                    Platform.runLater(() -> {
                        if (lblLiebreEstado != null) lblLiebreEstado.setText("¡Despertó!");
                    });
                }
            }
        });

        Thread hiloTortuga = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                final double prog = i / 100.0;
                try { Thread.sleep(70); } catch (InterruptedException e) {}

                Platform.runLater(() -> {
                    if (pbTortuga != null) pbTortuga.setProgress(prog);
                });
            }

            Platform.runLater(() -> {
                if (lblTortugaEstado != null) lblTortugaEstado.setText("¡Ganó la carrera!");
                if (btnIniciar != null) btnIniciar.setDisable(false);
            });
        });

        hiloLiebre.start();
        hiloTortuga.start();
    }
}