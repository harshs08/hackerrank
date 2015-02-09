import java.io.*;
import java.util.*;

public class RunTimeInsertion {

		public static void insertionSort(int[] A){
			int count = 0;
			for(int i = 1; i < A.length; i++){
				int value = A[i];
				int j = i;
				int temp = 0;
				while(j > 0 && A[j-1] > value){
					temp = A[j];
					A[j] = A[j-1];
					A[j-1] = temp;
					j = j - 1;
					count++;
				}
				A[j] = value;
			}
			//printArray(A);
			System.out.println(count);
		}


		static void printArray(int[] ar) {
			for(int n: ar){
				System.out.print(n+" ");
			}
		}
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] ar = new int[n];
			for(int i=0;i<n;i++){
					ar[i]=in.nextInt();
			}
			insertionSort(ar);
		}
}
