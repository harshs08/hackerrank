import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockBeast {

	public static String FindCombination(int num){
		ArrayList<Integer> multiple3 = new ArrayList<Integer>();
		ArrayList<Integer> multiple5 = new ArrayList<Integer>();
		int a,b,l;
		a = b = l = 0;
		//String value = null;
		for (int i=3; i<=num; i++) {
			if (i%3 == 0){
				multiple3.add(i);
			}else if(i%5 ==0){
				multiple5.add(i);
			}
		}
		for (Integer j : multiple3){
			for (Integer k : multiple5){
				if(j+k == num){
					a=j;
					b=k;
				}
			}	
		}
		System.out.println("3="+a);
		System.out.println("5="+b);
		if(a!=0 || b!=0){
			String s3 = new String(new char[b]).replace("\0", "5");
			String s4 = new String(new char[a]).replace("\0", "3");
			return s3+s4;
		}
		else{
			return "-1";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int i = 0;
		int[] input = new int[t];

		for(i=0; i<t; i++)
			input[i] = in.nextInt();

		for(i=0; i<t; i++)
			System.out.println(FindCombination(input[i]));
	}
	
}