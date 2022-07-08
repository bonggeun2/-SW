import java.util.Scanner;

public class col {
	
	int inputnum, inputnum2;
	char ch1;
	
	//생성자
	public col() {
		
	}
	public col(int num1, int num2, char ch) {
		num1 = inputnum;
		num2 = inputnum2;
		ch = ch1;
	}
	
	public int getA() {
		return inputnum;
	}
	public int getB() {
		return inputnum2;
	}
	
	public int getC() {
		return ch1;
	}
	
	public void setA(int num1) {
		num1 = inputnum;	
	}
	
	public void setB(int num2) {
		num2 = inputnum2;
	}
	
	public void setC(char ch) {
		ch = ch1;
	}
	
	public void enter() {
		System.out.println("정수를 입력하세요");
	}
		

		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exclass me = new Exclass(); //객체 생성(생성자 호출)	
		Exclass me1 = new Exclass(100, 200); //객체 생성(생성자 호출)		
		
		System.out.println(me.geta());
		System.out.println(me.getb());
		
		System.out.println(me1.geta());
		System.out.println(me1.getb());
		
		me.seta(30);
		me.seta(40);
		System.out.println(me1.geta());
		System.out.println(me1.getb());

	}

}