
public class addBinary {

	public addBinary() {
		// TODO Auto-generated constructor stub
	}

	public String addNo(String a, String b) {

		if (a == null || a.length() == 0) {
			return b;
		}
		if (b == null || b.length() == 0) {
			return b;
		}
		int la = a.length() - 1;
		int lb = b.length() - 1;

		int flag = 0;
		StringBuilder sb = new StringBuilder();
		while (la >= 0 || lb >= 0) {
			int pa = 0;
			int pb = 0;
			if (la >= 0) {
				pa = a.charAt(la) == '0' ? 0 : 1;
				la--;
			}
			if (lb >= 0) {
				pb = b.charAt(lb) == '0' ? 0 : 1;
				lb--;
			}
			int sum = pa + pb + flag;
			if (sum >= 2) {
				sb.append(String.valueOf(sum - 2));
				flag = 1;
			} else {
				sb.append(String.valueOf(sum));
				flag = 0;
			}

		}
		if(flag==1){
			sb.append("1");
		}

		String reversed=sb.reverse().toString();
		return reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addBinary ex = new addBinary();
		System.out.println(ex.addNo("11", "1"));
		

	}

}
