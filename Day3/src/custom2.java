import java.util.Scanner;

public class custom2 {
		
		public static void main(String[] args) {
			String [][]name; // name 
			int [][][]score; // kor,eng,mat,total
			float [][]avg; // aver
			Scanner sc = new Scanner(System.in);
			
			// 메모리할당
			System.out.print("반 입력: "); 
			int num1 = sc.nextInt();
			name = new String[num1][];
			score = new int[num1][][];
			avg = new float[num1][];
			
			for(int i=0;i<num1;i++) {
				System.out.print("man: ");
				int num2 = sc.nextInt();
				
				name[i] = new String[num2];
				score[i] = new int[num2][4];
				avg[i] = new float[num2];
			}
			
			
		
			// 입력,연산
			for(int k=0;k<score.length;k++) {
				System.out.println(k+1+"class");
				for(int j=0;j<score[k].length;j++) {
					System.out.print("Name input :");
					name[k][j] = sc.next();  //이름 입력
					
					for(int i=0;i<score[k][j].length-1;i++) {
						System.out.print("score input :");
						score[k][j][i] = sc.nextInt();
						
						score[k][j][3] += score[k][j][i]; // 누적
					}
					
					avg[k][j] = score[k][j][3] / 3.f;
				}
			}
			
			//출력
			for(int k=0;k<score.length;k++) {
				System.out.println(k+1 +"Class");
				
				for(int j=0;j<score[k].length;j++) {
					System.out.print(name[k][j]+"\t");
					for(int i=0;i<score[k][j].length;i++) {
						System.out.print(score[k][j][i]+"\t");
					}			
					System.out.println(avg[k][j]);
				}
			}

		}

	}