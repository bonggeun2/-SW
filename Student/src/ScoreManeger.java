
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScoreManeger {

	ArrayList<StudentData> list;
	Scanner sc;
	private int kor, eng, math;
	private String Stunum, Name, all;
	private float avg;
	boolean flag;
	

	
	ScoreManeger(){
		list = new ArrayList();
		sc = new Scanner(System.in);
	}
	
	void input() { //입력
		int i = 1;
		int a = 0;
		int k = 0;
		
		while(i == 1) {
		System.out.println("이름을 입력하세요: ");
		Name = sc.next();
		System.out.println("학번을 입력하세요: ");
		Stunum = sc.next();
		
		System.out.println("국어점수를 입력하세요: ");
		kor = sc.nextInt();
		System.out.println("수학점수를 입력하세요: ");
		math = sc.nextInt();
		System.out.println("영어점수를 입력하세요: ");
		eng = sc.nextInt();
		

		list.add(new StudentData(Name, Stunum, kor, math, eng));
	
		System.out.println("1.추가 입력 2. 입력종료" );
		a = sc.nextInt();
			if(a == 1) {
				continue;	
			}else if(a == 2) {
				i--;
			}else {
				System.out.println("다시 입력해주세요!");
			}
		}
	}
	
	void output() {	 //검색
		int a = 0;
		String b;
		System.out.println("1.전체출력 2.개별출력 3.성적순출력");
		a = sc.nextInt();
		if(a == 1) {
			for(int i=0; i<list.size(); i++) {
		System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println(list.get(i).getAll());
		}
	}else if(a == 2) {
		for(int i=0; i<list.size(); i++) {
			System.out.println("이름 or 학번을 입력하세요");
			b = sc.next();
			if(b.equals(list.get(i).getName())|| b.equals(list.get(i).getstunum())) { 	//이름 or 학번 입력 
				System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
				System.out.println(list.get(i).getAll());
			}
		}
	}else if(a == 3) {	
		//성적별 출력	
		Collections.sort(list, new StdComparator());
		//Collections.sort(list, new StudenttotalComparator());
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getAll());
			
		}
	}
}
	
	class StdComparator implements Comparator<StudentData>{		//
		@Override
		public int compare(StudentData a,StudentData b){
			if(a.getTotal()>b.getTotal()) return 1;
			if(a.getTotal()<b.getTotal()) return -1;
			return -1;
		}
	}
	
	//수정
	void modify() {
		int num;
		String search;
		int score;
		
		System.out.println("---------수정----------");
		for (;;) {
			for (int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getAll());
			}
			
			System.out.println("1. 학번  2. 이름  3.수정 종료");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("학번을 입력해주세요");
				search = sc.next();
				
				for (int i=0; i<list.size(); i++) {
					if(list.get(i).getstunum().equals(search)) {
						System.out.println("-------------------------------------------------");
						System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
						System.out.println(list.get(i).getAll());
						System.out.println("-------------------------------------------------");
						for(;;) {
							
							System.out.println("1. 국어  2. 영어  3. 수학  4.수정종료");
							num=sc.nextInt();
							if(num==1) {
								System.out.println("국어점수 : ");
								score = sc.nextInt();
								list.get(i).setKor(score);
								System.out.println(score+"로 수정완료!");
							}
							else if(num==2) {
								System.out.println("영어점수 : ");
								score = sc.nextInt();
								list.get(i).setMat(score);
								System.out.println(score+"로 수정완료!");
							}
							else if(num==3) {
								System.out.println("수학점수 : ");
								score = sc.nextInt();
								list.get(i).setEng(score);
								System.out.println(score+"로 수정완료!");
							}
							else if(num==4) {
								System.out.println("수정종료");
								break;
							}
							else {
								System.out.println("다시 입력해주세요");
							}
						}
					}
				}
			}
			else if(num==2) {
				System.out.println("이름을 입력해주세요");
				search=sc.next();			
				
				for (int i=0; i<list.size(); i++) {
					if(list.get(i).getName().equals(search)) {
						for(;;) {
							System.out.println("-------------------------------------------------");
							System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
							System.out.println(list.get(i).getAll());
							System.out.println("-------------------------------------------------");
							System.out.println("1. 국어  2. 영어  3. 수학  4.수정종료");
							num=sc.nextInt();
							if(num==1) {
								System.out.print("국어점수 : ");
								score = sc.nextInt();
								list.get(i).setKor(score);
								System.out.println("수정완료!");
							}
							else if(num==2) {
								System.out.print("영어점수 : ");
								score = sc.nextInt();
								list.get(i).setMat(score);
								System.out.println("수정완료!");
							}
							else if(num==3) {
								System.out.print("수학점수 : ");
								score = sc.nextInt();
								list.get(i).setEng(score);
								System.out.println("수정완료!");
							}
							else if(num==4) {
								System.out.println("수정종료");
								break;
							}
							else {
								System.out.println("다시 입력해주세요");
							}
						}
					}
				}
			}
			else if(num==3) {
				System.out.println("수정을 종료합니다");
				break;
			}
			else {
				System.out.println("다시입력해주세요");
			}
		}
	}
			
	public void delete() {	//삭제
		String num;
		
		System.out.println("--------------삭제--------------");
		System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getAll());
		}
		System.out.print("삭제할 학번을 입력해주세요 : ");
		num= sc.next();
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getName().equals(num)) {
				System.out.println("학번 : "+num+"을 삭제합니다");
				list.remove(i);
			}
		}
	}
	
}