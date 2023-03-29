/**
 * 
 */
package bldeatraining2;

/**
 * @author nesur
 *
 */
import java.util.Scanner;
public class ArrayCod5Ls {

	/**
	 * @param args
	 */
	 public static int LinearSearch(int arr[],int key) {
 		for(int i=0;i<arr.length;i++) {
 			if(arr[i]==key) {
 				return (i+1);
 			
 			}
 			
 		}
 		return 0;
 		
}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The array Eleemnt to be searched" );
        int key =sc.nextInt();
        int arr[]= {10,20,30,40,50,60,70,80,90,100};
        int res=LinearSearch(arr,key);
        sc.close();
        if(res>0) 
       {
        	System.out.println("element found at position" + (res));
        }
        else {
        	System.out.println("Eleemnt not found");
        }
	}
}
        
       