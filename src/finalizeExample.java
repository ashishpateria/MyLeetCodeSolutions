
public class finalizeExample {

	public void finalize(){System.out.println("finalize called");}
	public static void main(String[] args){
		
		finalizeExample f1= new finalizeExample();
		finalizeExample f2=new finalizeExample();
		f1=null;
		f2=null;
		System.gc();
		
	}

}
