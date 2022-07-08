import java.util.Scanner;

public class _dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a=0;
		do {
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
			System.out.println("계속 하시겠습니까? Y,y/n");
			String str = sc.next();
			if(str.equals("Y")) {
			}else if(str.equals("y")) {
			}else if(str.equals("N")) {
				a++;
			}else if(str.equals("n")) {
				a++;
			}else {
				System.out.println("다시 입력해주세요");
			}
		}while(a==0);
	}

}
