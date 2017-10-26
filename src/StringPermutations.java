
public class StringPermutations {

	public StringPermutations() {
		// TODO Auto-generated constructor stub
	}

	public void permutation(char[] arrA,int left,int size){
		int x;
		if(left==size){
			for(int i=0;i<arrA.length;i++){
				System.out.print(arrA[i]);
			}
			System.out.print(" ");
		}else{
			for(x=left;x<size;x++){
				swap(arrA,left,x);
				permutation(arrA, left+1, size);
				swap(arrA,left, x);
			}
		}
	}
	public void swap(char[] arr,int i,int j){
		
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void main(String[] args) {
		
		String s="abc";
		char [] arrCh=s.toCharArray();
		StringPermutations i= new StringPermutations();
		i.permutation(arrCh, 0, arrCh.length);
		

	}

}
