/*
 오버라이딩 
  -상속관계시 superclass의 메소드를 재정의하는것 
  -부모가 제공하는 기능이 나에게 맞지않아서 재정의하는것
     -완전 재가공
     -확장 ( 내기능 추가 )
     
 이유 : 동적바인딩을 하기 위해서
*/

package Day8;

public class B {
	 public String toString() {
	        return super.toString()+"bbbbbbb";
	    }

	public static void main(String[] args) {
		B b = new B();
		
		System.out.println(b.toString());
		String str = new String("superman");
		System.out.println(str.toString());
	}
}
