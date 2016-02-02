package edu.carrollcc.cis232;
import java.util.Scanner;

public class App 
{
	public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("What is your name?");
    	String Name = keyboard.nextLine();
        System.out.printf("Hello %s!" , Name);
    	keyboard.close();
    }
}
