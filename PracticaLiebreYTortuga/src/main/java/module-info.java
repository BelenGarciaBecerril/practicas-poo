module com.bel.practicaliebreytortuga {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bel.practicaliebreytortuga to javafx.fxml;
    exports com.bel.practicaliebreytortuga;
}
