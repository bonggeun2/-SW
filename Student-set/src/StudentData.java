import java.util.Comparator;

public class StudentData  {
	
	private int kor,eng,mat;
	private String name,stunum;
	private String all;

	public StudentData(String name,String stunum, int kor, int eng, int mat){
		this.stunum = stunum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
	

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getstunum() {
		return stunum;
	}
	public void setId(String stunum) {
		this.stunum = stunum;
	}
	public int getTotal() {
		return (kor+eng+mat);
	}
	public float getAvg() {
		float avg =kor+eng+mat/3.f;
		String str = String.format("%.2avg",avg);
		return avg;
	//	return (kor+eng+mat)/3.f;
	}
	public String getAll() {
		int total = kor+eng+mat;
		all=stunum + "\t"+name +"\t"+kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+(float)total/3.f;
		return all;
	}
}