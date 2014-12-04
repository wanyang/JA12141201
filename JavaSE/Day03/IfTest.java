//熟悉if语句的使用
public class IfTest{
	public static void main(String args[]){
		//第一种格式
		if(1 > 100){
			System.out.println("第一种格式");
		
		}
		//第二种格式
		boolean flag=true;
		if(flag){
			System.out.println("创建boolean默认值 真");
		}else{
			System.out.println("创建boolean默认值 假");
		}
		//第三种格式
		int score = 56;
		if(score < 60){
			System.out.println("不及格");
		}else if(60 < score && score <80 ){
			System.out.println("良");
		}else{
			System.out.println("优");
		}
	}
}