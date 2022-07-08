package Day8;

/*
 *	추상클래스
 *	-특정 부분이 구체화가 되지 않은 클래스
 * 	-객체를 생성할수없고, 상속을 목적으로 사용한다.
 *	-추상메소드를 하나이상 가지고 있는 클래스  
 *  -추상메소드 이름만 정의 하고 바디가 없는 메소드 ( 함수선언 )
 *  -추상클래스를 상속받는 서브클래스는 추상메소드를 꼭 오버라이딩을 해야한다
 *   만약 오버라이딩을 하지 않을경우 서 브클래스도 추상클래스화 되서 객체를 생성할 수 없다.
 *   
 *   오버라이딩 = 상속받은 메소드를 재정의 하는것.
 *   
 *   -anonymoous inner class로 만들경우에는 객체생성이 가능
 *   
 *   final
 *   1. 필드 => 상수화 (변하지 않는 값)
 *   2. 메소드 => 오버라이딩 금지.
 *   3. class => 상속금지 => has ~ a 로만 사용해라
 *   *	
 *   
 *   동적 바인딩
 *   -상속관계일때 부모의 래퍼런스로 자식객체를 접근하는방식.
 *   -부모의 레퍼런스로 인식할수있는 범위는 부모의 원래 알고 있는 것까지만...
 * 
 */

abstract class Abs{
	
	 public abstract void draw();//추상메소드

}

class Rect extends Abs{
	
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Tri extends Abs{

	@Override
	public void draw() {
		System.out.println("Tri");
	}
//	@Override
//	public void draw() {
//		System.out.println("Tri");
//	}
	
}

class Cir extends Abs{
	@Override
	public void draw() {
		System.out.println("Cir");
	}
	
}

public class AA {
	
	public static void main(String[] args) {
		
		Abs abs;
		
		Rect rect = new Rect();// 정적 바인딩 : 내 패러펀스로 내 타입의 객체를 접근하는 방식
		rect.draw();
		
		Tri tri = new Tri();
		tri.draw();
		
		Cir cir = new Cir();
		cir.draw();
		
		abs = rect; // 동적바인딩
		abs.draw();
		
		abs = tri;
		abs.draw();
		
		abs = cir;
		abs.draw();
	}
}
