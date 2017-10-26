import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static boolean unique(String s){ 
		
		Set<Character> set=new HashSet<>();
		
		char[] arrCh=s.toCharArray();
		for(char c:arrCh){
			if(!set.add(c)){
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(unique("hero")){
			System.out.println("Not unique");
		}else
			System.out.println("Unique");
		
	}

}
