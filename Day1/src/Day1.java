/*
 * 1. 객체지향언어는 객체를 가지고 사용하는데 문법적으로 표현 -> class
   2. 100프로 상속구조
   3. 클래스외부 작업 -> 1.package 2.import
   4. main함수 -> 프로그램의 시작과 끝을 담당
      static함수는 객체와 무관하게 미리 메모리에 생성된다.
      모든곳에서 공유한다. 즉 전체에서 오직 한개다.
      
      class이름. 접근하는 방식은 static이다
      
      
    접근지정자
    1. private : 외부에서 절대로 접근이 불가능 -> field(멤버변수)
    2. default : 같은 패키지(폴더)내에서만 접근이 가능 -> field, method
    			 명시적으로 표현하지 않을경우 사용 
    3. protected : 외부패키지중 상속받은 자식객체만 접근가능 -> field, method
                   단일상속 , 다중상속  ( 단일상속을 원칙으로함 )
                   자바는 객체를 사용했을때 단일상속만 가능.
                   인터페이스는 다중상속이 가능.
    4. public : 아무나 다 접근가능 -> method
                  동적 바인딩이 가능하다.
      

   이름 규칙
   1. 클래스명 -> 첫글자는 대문자로
   2. 함수명, 변수명, -> 첫글자부터 소문자
   3. 공통 -> 이름 + 이름 두번쨰 이름의 첫글자는 대문자 
 */
class Day1{
	
	public static void main (String[] args) {
		System.out.println("Hellow java..");
		System.out.println();
		
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();
		
		char value4 = 65;
		char value5 = 0xac00;
		char value6 = 51;
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println();
		
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		
	}
	
}

