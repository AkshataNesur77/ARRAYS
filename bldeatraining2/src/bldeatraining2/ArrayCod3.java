/**
 * 
 */
package bldeatraining2;

import java.util.Scanner;

/**
 * @author nesur
 *
 */
public class ArrayCod3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the count of classes:");
		Scanner sc =new Scanner(System.in);
		int cls=sc.nextInt();
		int arr[][]=new int[cls][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the student count inside class:"+(i+1));
			arr[i]=new int[sc.nextInt()];
			}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of student:"+(j+1));
				arr[i][j]=sc.nextInt();
				sc.close();
			}
		}
		System.out.println("-------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of student:"+(j+1)+"is"+arr[i][j]);
				arr[i][j]=sc.nextInt();
			}

		}

	}

}
		
