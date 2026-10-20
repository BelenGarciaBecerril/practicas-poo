module com.bel.practica5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bel.practica5 to javafx.fxml;
    exports com.bel.practica5;
}
