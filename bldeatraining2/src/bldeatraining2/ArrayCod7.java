/**
 * 
 */
package bldeatraining2;

import java.util.Arrays;

/**
 * @author nesur
 *
 */
public class ArrayCod7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40,50,60,70,80,90,100};
		int arr2[]= {100,90,70,80,50,60,40,30,20,10,11};
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          if(arr1.length==arr2.length) {
        	  for(int i=0;i<arr1.length;i++) {
        		  if(arr1[i]!=arr2[i]) {
        			  System.out.println("Arrays are  not equal");
        			  System.exit(0);
        		  }
        	  }
        	  System.out.println("Arrays are equal");
          }
          else {
        	  System.out.println("Arrays are not equal");
          }
	}

}
