import java.util.Scanner;

class name{ 	//데이터클래스 : Name
	private String a;
	public name() {}
	public name(String a) {this.a = a;}
	
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
}

class Subject{ 	//데이터클래스 : 과목
	
	private int kor;
	private int eng;
	private int math;
	
	public Subject() {
	}
	public Subject(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public int 

	
		
	
 }

public class score {	 //성적 관리
	
	private String name;	//has ~ a 관계
	//private int age;
		//has ~ a 관계
	private int score1;
	
	public score() {
	}
	public score(String name) {
		this.name = name;
		//this.age.setA(age);
	}
	public score(int score1) {
		this.score1 = score1;
		//this.age.setA(age);
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		score sc1 = new score(sc.next());
		
		for(int i=0; i<3; i++) {
			System.out.println("과목 점수를 입력하세요: ");
			score sc2 = new score(sc.nextInt());
		}
		
		System.out.println(sc1.getName());
		System.out.println(sc1.getScore());
	}

}
