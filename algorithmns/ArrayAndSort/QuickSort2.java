import java.util.*;
public class QuickSort2 {

	static void quickSort(int[] ar) {
		int N = ar.length;
		quickSort2(ar, 0 ,N-1);
	}

	static void quickSort2(int[] ar, int p, int r){
		if(p<r){
			int q = partition(ar,p,r);
			quickSort2(ar,p,q-1);
			quickSort2(ar,q+1,r);
			printArray(ar,p,r);
		}
	}

	static int partition(int[] ar, int p, int r) {
		int pivot = ar[p];
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();

		for(int i = p+1; i<=r; i++){
			if(ar[i] <= pivot) left.add(ar[i]);
			else right.add(ar[i]);
		}
		for (int k=0; k<left.size(); k++ )
			ar[p+k] = left.get(k);
		ar[p+left.size()] = pivot;
		
		for (int l=0; l<right.size(); l++ )
			ar[left.size()+p+l+1] = right.get(l);
		return p+left.size();
	}
 
	static void printArray(int[] ar, int p, int r) {
		for(int i = p; i <=r;i++){
			System.out.print(ar[i]+" ");
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
		quickSort(ar);
	}
}
