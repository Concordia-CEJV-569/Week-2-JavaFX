package com.example.hellojavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Label label;
    private TextField nameTextField;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello JavaFX");

        Button button = new Button();
        button.setText("Click Me!");

        label = new Label();
        label.setText("This is my label");

        nameTextField = new TextField();
        nameTextField.setPromptText("Enter your name");

        button.setOnAction(new EventHandler<ActionEvent>() {
            // Challenge: change the label's text on click of this button
            @Override
            public void handle(ActionEvent actionEvent) {
                String name = nameTextField.getText().trim();
                label.setText(name);
                button.setText("Don't click again!");
            }
        });

        // StackPane stackPane = new StackPane();
        FlowPane rootFlowPane = new FlowPane(10, 10);
        rootFlowPane.setAlignment(Pos.CENTER);

        rootFlowPane.getChildren().add(button);
        rootFlowPane.getChildren().add(label);
        rootFlowPane.getChildren().add(nameTextField);

        Scene scene = new Scene(rootFlowPane, 250, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}