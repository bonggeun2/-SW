import java.util.Scanner;

/*
1사람의 성적처리프로그램

입력 : 이름, 국어, 영어, 수학
연산 : 총점, 평균
출력 : 이름, 국어, 영어, 수학, 총점, 평균

*/
public class _custum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; //name
		int []score; //kor,eng,mat,total
		float avg; //aver
		
		score = new int[4];
		String []str = new String[4];

		str[0] = "국어 : ";
		str[1] = "영어 : ";
		str[2] = "수학 : ";
		
		
		System.out.println("이름을 입력하세요:");
		Scanner sc =new Scanner(System.in);	
		String string = sc.next();
		
	

		for(int i=0; i<3; i++) {
			System.out.println(str[i]);
			score[i] = sc.nextInt();
			//score[4] = score[4]+score[i];
			score[3] += score[i];
		}
		
		 avg = (float)score[3] / 3 ;
		 
		 System.out.println(string);
				for(int j=0; j<3; j++) {
					System.out.println(str[j]+""+score[j]);
				}
				System.out.println("총점 :"+score[3]);
				System.out.println("평균 :"+avg);
				
				
		//for(int i:score){            //foreach문
		//	System.out.println(i);
		//		}
				
		}
	
		
}
