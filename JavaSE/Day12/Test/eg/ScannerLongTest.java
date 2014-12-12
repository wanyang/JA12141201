
import java.util.Scanner;
public class ScannerLongTest{
	public static void main(String[] args){
		
		//System.in 代表标准输入，就是键盘输入
		Scanner sc = new Scanner(System.in);
		
		//增加下面一行将只把回车作为分隔符
		sc.useDelimiter("\n");
		
		//判断是否还有下一个long 整数
		while(sc.hasNextLong()){
			System.out.println("键盘输入的内容是：" + sc.nextLong());
		}
		
	}
}

