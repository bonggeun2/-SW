class RgYear {
   private int rgYear;
   private int rgYearp;
   
   public RgYear() {}
   public RgYear(int rgYear, int rgYearp) {
      this.rgYear = rgYear;
      this.rgYearp = rgYearp;
   }
   public void setRgYearp(int rgYearp) {
      this.rgYearp = rgYearp;
   }
   public void setRgYear(int rgYear) {
      this.rgYear = rgYear;
   }
   public int getRgYear() {
      return rgYear;
   }
   public int getRgYearp() {
      if(rgYear > 3) {
         rgYearp += 10;
      }else if(rgYear > 5) {
         rgYearp += 30;
      }
      return rgYearp;
   }
}


class RgPosition{
   private String rgPosition;
   private String rgPositionp;
   
   public RgPosition() {}
   public RgPosition(String rgPosition, String rgPositionp) {
      this.rgPosition = rgPosition;
      this.rgPositionp = rgPositionp;
   }
   
   public void setRgPosition(String rgPosition) {
      this.rgPosition = rgPosition;
   }
   
   public String getRgPosition() {
      return rgPosition;
   }
   
   public void setRgPositionp(String rgPositionp) {
      this.rgPositionp = rgPositionp;
   }
   public float getRgPositionp() {
      
       if(rgPosition.equals("사원")) {
            rgPositionp = "0.0";
         }
         else if(rgPosition.equals("대리")) {
            rgPositionp = "0.2";
            Float.parseFloat(rgPositionp);
         }
         else if(rgPosition.equals("과장")) {
            rgPositionp = "0.4";
            Float.parseFloat(rgPositionp);
         }
         else if(rgPosition.equals("차장")) {
            rgPositionp = "0.6";
            Float.parseFloat(rgPositionp);
         }
         else if(rgPosition.equals("부장")) {
            rgPositionp = "0.8";
            Float.parseFloat(rgPositionp);
         }
      return  Float.parseFloat(rgPositionp);
   }
}

class RgGrade{
    private float rgGrade;
    private float rgGradep;
    
    public RgGrade() {}
    public RgGrade(float rgGrade, float rgGradep) {
      this.rgGrade = rgGrade;
    }
    
    public void setRgGrade(float rgGrade) {
       this.rgGrade = rgGrade;
    }
    public float getRgGrade() {
       if(rgGrade == 1) {
          rgGradep = 0.5f;
       }
       else if(rgGrade == 2) {
          rgGradep = 0.2f;
       }
       else if(rgGrade == 3) {
          rgGradep = 0.0f;
       }
       return rgGradep;
    }
   public void setRgGradep(float rgGradep) {
      this.rgGradep = rgGradep;
   }
   public float getRgGradep() {
      return rgGradep;
   }
}

public class RG {
    
    private RgYear rgYear;
    private RgYear rgYearp;
    private RgPosition rgPosition;
    private RgPosition rgPositionp;
    private RgGrade rgGrade;
    private RgGrade rgGradep;
    
    private float rgpay;
    
    private Name rgName;
    private Password rgPassword;
    private Phone rgPhone;
    private Account rgAccount;
    
    public RG() {
      rgYear = new RgYear();
      rgYearp = new RgYear();
      rgPosition = new RgPosition();
      rgPositionp = new RgPosition();
      rgGrade = new RgGrade();
      rgGradep = new RgGrade();
      rgpay = 200;
      
      
      rgName = new Name();
      rgPassword = new Password();
      rgPhone = new Phone();
      rgAccount = new Account();
      
    }
    
    public RG(int rgYear,int rgYearp,String rgPositionp, String rgPosition, float rgGrade,float rgGradep) {
       
       this.rgYearp = new RgYear(rgYearp, rgYear);
       this.rgPositionp = new RgPosition(rgPosition,rgPositionp);
       this.rgGradep = new RgGrade(rgGrade, rgGradep);
       rgpay = 200 + (this.rgGradep.getRgGradep()* 200 + this.rgYearp.getRgYearp() + this.rgPositionp.getRgPositionp()*200);
       
    }
    
    public RG(String rgName, String rgPassword, String rgPhone, String rgAccount) {
       this.rgName = new Name();
       this.rgPassword = new Password();
       this.rgPhone = new Phone();
       this.rgAccount = new Account();
    }
    public void setRgYear(int rgYear) {
       this.rgYear.setRgYear(rgYear);
    }
    public void setRgYearp(int rgYearp) {
       this.rgYearp.setRgYearp(rgYearp);
    }
    public void setRgPosition(String rgPosition) {
       this.rgPosition.setRgPosition(rgPosition);
    }
    public void setRgPositionp(String rgPositionp) {
       this.rgPositionp.setRgPositionp(rgPositionp);
    }
    public void setRgGrade(float rgGrade) {
       this.rgGrade.setRgGrade(rgGrade);
    }
    public void setRgGradep(float rgGradep) {
       this.rgGradep.setRgGradep(rgGradep);
    }
    
    public void setRgName(String rgName) {
       this.rgName.setName(rgName);
    }
    public void setRgPassword(String rgPassword) {
       this.rgPassword.setPassword(rgPassword);
    }
    public void setRgPhone(String rgPhone) {
       this.rgPhone.setPhone(rgPhone);
    }
    public void setRgAccount(String rgAcccount) {
       this.rgAccount.setAccount(rgAcccount);
    }
   
    public int getRgYear() {
       return rgYear.getRgYear() ;
    }
    public int getRgYearp() {
       return rgYearp.getRgYearp();
    }
    public String getRgPosition(){
       return rgPosition.getRgPosition();
    }
    public float getRgPositionp(){
       return rgPositionp.getRgPositionp();
    }
   
    public float getRgGrade() {
       return rgGrade.getRgGrade();
    }
    public float getRgGradep() {
        return rgGradep.getRgGradep();
     }
    
    public String getRgName() {
       return rgName.getName();
    }
    public String getRgPassword() {
       return rgPassword.getPassword();
    }
    public String getRgPhone() {
       return rgPhone.getPhone();
    }
    public String getRgAccount() {
       return rgAccount.getAccount();
    }
    
    public float getRgpay() {
    	return rgpay = 200 + (this.rgGradep.getRgGradep()* 200 + this.rgYearp.getRgYearp() + this.rgPositionp.getRgPositionp()*200);
    }
    
}