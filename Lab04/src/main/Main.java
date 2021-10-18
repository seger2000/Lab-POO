package main;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        File file=new File("text.txt");
        Operati ob1 = new Operati(file);
        ob1.print_line();
    }
}
