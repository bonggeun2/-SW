import java.util.Scanner;

/*

지역변수는 스택에 저장


*/
public class _if {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);		
		
		//사용자입력 받기
		System.out.println("첫번쨰정수를 입력하세요");   
		int num1 = sc.nextInt();
		System.out.println("두번쨰정수를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("연산을 입력하세요");
		String str = sc.next();
		//char ch = sc.next().charAt(0)
		
		//문자 비교
		if(str.equals("+")) {
			System.out.println("덧셈을 입력하셨습니다.");
			int sum = num1 + num2;
			System.out.println(sum);
		}else if(str.equals("-")){
		System.out.println("뺄셈을 입력하셨습니다.");
		int sum2 = num1 - num2;
		System.out.println(sum2);
		}else if(str.equals("*")){
		System.out.println("곱하기를 입력하셨습니다");
		int sum3 = num1*num2;
		System.out.println(sum3);
		}else if(str.equals("/")){
		System.out.println("나눗셈을 입력하셧씁니다.");
		int sum4 = num1/num2;
		System.out.println(sum4);
		}else{
			System.out.println("올바른 문자를 입력해주세요");
		}
 }
}