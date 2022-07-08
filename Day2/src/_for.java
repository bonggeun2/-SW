import java.util.Scanner;

public class _for {
public static void main(String[] args) {
		
	/*
	 * Scanner sc =new Scanner(System.in);
	 * 
	 * System.out.println("숫자를 입력하세요:");
	 *  int num = sc.nextInt();
	 * 
	 * for(int i=1; i<10; i++ ) {
	 *  System.out.println(num*i); 
	 *  }
	 * 
	 * 
	 * int n=0; int m=1; 
	 * for(m=1; m<500; m*=2) {
	 *  n+=1; 
	 *  }
	 * System.out.println(n);
	 * System.out.println(m);
	 */
	
   for(int i=1; i<10; i++) {
	   for(int m=2; m<10; m++) {
		   System.out.print(m+"*"+i+"="+(m*i));
		  // System.out.printf("%d*%d=%d",m,i,(m*i));
		   System.out.print("\t");
	   }
	   System.out.println();
   }
  
 }
}
