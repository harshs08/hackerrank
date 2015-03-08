import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxSumAlt {

	public static int[] maxSubSum(int[] arr){
		int val;
		int current_sum = 0;
		int best_sum_c = 0;
		int best_sum_nc = 0;
		int res[] = {arr[0], arr[0]};
		if (arr.length == 1) {
		res[0] = arr[0];
		res[1] = arr[0];
		}

		for (int i=0; i<arr.length; i++ ) {
			//logic to find max subsequence sum
			val = arr[i] + current_sum;
			if(val>0){
				current_sum = val;
			}
			else{
				current_sum = 0;
			}

			if(current_sum>best_sum_c)
				best_sum_c = current_sum;

			//logic to find max non continous sum.
			if(arr[i]>=0){
				best_sum_nc += arr[i];
			}
		}
		res[0] = best_sum_c;
		res[1] = best_sum_nc;
		return res;
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[] testSolutionsC = new int[T];
		int[] testSolutionsNC = new int[T];

		int N = 0;
		//int res[][] = new int[T][2];
		int i;
		for(i = 0; i<T ; i++){
			N = in.nextInt();
			int[] array = new int[N];
			for(int j = 0; j<N; j++){
				array[j] = in.nextInt(); 
			}
			int temp[] = maxSubSum(array);
			testSolutionsC[i] = temp[0];
			testSolutionsNC[i] = temp[1];
		}

		for(i = 0; i<T ; i++){
			System.out.print(testSolutionsC[i] + " ");
			System.out.print(testSolutionsNC[i]);
			System.out.println();
		}
	}
}