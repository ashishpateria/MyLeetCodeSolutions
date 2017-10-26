
public class Powerof2 {
	
	public static boolean powerof2(int n){
		if(n<1)
			return false;
		while(n>1){
			if((n&1)==1)
				return false;
			n=n>>1;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(powerof2(4)){
			System.out.println("powerof 2");
		}
	}

}
