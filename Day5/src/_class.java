/*
모듈화
1.call by name
2.call by value
3.call by reference

static method
- instance field를 메소드에서 사용불가
- static field를 사용할수있다.


instance method
- static field를 사용할 수 있다.
- instance field 사용할 수 있다


오버로딩//Overroding
1. 동일한 함수명으로 여러개의 함수를 제공
2. 매개변수의 타입이 다를경우
3. 매개변수의 갯수가 다를경우
4. 2,3번중 하나만 달라도 가능하다.
5. 목적 : 다형성. 편할려고
6. 같은 목적으로 사용하는 것끼리만 만들어라.. (주의사항)
7. 같은 클래스내에서 사용.

field는 항상 메소드를 통해서 사용*

*/

// 접근지정자 keyword(static) 리턴타입 함수명 ( 매개변수 )
public class _class {
	
	public static void hello() {	   //call by name
		System.out.println("hello");
	}
	
	public  void hello2() {             //call by name	     	        
		System.out.println("hello");
	}
	
	public void hello3(int a) {			//call by value
		System.out.println(a);
	}
	
	public int hello4() {			//call by value
		return 10;
	}
	
	public int hello5(int a) {		//call by value
		return 20;
	}
	public int hello(int a, int b) {			//call by value
		return a+b;
	}
	
	public static void main(String[] args) {
	
		
		_class.hello();  //함수호출
		
		//객체셍성 
		_class _cl;   //레퍼런스변수 선언
		_cl = new _class(); //객체생성
		_cl.hello2();
		
		_cl.hello3(200);
		int data =_cl.hello4();
		System.out.println(data);
		
		int data2 =_cl.hello5(0);
		System.out.println(data2);
		
		int data3 = _cl.hello(100, 200);
		System.out.println(data3);
		
	}

}
