public class Account{
	private String user = "wanyang";
	private String password = "123456";
	
	public void setPwd(String str){
		this.password = str;
	}
	public void info(){
		System.out.println("user:" + this.user + "\tpassword:" + this.password);
	}
	
}