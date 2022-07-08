import java.util.Scanner;

public class _switch {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);		
		
		//사용자입력 받기
		System.out.println("첫번쨰정수를 입력하세요");   
		int num1 = sc.nextInt();
		System.out.println("두번쨰정수를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("연산을 입력하세요");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case '+' :System.out.println(num1+""+ch+""+num2+"="+(num1+num2)); break;
		case '-' :System.out.println(num1+""+ch+""+num2+"="+(num1-num2)); break;
		case '*' :System.out.println(num1+""+ch+""+num2+"="+(num1*num2)); break;
		case '/' :System.out.println(num1+""+ch+""+num2+"="+(num1/num2));
				
		};
	}
	
}
