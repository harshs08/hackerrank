import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UnboundedKnapsack {

	public static int knapsack(int[] arr, int value){
		int[] max = new int[value+1];
		Arrays.fill(max, 0);
		max[0] = 0;
		for (int i=1; i<=value; i++ ) {
			for (int j = 0; j<arr.length ; j++) {
				if(arr[j]<= i){
					if(max[i-arr[j]]+1 > max[i]){
						max[i] = max[i-arr[j]]+1;
					}
				}
			}
		}
		for (int counter = 1; counter < max.length; counter++){
			if (max[counter] > max){
				max = decMax[counter];
			}
		}
		return max[value];
	}


	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[] testSolutions = new int[T];
		int N = 0;
		int k;
		int i;
		for(i = 0; i<T ; i++){
			N = in.nextInt();
			k = in.nextInt();
			int[] array = new int[N];
			for(int j = 0; j<N; j++){
				array[j] = in.nextInt();
			}
			testSolutions[i] = knapsack(array, k);
		}

		for(i = 0; i<T ; i++){
			System.out.println(testSolutions[i]);
		}
	}
}