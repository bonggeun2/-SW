


class Name{
	private String name;
	
	public Name() {}  //생성자 객체 등록만
	public Name(String name) {
		this.name=name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
	
class Subject{
	private int subject;
	
	public Subject() {
		subject = 0;
	}
	public Subject(int subject) {
		this.subject=subject;
	}
	public void setSubject(int subject) {
		this.subject=subject;
	}
	public int getSubject() {
		return subject;
	}
}


public class cl {

	private Name name;
	private Subject kor;
	private Subject eng;
	private Subject math;
	private int total;
	private float avg;
	
	public cl() {
		name = new Name();
		kor = new Subject(); 
		eng = new Subject();
		math = new Subject();
		total = 0;
		avg = 0.f;
	}
	
	public cl(String name, int kor, int eng, int math) {
		this.name =  new Name(name);
		this.kor = new Subject(kor);
		this.eng = new Subject(eng);
		this.math = new Subject(math);
		
		total = this.kor.getSubject()+this.eng.getSubject()+this.math.getSubject();
		avg = total/3.f;
		
	}
	
	public void setName(String name) {
		this.name.setName(name);
	}
	public void setKor(int kor) {
		this.kor.setSubject(kor);
	}
	public void setEng(int eng) {
		this.eng.setSubject(eng);
	}
	public void setMath(int math) {
		this.math.setSubject(math);
	}
	
	public String getName() {
		return name.getName();
	}
	public int getkor() {
		return kor.getSubject();
	}
	public int getEng() {
		return eng.getSubject();
	}
	public int getMath() {
		return math.getSubject();
	}
	public int getTotal() {
		return kor.getSubject()+eng.getSubject()+math.getSubject();
	}
	public float getAvg() {
		return avg = getTotal()/3.f;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cl cll = new cl("man",10,20,30);
		System.out.println(cll.getName());
		System.out.println(cll.getkor());
		System.out.println(cll.getEng());
		System.out.println(cll.getMath());
		System.out.println(cll.getTotal());
		System.out.println(cll.getAvg());

	}

}
