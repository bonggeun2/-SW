package Day8;


class employee{					
	private String Name;
	private String Phone;
	private String Account;
	private String Pw;
	private Rg[] Rgw;
	
	public employee() {
		Rgw = new Rg[20];
	}
	
	public employee (String Name, String Phone, String Account, String Pw) {
		this.Name = Name;
		this.Phone = Phone;
		this.Account = Account;
		this.Pw = Pw;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	
	public void setPhone(String Phone){
		this.Phone = Phone;
	}
	public String getPhone() {
		return Phone;
	}
	
	public void setAccount(String Account){
		this.Account = Account;
	}
	public String getsetAccount() {
		return Account;
	}
	
	public void setPw(String Pw){
		this.Pw = Pw;
	}
	public String getPw() {
		return Pw;
	}
	

}


class Rg extends employee{
	
	private int RgYear;
	private String RgPosition;
	private int RgGrade;
	
	
	
	public Rg() {}
	public Rg(int RgYear, String RgPosition, int RgGrade ) {
		this.RgYear = RgYear;
		this.RgPosition = RgPosition;
		this.RgGrade = RgGrade;
	}
	
	public void setRgYear(int RgYear) {
		this.RgYear = RgYear;
	}
	public int getRgYear() {
		return RgYear;
	}
	
	public void setRgPosition(String RgPosition) {
		this.RgPosition = RgPosition;
	}
	public String getRgPosition(){
		return RgPosition;
	}
	
	public void setRgGrade(int RgGrade) {
		this.RgGrade = RgGrade;
	}
	public int getRgGrade() {
		return RgGrade;
	}
}
	


class nrg extends employee {

}


class admin extends employee{
	
	public void inputp() {
		
	}
	
	
}

	