package nl.uvs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Hello world!
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        var label = new Label("Hello JavaFX!");
        var root = new StackPane(label);
        var scene = new Scene(root, 250, 100);

        primaryStage.setTitle("JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(App.class, args);
    }
}
