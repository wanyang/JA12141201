/*
	1、与类文件类似，接口文件中只能有一public接口，
	   并且接口名==文件名；
	2、接口---->实现类---->对象  ：接口不能直接实例化对象
	3、多重实现
	4、接口继承接口
*/
public interface USB{
	//组成
	//int test ;
	double version = 3.0; //默认的修饰：public static final
	void read();		  //默认的修饰：public abstract
	void write();
	
}































