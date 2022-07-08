
public class _string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("superman");
		String str2 = new String("superman");
		
		System.out.println(str);
		System.out.println(str2);
		
		if(str == str2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
		
		if(str.equals(str2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}

		
		String str3 ="superman2";      
		String str4 ="dddd";      
		
		System.out.println(str3);
		System.out.println(str4);           
		
		if(str3 == str4) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
		
		if(str.equals(str2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}

	}
}

