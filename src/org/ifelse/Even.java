package org.ifelse;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner even =new Scanner(System.in);
		System.out.println("enter the number");
		int age = even.nextInt();
		 int i = age;
			if (i%2==0) {				
				System.out.println("even number"+i);
			}
			else {
				System.out.println("odd number");
			}
			
		}
	}

