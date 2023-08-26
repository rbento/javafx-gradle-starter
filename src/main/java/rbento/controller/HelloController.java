
/* Copyright (c) 2023 Rodrigo Bento */

package rbento.controller;

import static rbento.SystemInfo.JAVAFX_VERSION;
import static rbento.SystemInfo.JAVA_VERSION;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label appWelcomeLabel;

    @FXML
    void initialize() {
        appWelcomeLabel.setText("JavaFX %s running on Java %s".formatted(JAVAFX_VERSION, JAVA_VERSION));
    }

    @FXML
    public void onHelloButtonClick(ActionEvent actionEvent) {
        appWelcomeLabel.setText("Welcome to JavaFX!");
    }
}
