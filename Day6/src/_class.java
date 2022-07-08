
/*
 	class 관계
 	
 	1. has ~ a 관계	( ~ 가 ~를 가지고 있다. )	-> 포함오브젝트
 	2, is ~ a 관계	( ~ 는 ~ 이다. ) -> 상속
		
*/

class A{ 	//데이터클래스 : 독립적으사용
	private int a;
	public A() {}
	public A(int a) {this.a = a;}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}

public class _class {	 //개인정보 관리
	
	private String name;	//has ~ a 관계
	//private int age;
	private A age;	//has ~ a 관계
	
	public _class() {
		age = new A();
	}
	public _class(String name, int age) {
		this.name = name;
		this.age = new A(age);
		//this.age.setA(age);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age.getA();
	}
	
	public static void main(String[] args) { //사용자

		_class stu1 = new _class();		
		_class stu = new _class("man",3000);
				
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
	}

}
