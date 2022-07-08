
public class B {
	/*
		this()
		: 생성자에서 오버로딩된 또 다른 생성자를 호출할때 사용
		
	*/	

	int a;
	int b;


	public B() {
		this(0,0);
	}
	public B(int a) {
		//this.a = a;
		this(a,0);
	}
	public B(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public int getA() {
		return a;
	}
	public int getB() {
		return this.b;
	}


		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			B b = new B();
			B b1 = new B(10);
			B b2 = new B(20,30);
			
			System.out.println(b.getA()+"\t"+b.getB());  //0, 0
			System.out.println(b1.getA()+"\t"+b1.getB()); //10, 0
			System.out.println(b2.getA()+"\t"+b2.getB()); //20, 30

	}

}
