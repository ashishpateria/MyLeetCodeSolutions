
public class HamminDistance {

	 public static int hammingDistance(int x, int y) {
	        return Integer.bitCount(x ^ y);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=hammingDistance(1,4);
		System.out.println(x);
	}

}
