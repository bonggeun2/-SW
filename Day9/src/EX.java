

interface AA{
	void abc();
	default void bcd() {
		System.out.println("A 인터페이스");
	}
}

class BB implements AA{
	public void abc() {
		System.out.println("B클래스의 abc");
	}
}

class CC implements AA{
	public void abc() {
		System.out.println("c클래스의 abc");
	}
	public void bcd() {
		System.out.println("c클래스의 bcd");
	}
}

public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA a1 = new BB();
		AA a2 = new CC();

		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();

	}

}
