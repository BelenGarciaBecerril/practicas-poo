module com.bel.practica3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bel.practica3 to javafx.fxml;
    exports com.bel.practica3;
}
