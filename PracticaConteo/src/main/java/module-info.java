module com.bel.practicaconteo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bel.practicaconteo to javafx.fxml;
    exports com.bel.practicaconteo;
}
