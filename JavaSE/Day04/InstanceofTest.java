public  class InstanceofTest{
	public static void main (String [] agrs){
		Person p = new Person("android",12);
		String str = new String("Hello");
		if(str instanceof Object){
			System.out.println("p ��Object��");
		}else{
			System.out.println("p ����Object��");
		}
	
	}


}