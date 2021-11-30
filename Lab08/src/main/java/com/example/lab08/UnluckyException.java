package com.example.lab08;


import javafx.scene.control.TextField;

public class UnluckyException extends Exception{

    public UnluckyException(String msgErr) {
        super(msgErr);
    }

    public static void unlucky_13(TextField input_2) throws UnluckyException {
        if (Double.parseDouble(input_2.getText()) == 13) {
            throw new UnluckyException("unlucky 13");
        }
    }
}
