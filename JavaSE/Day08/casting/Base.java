public class Base{
	int a = 123;
	private    String pri_str = "˽�б���";
			   String def_str = "Ĭ�ϱ���";
	protected  String pro_str = "protected����";
	public     String pub_str = "public����";
	
	//
	private void pri_show(){
		System.out.println("˽�з���");
	}
		void def_show(){
		System.out.println("Ĭ�Ϸ���");
	}
	
	protected void pro_show(){
		System.out.println("protected����");
	}
	
	public void pub_show(){
		System.out.println("public����");
	}
}