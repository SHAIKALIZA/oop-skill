package oopsskill;

import java.util.Scanner;

public class sumofnumintosisngledigit {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        while (num >= 10) {
	            int sum = 0;
	            while (num > 0) {
	                sum += num % 10;
	                num = num / 10;   
	            }
	            num = sum; 
	        }

	        System.out.println("Single-digit sum is: " + num);

	        scanner.close();
	    }
	}