package com.example.lab08;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;


public class split_computer extends Application {
    Stage window;
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Calculator - JavaFX");
        TextField Input_1 = new TextField();
        TextField Input_2 = new TextField();

        Button button = new Button("Imparte");
        button.setOnAction(e -> AlertBox.display("Alert", Input_1, Input_2));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(Input_1,Input_2,button);


        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    }

