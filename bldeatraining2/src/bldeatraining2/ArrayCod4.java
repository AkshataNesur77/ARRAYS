/**
 * 
 */
package bldeatraining2;

/**
 * @author nesur
 *
 */
import java.util.Scanner;
public class ArrayCod4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the count of Movie house:");
		Scanner sc= new Scanner(System.in);
        int mov_hou=sc.nextInt();
        System.out.println("Enter the count of theatres in a each movie house:");
        int thr=sc.nextInt();
        System.out.println("Enter the count of screens in each thetre of the movie house:");
        int scr=sc.nextInt();
        int arr[][][]=new int[mov_hou][thr][scr];
        for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the moviehouse no. :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the theatre no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the capacity of screen no.:"+(k+1));
					arr[i][j][k]=sc.nextInt();
					
				}

			}
        }
        System.out.println("-------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the House no.:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the theatre no."+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The funds collected from screen no.:"+(k+1)+"is");
					int fund=arr[i][j][k]*350;
					System.out.println(fund);
					
				}

			}
		}

	}

}
