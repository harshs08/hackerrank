import java.io.*;
import java.util.*;

public class MaxXor{

	public static int findMax(int a, int b){
		//long unsignedValue = res & 0xffffffffl;
		int res = 0;
		int max = 0;
		for(int i=a; i<b; i++){
			for(int j=a; j<b; j++){
				res = i^j;
				if(res > max)
					max = res;
			}
		}
		return max;
	}

  // private static short maxXor(short L, short R) {
  //       short max = 0;
  //       while (L != R){
  //           L >>= 1;
  //           R >>= 1;
  //           max = (short)((max << 1) + 1);
  //       }
  //       return max;
  //   }


	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int _a,_b;
		int res;
		_a = in.nextShort();
		_b = in.nextShort();
   
  	res = maxXor(_a,_b);
  	System.out.println(res);

	}
}