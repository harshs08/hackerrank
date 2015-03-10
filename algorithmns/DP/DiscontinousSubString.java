public class DiscontinousSubString{
	public static int match (String target, String source){
		int [][] f = new int[target.length() + 1][source.length() + 1];
		for (int i = 0 ; i <= source.length() ; ++i) {
			f[0][i] = 1;
		}
		f[0][0] = 1;
		for (int i = 1 ; i <= target.length() ; i++){
			for (int j = 1 ; j <= source.length() ; j++){
				if (target.charAt(i - 1) == source.charAt(j - 1)) {
					f[i][j] = f[i - 1][j - 1] + f[i][j - 1];
				}
				else{
					f[i][j] = f[i][j - 1];
				}
			}
		}
		return f[target.length()][source.length()];
	}


	public static void main(String[] args) {
		String target = "cat";
		String source = "catapult";

		int result = match(target, source);
		System.out.println("The number of substrings: "+ result);
	}
}

