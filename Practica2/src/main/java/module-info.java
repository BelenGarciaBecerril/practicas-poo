module com.bel.practica2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bel.practica2 to javafx.fxml;
    exports com.bel.practica2;
}
