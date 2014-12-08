/*
	输出所有的水仙花数  水仙花数就是三位数的个位十位百位的三次方和；
	例：153=1^3+5^3+3^3
	
	分析：
		对于一个三位数是否为水仙花数，首先要知道这个三位数的个位、十位、百位上的数字
		个位：x%10;
		十位：x/10%10;
		百位：x/100%10;
*/
public class Shuixianhua{

	public static void main(String[] args){
		
		int count = 0;
		//获取所有的三位数,并获取三位数的个位、十位、百位上的数字
		for(int x=100;x<1000;x++){
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
		
			if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				count++;
				System.out.println(x);
				System.out.println(count);
			}
		}
	}
}