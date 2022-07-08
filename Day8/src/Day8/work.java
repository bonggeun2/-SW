package Day8;

import java.util.Scanner;

abstract class Memory{
	
	 int[] a;
	 int index=0;
	 
	 Memory(){
		 a = new int[5];
		 index = 0;
	 }
	 
	public final void Push(int b) {  
		 a[index]=b;
		 System.out.println("입력: "+a[index]);
		 index++;
	}
	 
	public abstract void PoP();
}

class Mystack extends Memory{
	
	@Override
	public void PoP() {
		System.out.println(a[index]--);
		index--;
	}
	
}

class MyQ extends Memory{
	
	@Override
	public void PoP() {
		System.out.println(a[index]);
		index++;
	}
}


	public class work {
	 public static void main(String[] args) {
		 
		 int a, a1, a2 = 0;
		 Scanner sc = new Scanner(System.in);
		 
		 Memory me = null;
		 Mystack ms = new Mystack();
		 MyQ mq = new MyQ();
		 
		 System.out.println("1.stack   2.Q");
		 a = sc.nextInt();
		 while(true) {
			 if(a == 1) {
				System.out.println("1.push   2.pop");
				a1 = sc.nextInt();
				if(a1 == 1) {
					System.out.println("push 수 입력: ");
					a2 = sc.nextInt();
					ms.Push(a2);
					ms.PoP();
				}else if(a1 == 2 ) {
					System.out.println("pop : ");
					a2 = sc.nextInt();
					ms.Push(a2);
				}
				
			 }else if(a == 2) {
				 System.out.println("1.push   2.pop");
				 a2 = sc.nextInt();
				 if(a2 == 1) {
						System.out.println("push 수 입력: ");
						int aa = sc.nextInt();
						ms.Push(aa);
					}else if(a2 == 2 ) {
						System.out.println("pop : ");
						a1 = sc.nextInt();
						mq.Push(a1);
						mq.PoP();
					}
			 } 
		 }
	 }
}
 

