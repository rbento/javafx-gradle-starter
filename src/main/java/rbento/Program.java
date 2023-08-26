
/* Copyright (c) 2023 Rodrigo Bento */

package rbento;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import rbento.util.Resources;

public class Program extends Application {

    private static final String WINDOW_TITLE = "JavaFX";
    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 800;

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(Resources.asURL("hello-view.fxml"));
        Scene fxmlScene = new Scene(fxmlLoader.load(), WINDOW_WIDTH, WINDOW_HEIGHT);

        stage.setScene(fxmlScene);
        stage.setTitle(WINDOW_TITLE);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
