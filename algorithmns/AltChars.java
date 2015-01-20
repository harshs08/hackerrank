import java.util.*;
import java.io.*;

public class AltChars{

	public static int deletion(String str){
		int delcount = 0;

		if(str.length() == 1)
			return 0;

		for(int k=0; k<str.length()-1; k++){
			if (str.charAt(k) == str.charAt(k+1))
				delcount += 1;
		}
		return delcount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res = 0;
		int t = Integer.parseInt(in.nextLine());
		String[] strs = new String[t];
		
		for(int i=0; i<t; i++)
			strs[i] = in.nextLine();

		for(int j=0; j<t; j++){
			res = deletion(strs[j]);
			System.out.println(res);
		}
	}
}