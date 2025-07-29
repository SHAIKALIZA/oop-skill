package oopsskill;

import java.util.Scanner;  

public class vowelconsonant {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);

	        
	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

	            ch = Character.toLowerCase(ch);

	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println(ch + " is a Vowel.");
	            } else {
	                System.out.println(ch + " is a Consonant.");
	            }
	        } else {
	            System.out.println("Not an alphabet.");
	        }

	        scanner.close();
	    }
	}
