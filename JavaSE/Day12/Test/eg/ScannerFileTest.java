import java.util.*;
import java.io.*;
public class ScannerFileTest{
	public static void main(String[] args) throws Exception{
		//��һ��File������ΪScanner�Ĺ�����������Scanner��ȡ�ļ�����
		
		//Scanner sc = new Scanner(new File("ScannerFileTest.java"));
		File f = new File("ScannerFileTest.java");
		Scanner sc = new Scanner(f);
		
		System.out.println("ScannerFileTest.java�������£�");
		//�ж��Ƿ�����һ��
		while(sc.hasNextLine()){
			//����ļ��е���һ��
			System.out.println(sc.nextLine());
		}
	}
}