package bldeatraining2;

import java.util.Scanner;

public class Comparestrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string-1");
		String s1= sc.next();
		System.out.println("Enter the string-2");
		String s2= sc.next();
		sc.close();
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings are Equal");
		}
			else {
				System.out.println("Strings are not equal");
			}
		

	}

}
