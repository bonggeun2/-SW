
public class _array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0; //지역변수
		int []arr; //레퍼런스 
		arr = new int[4]; //배열
		int [][]aa;
		aa = new int[2][3];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
	 }
		System.out.println(aa);
	}
}
