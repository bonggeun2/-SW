
public class Exclass {
	/*	
	클래스의 구성요소
	
	1.field
	data
	-외부에서 객체를 사용할떄 지속적으로 사용되어져야하는 데이터.
	-접근지정자는 주로 private으로 지정
	-instance field
	-static field
	-필드 사용은 항상 메소드를 통해서 사용하게끔 해라
	
	2.constructor (생성자 함수) : 객체 생성시 자동호출되어진다. 이떄 딱 한번.
	-디폴트기능 : 객체등록 ( 생성자가 호출이 안될경우 객체를 생성할수없다. ), 생성자를 명시적으로 만들지 않을경우 디폴트생성자를 제공해준다.
	-오버로딩이 가능 ( 객체를 다양하게 만들수있다. )	 
	-리턴타입이 없다.
	-함수명도 무조건 클래스명과 동일하게 만들어여한다.
	-기능 : 객체생성시 필드초기화     
	-접근지정자는 주로 public으로 사용한다.  ( 외부에서 사용이 용이하기 때문)  
	
	3. method
	-외부에서 필드를 접근하는 목적
	-public으로 주로 지정.
	
	상속구조,
	-최상위 클래스 Object
	
	
	this
	-항상 인스턴스메소드의 첫번째 멤버변수로 항상 존재하고있다.
	사용만 가능하고 만들수는 없다.
	- 객체를 구별해준다. , 메모리절약효과
	-지역변수와 필드변수의 이름이 같을때 사용 this가 붙으면 필드
	
	
	*/
	
	//필드 
	//int a=10; 상수일때만 이런 표현식을 사용해라. final
	private int a;
	
	/*
	 * public void setA(int a) { this.a =a; }
	 * 
	 * public int getA() { return a; }
	 * 
	 * public Exclass getObject() { return this; }
	 * 
	 */
	public static void setA(Exclass this01, int a) {
		//필드입력
		this01.a = a;
	}
	public static int getA(Exclass this01) {
		return this01.a;
	}
	//생성자
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Exclass me = new Exclass(); me.setA(1000); System.out.println(me.getA());
		 */
		Exclass me = new Exclass();
		// 세터 호출 1000입력
		me.setA(me,1000);
		//게터호출 1000출력
		System.out.println(getA(me));

	}

}
