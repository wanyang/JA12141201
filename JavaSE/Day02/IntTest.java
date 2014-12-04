public class IntTest{
	public static void main(String args[]){
		//整型常量默认自动化转化int类型
		int num = 88;
		//大整形常量不会自动转化为long类型，如果超出int范围，报错
		//long long1 = 8888888888888888;
		long long1 = 8888888888888L; //建议是大写L
		long long2 = 8888888888888l;
		
		//八进制表示整形：以0开头
		int var = 013;
		System.out.println("var:" + var);		
		//十六进制表示整形：以0x,0X开头
		int hexNum = 0xFF;
		int hexNum1 = 0X1F;
		System.out.println("hexNum:" + hexNum + "\n hexNum1" + hexNum1);
		//二进制表示：以0b，0B开头e
		byte byteNum = (byte)0b11111111;
		int intNum = (byte)0b11111111; 
		System.out.println("intNum:" + intNum + "\n byteNum" + byteNum);
		
	
	}
	

}

