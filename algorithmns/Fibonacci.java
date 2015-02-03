import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fibonacci {

		public static String isFibonacci(Long num){
			Long a = (Long)Math.sqrt(5*num*num+4);
			Long b = (Long)Math.sqrt(5*num*num-4);

			if(Math.pow(a,2)==(5*num*num +4) || Math.pow(b,2)==(5*num*num -4)){
				return "IsFibo";
			}
			else{
				return "IsNotFibo";
			}
		}

		public static String checkFibonacci(Long num){
			if(num == 1 || num == 2){
				return "IsFibo";
			}
			Long a,b,c;
			a=0L;
			b=1L;
			c=0L;
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

			Long[] input = new Long[t];

			for (i=0; i<t; i++) 
				input[i] = Long.parseLong(in.nextLine());

			// for (i=0; i<t; i++) 
			// 	System.out.println(checkFibonacci(input[i]));
			// for (i=0; i<t; i++) {
			// 	if(isFibonacci(input[i])){
			// 		System.out.println("IsFibo");
			// 	}
			// 	else{
			// 		System.out.println("IsNotFibo");
			// 	}
			// }
			for (i=0; i<t; i++) 
				System.out.println(isFibonacci(input[i]));

			in.close();
		}
}