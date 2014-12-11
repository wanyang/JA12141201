class Outer{
	int a = 123;
	private String str = "geminno";
	
	void run(){
		String local_var = "局部变量";
		final int num = 111;
		//局部内部类\
		//public class Inner{  //error
		//static class Inner{  //error
		class Inner{
			String str = "inner class";
			int aaa = 888;
			//static String var = "static_var";//局部内部类中不能定义静态变量
			void inner_run(){
				//不能在局部内部类中访问局部变量 local_var
				//System.out.println("内部类：成员方法" + local_var);
				System.out.println("内部类：成员方法" + num);
				System.out.println(a + "\t" + str);//访问外部类中的常量a和内部类中的变量str
				System.out.println(Outer.this.str);//访问外部类中的变量str
				
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