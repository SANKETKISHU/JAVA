import java.util.Scanner;
public class temperature  
 {  
   public static void main (String args[])  
   { 
     float Fahrenheit, Celsius;
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE CELSIUS");  
     Celsius = sc.nextInt();  
     Fahrenheit =((Celsius*9)/5)+32;  
     System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
   }
} 