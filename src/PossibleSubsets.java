
public class PossibleSubsets {

	public static void print(int n,String s){
		if(n==0){
			
			System.out.println(s);
			return;
		}
		else{
			for(int i=1;i<=n;i++){
				
			
			s=s+i;
			print(n-i, s);
			s=s.substring(0,s.length()-1);
			}
			//
		}
		
	}
	public static void main(String[] args) {
	int n=4;
	print(n,"");

	}

}
