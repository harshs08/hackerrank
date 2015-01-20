import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IO{
	public int summation(int a, int b){
		return a + b;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t;
		int sum;
		int _a,_b;
		t = in.nextInt();
		IO io = new IO();

		for(int i = 0; i<t; i++){
			_a = in.nextInt();
			_b = in.nextInt();
			sum = io.summation(_a,_b);
			System.out.println(sum);
		}
	}
}