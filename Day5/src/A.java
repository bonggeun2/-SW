import java.util.Scanner;

public class A {

	
	
	//필드
	private int a;
	private char op;
	private int b;
	private float result;
	
	
	//생성자
	public A() {
	}
	public A(int aa, char opp, int bb) {
		a=aa;
		op=opp;
		b=bb;
	}
	
	//세터
	public void setA(int aa) {
		a=aa;
	}
	public void setB(int bb) {
		b=bb;
	}
	public void setOp(char opp) {
		op=opp;
	} 
	
	//게터
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getOp() {
		return op;
	}
	/*
	 * public float getResult() { return result; }
	 */
	
	//입력함수
	public void print() {
		System.out.println("정수를 입력하세요: ");
	}
	public void print1() {
		System.out.println("연산을 입력하세요: ");
	}
	//연산 함수
	
	public float plus() {
		return result = a+b;
	}
	
	public float minus() {
		return result = a-b;
	}
	
	public float x() {
		return result = a*b;
	}
	
	public float p() {
		return result = a/b;
	}

	public static void main(String[] args) {

	A me = new A();
	Scanner sc =new Scanner(System.in);
	
		me.print();
		me.setA(sc.nextInt());
		me.print();
		me.setB(sc.nextInt());
		me.print1();
		me.setOp(sc.next().charAt(0));
		switch(me.getOp()) {
		case '+' : System.out.println(me.plus()); break;
		case '-' : System.out.println(me.minus()); break;
		case '*' : System.out.println(me.x()); break;
		case '/' : System.out.println(me.p());
		}
	}
}
