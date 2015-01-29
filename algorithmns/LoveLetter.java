import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveLetter{

	public static int minChanges(String a){
		int count = 0;
		int length = a.length();
		int mid = length/2;

		if(a.length() <= 1) return 0;

		for (int j=0; j<mid; j++) {
			count += Math.abs((int)a.charAt(j) - a.charAt(length-j-1));
			// if((a.charAt(j)>a.charAt(length-j-1))|| (a.charAt(j)<a.charAt(length-j-1))){
			// 	//charAt(j)--;
			// 	count++;
			// }
			// else if (a.charAt(j)<a.charAt(length-j)){
			// 	//charAt(length-j)--;
			// 	count++;
			// }
			// else
			// 	return null;
		}
		return count;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		int res;

		String[] strs = new String[t];
		
		for(int i=0; i<t; i++)
			strs[i] = in.nextLine();

		for(int j=0; j<t; j++){
			res = minChanges(strs[j]);
			System.out.println(res);
		}
	}
}