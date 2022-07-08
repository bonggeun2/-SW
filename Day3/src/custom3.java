import java.util.Scanner;

public class _array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][]name;
		int [][][]score;
		float[][]avg;
		int []classes;
		Scanner sc = new Scanner(System.in);
		
		//메모리 할당
		name = new String[3][3];
		score = new int[3][3][4];
		avg = new float[3][3];
		classes = new int[3];
		
		for(int i=0; i<classes.length; i++) {
			System.out.println("반을 입력해주세요: ");
			classes[i] = sc.nextInt();
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
		for(int i=0; i<classes.length; i++) {
			System.out.println("Class :"+classes[i]);
			for(int j=0; j<name.length; j++) {
				System.out.println("이름 :"+name[i][j]);
				for(int k=0; k<score[i][j].length-1; k++) {
					System.out.println("점수 :"+score[i][j][k]);
				}
				System.out.println("평균 :"+avg[i][j]);
			}
		}
	}
}

