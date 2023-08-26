module rbento {
    requires javafx.controls;
    requires javafx.fxml;

    opens rbento to
            javafx.fxml;

    exports rbento;
    exports rbento.controller;

    opens rbento.controller to
            javafx.fxml;

    exports rbento.util;

    opens rbento.util to
            javafx.fxml;
}
