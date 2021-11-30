package com.example.lab08;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static java.lang.String.*;
public class AlertBox {

    public static boolean isdouble(String input_1, String input_2){
        try{
            Double.parseDouble(input_1);
            Double.parseDouble(input_2);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static void  display(String title, TextField input_1, TextField input_2) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMaxWidth(300);
        Label label = new Label();



        if (input_1.getText().isEmpty() || input_2.getText().isEmpty()) {
            label.setText("  Campurile nu sunt completate  ");
        }else if (!isdouble( input_1.getText(), input_2.getText())) {
            label.setText("  Campurile au fost completate gresit  ");
        } else if (Double.parseDouble(input_2.getText()) == 0) {
            label.setText("  Impartirea la zero nu exista  ");

        } else {
            double num_1 = Double.parseDouble(input_1.getText());
            double num_2 = Double.parseDouble(input_2.getText());
            label.setText("Rezultatul este = " + String.valueOf(num_1 / num_2) + " ");
            try {
                UnluckyException.unlucky_13(input_2);
            } catch (UnluckyException e) {
                label.setText(String.valueOf(e));
            }
        }






        Button closebtn  = new Button("Close the window");
        closebtn.setOnAction(e -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,closebtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 270,100);
        window.setScene(scene);
        window.showAndWait();
    }



}

