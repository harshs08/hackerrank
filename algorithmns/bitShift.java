import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bitShift {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t;
        long res;
        long num;
        t = in.nextInt();

        for (int i = 0; i<t; i++) {
        	num = in.nextLong();
        	res = ~num;
            long unsignedValue = res & 0xffffffffl;
        	System.out.println(unsignedValue);
        
        }
        
    }
}