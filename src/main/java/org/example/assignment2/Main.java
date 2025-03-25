package org.example.assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label
        Label label = new Label("Hello, JavaFX!");

        // Set up the layout for the scene (a simple StackPane)
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 300, 250); // Set window size to 300x250
        primaryStage.setTitle("JavaFX Skeleton");
        primaryStage.setScene(scene);

        // Display the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
