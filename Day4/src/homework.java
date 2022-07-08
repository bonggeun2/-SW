import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		String [][]name; // name 
		int [][][]score; // kor,eng,mat,total
		float [][]avg; // aver
		int []_class;
	
		name = new String[5][5];
		_class = new int[5];
		score = new int[3][3][4];
		avg = new float[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 선택하세요 1번: 입력, 2번: 출력, 3번: 검색, 4번 종료");
		int check = sc.nextInt();	
		if(check == 1) {
			for(int i=0; i<_class.length; i++) {
				System.out.println("반을 입력해주세요: (최대 5반까지 있습니다.)");
				_class[i] = sc.nextInt();
				for(int j=0; j<name.length; j++) {
					System.out.println("이름을 입력해주세요: ");
					name[i][j] = sc.next();
					for(int k=0; k<score[i][j].length-1; k++)
					{
						System.out.println("과목점수를 입력하세요 (국어, 영어, 수학)");
						score[i][j][k] = sc.nextInt();
						score[i][j][3] += score[i][j][k];
					}
					avg[i][j] = score[i][j][3] / 3.f;
				}
			}
		}else if(check == 2) {
			System.out.println("1번 : 전체출력, 2번 반출력");
			sc.next();
			if(sc.equals(1)) {
			for(int i=0; i<_class.length; i++) {
				System.out.println("Class :"+_class[i]);
				for(int j=0; j<name.length; j++) {
					System.out.println("이름 :"+name[i][j]);
					for(int k=0; k<score[i][j].length-1; k++) {
						System.out.println("점수 :"+score[i][j][k]);
					}
					System.out.println("평균 :"+avg[i][j]);
				}
			}
		}
			
		}else if(sc.equals(3)) {
			
		}else if(sc.equals(4)) {
				System.exit(0);
		}
		
		

	}

}
