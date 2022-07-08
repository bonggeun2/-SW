import java.util.Scanner;
public class student {
	
	private cl[] stu;
	private int num;
	private int pos;
	
	public student(int num) {
		pos = 0;
		this.num = num;
		stu = new cl[num];
		for(int i=0;i<stu.length;i++) {
			stu[i] = new cl();
		}
	}
	
	public void setStuInfo(String name, int kor, int eng, int math) {
		stu[pos].setName(name);
		stu[pos].setKor(kor);
		stu[pos].setEng(eng);
		stu[pos].setMath(math);
		
		pos++;
	}
	
	public void disp() {
		for(int i=0; i<pos-1; i++) {
			System.out.println(stu[i].getName());
			System.out.println(stu[i].getkor());
			System.out.println(stu[i].getEng());
			System.out.println(stu[i].getMath());
			System.out.println(stu[i].getTotal());
			System.out.println(stu[i].getAvg());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사람수를 입력하세요: ");
		int a = sc.nextInt();
		student std = new student(a);
		
		for(int i=0; i<a; i++) {
			System.out.println("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.println("국어점수을 입력하세요: ");
			int kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요: ");
			int eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요");
			int math = sc.nextInt();
		}
		
		std.disp();
		
//		for(int i=0; i<a; i++) {
//			 
//			 System.out.println("이름을 입력하세요: ");
//			 cll.setName(sc.next());
//			 System.out.println("국어점수를 입력해주세요: ");
//			 cll.setKor(sc.nextInt());
//			 System.out.println("영어점수를 입력해주세요: ");
//			 cll.setEng(sc.nextInt());
//			 System.out.println("수학점수를 입력해주세요: ");
//			 cll.setMath(sc.nextInt());
//		}
//		
//		for(int i=0; i<a; i++) {
//			System.out.println("이름: "+cll.getName());
//			System.out.println("국어성적: "+cll.getkor());
//			System.out.println("영어성석: "+cll.getEng());
//			System.out.println("수학성적: "+cll.getMath());
//			System.out.println("총점: "+cll.getTotal());
//			System.out.println("평균"+cll.getAvg());
//		}
	}

}
