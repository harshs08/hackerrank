import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class AngryChildren {
	static BufferedReader in = new BufferedReader(new InputStreamReader(
			System.in));
	static StringBuilder out = new StringBuilder();

	//Using the concept of sliding window
	public static int smallestDiff(int[] packets, int numKids){
		int minValue = Integer.MAX_VALUE;
		Arrays.sort(packets);
		for(int i = 0; i < packets.length - numKids + 1; i ++)
		{
			int temp = packets[i + numKids - 1] - packets[i];
			if(temp < minValue)
			{
				minValue = temp;
			}
		}
		return minValue;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int numPackets = Integer.parseInt(in.readLine());
		int numKids = Integer.parseInt(in.readLine());
		int[] packets = new int[numPackets];
		
		for(int i = 0; i < numPackets; i ++)
		{
			packets[i] = Integer.parseInt(in.readLine());
		}
		
		int unfairness = Integer.MAX_VALUE;
		
		  // Write your code here, to process numPackets N, numKids K, and the packets of candies
		// Compute the ideal value for unfairness over here
		unfairness = smallestDiff(packets, numKids);
		System.out.println(unfairness);
	}
}