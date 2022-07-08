
public class homework1 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {     //3번세로로 반복
			for(int j=0; j<4; j++) {  //4번 가로로 반복
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("----------------------------------------");
		
	
		for(int i=0; i<3; i++) {   //3번세로로 반복
			for(int j=0; j<=i; j++) {  // i가0일때 * i가1일떄** i가2일때***
			System.out.print("*");
		}
		System.out.println("");
	
	}
		System.out.println("----------------------------------------");

		for(int i=0; i<=3; i++) { 	//3개 줄 생성
			for(int j=3; j>0; j--) {	//3개줄이므로 3에서부터 줄어들며 반복
			if(j > i) {  // i가 작을때
				System.out.print(" ");  //공백 출력
			}else{ // i가 클때
				System.out.print("*");  //* 출력
			}	
		}
			System.out.println();
	}
		System.out.println("----------------------------------------");
	
		for(int i = 0; i < 3; i++) {  //3개 줄 생성
			for(int j = 0; j < 3-i; j++) { // 공백 2개, 공백1개 출력
				System.out.print(" ");
			} 
			for(int j = 0; j < 2*i+1; j++) { // 별1개, 3개, 5개 출력
				System.out.print("*");
				
			}System.out.println();
		}
 }
}
