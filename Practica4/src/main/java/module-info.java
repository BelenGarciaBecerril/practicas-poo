module com.bel.practica4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bel.practica4 to javafx.fxml;
    exports com.bel.practica4;
}
