class Outer{
	int a = 123;
	private String str = "geminno";
	
	void run(){
		String local_var = "�ֲ�����";
		final int num = 111;
		//�ֲ��ڲ���\
		//public class Inner{  //error
		//static class Inner{  //error
		class Inner{
			String str = "inner class";
			int aaa = 888;
			//static String var = "static_var";//�ֲ��ڲ����в��ܶ��徲̬����
			void inner_run(){
				//�����ھֲ��ڲ����з��ʾֲ����� local_var
				//System.out.println("�ڲ��ࣺ��Ա����" + local_var);
				System.out.println("�ڲ��ࣺ��Ա����" + num);
				System.out.println(a + "\t" + str);//�����ⲿ���еĳ���a���ڲ����еı���str
				System.out.println(Outer.this.str);//�����ⲿ���еı���str
				
			}
		}
		Inner in = new Inner();
		in.inner_run();
	}
}

public class LocalInner{
	public static void main(String[] args){
		Outer out = new Outer();
		out.run();
				
	}
}