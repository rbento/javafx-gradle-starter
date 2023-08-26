module rbento {
    requires javafx.controls;
    requires javafx.fxml;

    opens rbento to
            javafx.fxml;

    exports rbento;
}
