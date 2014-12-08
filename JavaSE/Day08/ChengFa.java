/*
	作业：
		九九乘法表。
		1*1=1
		1*2=2	2*2=4
		1*3=3	2*3=6	3*3=9
		...
		1*9=9	2*9=18	3*9=27	...		8*9=72	9*9=81
*/
public class ChengFa{
	public static void main(String[] args){
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				int z=x*y;
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}
}