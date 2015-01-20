import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree{

	public static int calculate_Cycles(int n){
		if(n==0)
			return 1;

		int current_cycle = 1;
		for (int j=1; j<=n; j++){
			if(j%2 == 0){
				//return n+1;
				current_cycle += 1;
			}
			else{
				//return n*2;
				current_cycle *= 2;
			}
		}
		return current_cycle;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();
		int[] cycle_array = new int[t];

		for(int i = 0; i<t; i++)
			cycle_array[i] = in.nextInt();

		System.out.println();

		for(int k=0;k<t;k++)
			System.out.println(calculate_Cycles(cycle_array[k]));
	}
}