import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ScoreManeger sm = new ScoreManeger();
		int num=0;
		
		while(true) {
			System.out.println("성적관리 프로그램 ");
			System.out.println("dddd");
			System.out.println("--------------------------------");
			System.out.println("1.추가  2.검색  3.삭제  4.수정  5.종료");
			System.out.println("--------------------------------");
			num = sc.nextInt();
			
			if(num == 1) {		//추가 함수
				sm.input();
			}else if(num == 2) {		//검색 함수
				sm.output();
			}else if(num == 3) {		//삭제 함수
				sm.delete();
			}else if(num == 4) {		//수정 
				sm.modify();
			}else if(num == 5) {		//종료
				System.exit(0);
			}else {
				System.out.println("다시 입력하세요");
			}
		}

	}

}
