import java.util.Scanner;

public class plus {
	
	public static int num1, num2;
	public static char ch1;
	
	public static void num() {
		Scanner sc =new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요: ");
		int num2 = sc.nextInt();
	}

	public static void ch() {
		Scanner sc =new Scanner(System.in);
		System.out.println("연사자를 입력하세요: ");
		char ch1 = sc.next().charAt(0);
	}
		
	public static void a(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void b(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	public static void c(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static void d(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		plus.num();
		plus.ch();
		
		switch(ch1) {
		 case '+': plus.a(num1, num2); break;
		 case '-': plus.b(num1, num2); break;
		 case '*': plus.c(num1, num2); break;
		 case '/': plus.d(num1, num2);
		}
	}
}
