
/* Copyright (c) 2023 Rodrigo Bento */

package rbento;

import static rbento.SystemInfo.JAVAFX_VERSION;
import static rbento.SystemInfo.JAVA_VERSION;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Program extends Application {

    private static final String WINDOW_TITLE = "JavaFX";
    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 800;

    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX %s running on Java %s".formatted(JAVAFX_VERSION, JAVA_VERSION));
        Scene scene = new Scene(new StackPane(label), WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.setTitle(WINDOW_TITLE);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
