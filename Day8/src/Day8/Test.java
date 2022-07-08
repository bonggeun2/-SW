/*
상속  - ( 확장성, 유지보수성 )
-is ~ a 관계 ( is like a 관계는 사용금지 )

-상속해주는 클래스 -> super class
 subclass의 공통된 부분을 작성한다.
 
-상속받는 클래스 -> sub class
 순수하게 자기기능만 생각해서 확장
 
 -클래스간의 상속은 단일상속만 가능하다.
 
 -sub class명 뒤에 extends사용 
*/

package Day8;


class A{
	
	private String name;
	
	public A() {
		super();
		System.out.println("수퍼클래스 생성자");
	}
	public A(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public  void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

    class Test extends AA{
	int a;

	public Test(String str, int age) {
	super(str); // =>  부모의 생성자를 호출, 항상 첫번쨰라인에 존재
	a=age;
	System.out.println("서브클래스 생성자");
	}
	void setA(int a) {this.a=a;}
	public int getA() {return a;}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test("superman",1000);
		
		System.out.println(test.getName());
		System.out.println(test.getA());

	}

}
