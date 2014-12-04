public  class InstanceofTest{
	public static void main (String [] agrs){
		Person p = new Person("android",12);
		String str = new String("Hello");
		if(str instanceof Object){
			System.out.println("p 是Object类");
		}else{
			System.out.println("p 不是Object类");
		}
	
	}


}