package bldeatraining2;

import java.util.Scanner;

public class Replacevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string-1");
		String str1=sc.nextLine();
		String str2="";
		str1=str1.toLowerCase();
	
		for(int i=0;i<=str1.length()-1;i++) {
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') 
			{
				str2="@";
			}
			else {
				str2= str2+str1.charAt(i);

			}
		  }
		System.out.println(str2);


	}

}
