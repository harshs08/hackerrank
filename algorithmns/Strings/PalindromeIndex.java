import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeIndex {

	public static boolean isPalindrome(char[] C, int a, int b){
		for (int i=a, j=b-1; i<j; i++,j-- ) {
			if(C[i] != C[j]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		String[] str = new String[T];
		int i = 0;

		for (i=0; i<T; i++) 
			str[i] = in.nextLine();

		for(i=0; i<T; i++){
			char ch[] = str[i].toCharArray();
			int N = ch.length;
			int index = -1;
			for(int j=0, k= N-1; j<k; j++,k--){
				if(ch[j] != ch[k]){
					if(isPalindrome(ch, j+1, k+1)) index = j;
					else index = k;
					break;
				}
			}
		System.out.println(index);
		}
	}
}