/*
 * 인터페이스
 * - 추상클래스를 더 추상화시킨 구조.
 * - 구조 : 상수 + 추상메소드 
 * 
 * - 다중상속을 대체하기위해. ( 인터페이스를 여러개 받을수 있다. )
 * -implements 인터페이스명1, 인터페이스명2
 * -인터페이스도 동적바인딩이 가능.
 */


interface B{
	final static int a = 0;	// 상수
	
	public abstract void disp();	//추상메소드
}

interface C{
	final static int a = 0;	// 상수
	
	public abstract void disp1();	//추상메소드
}

interface D extends B,C{
	final static int a = 0;	// 상수
	
	public abstract void disp2();	//추상메소드
}

public class A extends Object implements D{
	public static void main(String[] args) {
		B b = new A();
		b.disp();
		D c = (D) b;
		c.disp();
		c.disp1();
		c.disp2();
		
		 
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("inter");
		
	}

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("inter");
	}
	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("inter");
	}
}
