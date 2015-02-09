import java.util.*;
public class QuickSort1 {

	static void partition(int[] ar) {
		int N = ar.length;
		int pivot = ar[0];
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();

		for(int i = 1; i<N; i++){
			if(ar[i] <= pivot) left.add(ar[i]);
			else right.add(ar[i]);
		}
		for (int k=0; k<left.size(); k++ )
			ar[k] = left.get(k);
		ar[left.size()] = pivot;
		
		for (int l=0; l<right.size(); l++ )
			ar[left.size()+1+l] = right.get(l);
		printArray(ar);
	}
 
	static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		 System.out.println("");
	}
			 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt(); 
		}
		partition(ar);
	}
}
