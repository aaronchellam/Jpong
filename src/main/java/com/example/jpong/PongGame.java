package com.example.jpong;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PongGame extends Application {
    // FIELDS
    private int p1Score;
    private int p2Score;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // App title
        primaryStage.setTitle("Pong");

        Group root = new Group();
        Scene scene = new Scene(root);

        // TODO - check canvas size
        // Create and add canvas to root node.
        Canvas canvas = new Canvas();
        root.getChildren().add(canvas);

        // Get GraphicsContext obj from canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Set graphics
        gc.setFill(Color.BLACK);

        primaryStage.show();
    }
}
