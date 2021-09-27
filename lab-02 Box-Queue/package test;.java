import java.io.*;   
public class PrintDemo  
{   
public static void main(String[] args)   
{   
//declaration of different datatypes   
int num = 122;   
char ch = 'A';   
String str = "Oracle";   
double d = 190.98;   
float f = 3.14f;   
//prints the values on the console  
System.out.println(); //prints nothing but throws the cursor to the next line  
System.out.println(num); //prints integer  
System.out.println(ch); //prints character   
System.out.print(str+"\n");   
System.out.print(d +"\n");   
System.out.print(f+"\n");   
System.out.printf("'%s' %n", "javatpoint");  
System.out.printf("'%S' %n", "Jack");  
}   
}  