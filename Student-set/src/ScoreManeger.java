
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class ScoreManeger {
	Scanner sc;
	private int kor, eng, math;
	private String Stunum, Name, all;
	boolean flag;
	
	ScoreManeger(){
		sc = new Scanner(System.in);
	}
	
	Set<StudentData> set = new HashSet();
	
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
		
		
		set.add(new StudentData(Name, Stunum, kor, math, eng));
		Iterator<StudentData> it = set.iterator();
	
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
	
	void output() {	 //검색0
		int a = 0;
		String b;
		Iterator<StudentData> it = set.iterator();
		
		System.out.println("1.전체출력 2.개별출력 3.성적순출력");
		a = sc.nextInt();
		if(a == 1) {
			while(it.hasNext()) {
				System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
				System.out.println(it.next().getAll());
			}
	}else if(a == 2) {
			 
			 Iterator<StudentData> it1 = set.iterator();
			 System.out.println("학번or이름을 입력해주세요!");
			 b = sc.next();
			 while(it.hasNext()) {
				 StudentData s = it.next();
			 if(s.getName().equals(b) || s.getstunum().equals(b)) {
				 System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");	
				 	System.out.println(s.getAll());
			 }
	}
				 
	}else if(a == 3) {	
		ArrayList<StudentData> flist = new ArrayList<>(set);			//hashset => list변환
		Collections.sort(flist, new StdComparator());			//정렬
		for (StudentData s : flist){
		    System.out.println(s.getAll());
		}
		}
	}
	class StdComparator implements Comparator<StudentData>{		
		@Override
		public int compare(StudentData a,StudentData b){
			if(a.getTotal()>b.getTotal()) return 1;
			if(a.getTotal()<b.getTotal()) return -1;
			return 1;
		}
	}
	
	
	void modify() {			//수정
		String s;
		int num, score;
		Iterator<StudentData> it2 = set.iterator();
		
		System.out.println("--------------수정--------------");
		while(it2.hasNext()) {
			System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
			System.out.println(it2.next().getAll());
		}
		System.out.println("수정하실 학번을 입력해주세요: ");
		s = sc.next();
		Iterator<StudentData> itt = set.iterator();
		while(itt.hasNext()) {
			StudentData ss = itt.next();
			if(s.equals(ss.getstunum())) {
				System.out.println("1. 국어  2. 영어  3. 수학  4.수정종료");
				num=sc.nextInt();
				if(num==1) {
					System.out.println("국어점수 : ");
					score = sc.nextInt();
					ss.setKor(score);
					System.out.println(score+"로 수정완료!");
				}
				else if(num==2) {
					System.out.println("영어점수 : ");
					score = sc.nextInt();
					ss.setMat(score);
					System.out.println(score+"로 수정완료!");
				}
				else if(num==3) {
					System.out.println("수학점수 : ");
					score = sc.nextInt();
					ss.setEng(score);
					System.out.println(score+"로 수정완료!");
				}
				else if(num==4) {
					System.out.println("수정종료");
					break;
				}
			}
		}
		
		}

	public void delete() {	//삭제
		String num;
		Iterator<StudentData> it3 = set.iterator();
		
		System.out.println("--------------삭제--------------");
		while(it3.hasNext()) {
			System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
			System.out.println(it3.next().getAll());
		}
		System.out.print("삭제할 학번을 입력해주세요 : ");
		num= sc.next();
		while(it3.hasNext()) {
			StudentData s = it3.next();
			if(num.equals(s.getstunum())) {
				set.remove(s);
			}
		}
		}
}