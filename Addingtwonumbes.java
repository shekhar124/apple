
package com.add.numbers;

import java.util.Scanner;

public class Addingtwonumbes {

	public static void main(String[] args) {
		System.out.println("welcom adding two numbers");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a and b");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a +" "+b);
		int c=a+b;
		
		System.out.println("answer " + c);
	}

}
