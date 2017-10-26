
public class DynamicArrayofInt {

	private int[] data;
	public DynamicArrayofInt(){
		data=new int [1];
	}
	public int get(int pos){
		return data[pos];
		
	}
	public void put(int pos,int val ){
		int newSize;
		if(pos>=data.length){
			newSize=2*pos;
			int[] newData =new int[newSize];
			System.arraycopy(data,0,newData,0,data.length);
			data=newData;
		}
		data[pos]=val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicArrayofInt dynarray=new DynamicArrayofInt();
		dynarray.put(0, 2);
		System.out.println(dynarray.get(0));
	}

}
