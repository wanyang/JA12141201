public class ArgsTest{
	public static void main(String[] args){
		System.out.println(args.length);
		
		//遍历数组元素
		//方法一
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		//方法二
		for(String arg : args){
			System.out.println(arg);
		}
	}
}