import java.io.*;
import java.util.*;

public class InsertionSort2 {

		public static void insertionSortPart2(int[] ar)
		{       
					 // Fill up the code for the required logic here
					 // Manipulate the array as required
					 // The code for Input/Output is already provided
			int N = ar.length;
			for (int i=1; i<N; i++) {
				int val = ar[i];
				int j = i;
				int temp = 0;
				while (j>0 && val<ar[j-1]) {
					temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
					j--;
				}
				ar[j] = val;
				printArray(ar);
			}
		}  
		
		
			
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
			 int s = in.nextInt();
			 int[] ar = new int[s];
			 for(int i=0;i<s;i++){
						ar[i]=in.nextInt(); 
			 }
			 insertionSortPart2(ar);    
										
		}    
		private static void printArray(int[] ar) {
			for(int n: ar){
				 System.out.print(n+" ");
			}
				System.out.println("");
	 }
}
