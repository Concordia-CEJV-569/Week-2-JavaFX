package com.example.hellojavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Label label;
    private Label label2;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello JavaFX");
        Button button = new Button();
        button.setText("Click Me!");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello JavaFX!");
            }
        });
        label = new Label();
        label.setText("This is my label");
        label2 = new Label();
        label2.setText("Label 2");

        // StackPane stackPane = new StackPane();
        FlowPane rootFlowPane = new FlowPane(10, 10);
        rootFlowPane.setAlignment(Pos.CENTER);

        rootFlowPane.getChildren().add(button);
        rootFlowPane.getChildren().add(label);
        rootFlowPane.getChildren().add(label2);

        Scene scene = new Scene(rootFlowPane, 250, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}