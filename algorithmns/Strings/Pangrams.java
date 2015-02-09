import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

	public static String checkPanagram(String sent){
		sent = sent.toLowerCase();
		for (char a = 'a'; a < 'z'; a++) {
			if(sent.indexOf(a) < 0)
				return "not pangram";
		}
		return "pangram";
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String sentance = in.nextLine();
		System.out.println(checkPanagram(sentance));
	}
}