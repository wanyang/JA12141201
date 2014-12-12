import java.io.*;
import java.util.*;
public class SystemTest{
	public static void main(String[] args) throws Exception{
		
		//��ȡϵͳ���еĻ�������
		Map<String,String> env = System.getenv();
		for(String name : env.keySet()){
			System.out.println(name + "--->" + env.get(name));
		}
		
		//��ȡָ�������ı���
		System.out.println("JAVA_HOME");
		
		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		
		//�����е�ϵͳ���Ա��浽props.txt�ļ���
		props.store(new FileOutputStream("props.text"),"System Properties");
		
		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
	}
}