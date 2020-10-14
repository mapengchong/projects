package cs520.hw1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Banking {

	public static void main(String[] args) {
		
		//scanner the object
		Scanner in = new Scanner(System.in);
		
		//Declaring variables
		int hundreds = 0;
		int fifties = 0;
		int twenties= 0;
		int tens = 0;
		int fives = 0;
		int twos = 0;
		int ones = 0;
		int rema = 0;
		
		//input value using message box
		String input;
		input = JOptionPane.showInputDialog(
		 "Enter an amount: ");
		
		//output console 
		int num;
		num = in.nextInt();
		System.out.println("Requested Amount = " + num );
		
		if(num>99){
		for(int i=1; i<num; i++){
				hundreds++;
				rema = num%100;
				hundreds = num /100;
		}
		}
		System.out.println("Hundreds = "+hundreds +"," + " Remaining Amount = " + rema);
		
		//output console
		num = rema;
		if(num>49){
		for(int i=1; i<num; i++){
				fifties++;
				rema = num%50;
				fifties = num /50;
		}
		}
		System.out.println("Fifties = "+fifties +","  + " Remaining Amount = " + rema);
		
		num = rema;
		if(num>19){
		for(int i=1; i<num; i++){
				twenties++;
				rema = num%20;
				twenties= num /20;
		}
		}
		System.out.println("Twenties = "+twenties+"," + "  Remaining Amount = " + rema);
		
		num = rema;
		if(num>9){
		for(int i=1; i<num; i++){
				tens++;
				rema = num%10;
				tens = num /10;
		}
		}
		System.out.println("Tens = "+tens+","+ "  Remaining Amount = " + rema);
		
		num = rema;
		if(num>4){
		for(int i=1; i<num; i++){
				fives++;
				rema = num%5;
				fives = num /5;
		}
		}
		System.out.println("Fives = "+fives+","+ "  Remaining Amount = " + rema);
		
		num = rema;
		if(num>2){
		for(int i=1; i<num; i++){
			
				twos++;
				rema = num%2;
				twos = num /2;
				
		}
		}
		System.out.println("Twos = "+twos+","+ "  Remaining Amount = " + rema);
		
		num = rema;
		for(int i=0; i<num; i++){
				ones++;
		}
		System.out.println("Ones = "+ones);
		
		//output using message box
		JOptionPane.showMessageDialog(null, "Requested Amount = " + num+
				"Hundreds = "+hundreds +
				"Fifties = "+fifties +","+
				"Twenties = "+twenties+
				"Tens = "+tens+
				"Fives = "+fives+
				"Twos = "+twos+
				"Ones = "+ones);
		
		
		//close Scanner
		in.close();
	}
}


