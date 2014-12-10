/*
	1、创建Exe01.java：创建boolean变量，分别赋值（true、false、0），并打印出该变量
	2、创建Exe02.java：创建char变量，赋值（英文字符、中文字符），并打印
	3、创建Exe03.java：创建每一种数值型变量，赋值，进行各种“加减乘除”的运算

	4、回文数。      
		编写一个Java应用程序。用户从键盘输入一个1—9999之间的数，
		程序将判断这个数是几位数，并判断这个数是否是回文数。
		回文数是指将该数含有的数字逆序排列后得到的数和原数相同，
		例如12121、3223都是回文数。

*/
public class Exe01{
	public static void main(String[] args){
		boolean a = true;
		boolean b = false;
		//boolean c = 0;    0不属于boolean类型，所以编译出错
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
	}
}