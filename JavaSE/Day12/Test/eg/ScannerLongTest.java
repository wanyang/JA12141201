
import java.util.Scanner;
public class ScannerLongTest{
	public static void main(String[] args){
		
		//System.in �����׼���룬���Ǽ�������
		Scanner sc = new Scanner(System.in);
		
		//��������һ�н�ֻ�ѻس���Ϊ�ָ���
		sc.useDelimiter("\n");
		
		//�ж��Ƿ�����һ��long ����
		while(sc.hasNextLong()){
			System.out.println("��������������ǣ�" + sc.nextLong());
		}
		
	}
}

