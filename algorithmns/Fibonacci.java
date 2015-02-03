import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fibonacci {

		public static String checkFibonacci(Integer num){
			if(num == 1 || num == 2){
				return "IsFibo";
			}
			int a,b,c;
			a=0;
			b=1;
			c=0;
			while(c<num){
				c = a+b;
				a = b;
				b = c; 
			}
			if(c==num){
				return "IsFibo";
			}
			else{
				return "IsNotFibo";
			}
		}

		public static void main(String[] args) {
			 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
			Scanner in = new Scanner(System.in);
			int t = Integer.parseInt(in.nextLine());
			int i;

			Integer[] input = new Integer[t];

			for (i=0; i<t; i++) 
				input[i] = Integer.parseInt(in.nextLine());

			for (i=0; i<t; i++) 
				System.out.println(checkFibonacci(input[i]));
		}
}