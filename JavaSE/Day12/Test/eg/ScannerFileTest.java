import java.util.*;
import java.io.*;
public class ScannerFileTest{
	public static void main(String[] args) throws Exception{
		//将一个File对象作为Scanner的构造器参数，Scanner读取文件内容
		
		//Scanner sc = new Scanner(new File("ScannerFileTest.java"));
		File f = new File("ScannerFileTest.java");
		Scanner sc = new Scanner(f);
		
		System.out.println("ScannerFileTest.java内容如下：");
		//判断是否还有下一行
		while(sc.hasNextLine()){
			//输出文件中的下一行
			System.out.println(sc.nextLine());
		}
	}
}