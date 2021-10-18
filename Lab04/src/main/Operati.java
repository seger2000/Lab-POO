package main;

import javax.swing.*;
import java.io.*;

public class Operati {
    private String  txt="";
    public Operati(File file) {
        try
        {
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line;

            while((line=br.readLine())!=null)
            {
                sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed
            }
            fr.close();
            this.txt = sb.toString();
            //System.out.println("Contents of File: ");
            //System.out.println(sb.toString());   //returns a string that textually represents the object
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void print_line(){
        System.out.println(this.txt);
    }

}