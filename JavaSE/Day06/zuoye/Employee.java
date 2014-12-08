/*
某公司的雇员分为以下若干类：
 
	Employee：这是所有员工总的父类
		属性：员工的姓名和生日月份。 
		方法：getSalary(int month) 
			根据参数月份来确定工资，如果该月员工过生日， 则公司会额外奖励100元。
	SalariedEmployee：Employee的子类,拿固定工资的员工。
		属性：月薪 
	HourlyEmployee：Employee的子类，
		按小时拿工资的员工，每月工作超出160小时的部分按照1.5倍工资发放
		属性：每小时的工资、每月工作的小时数 
	SalesEmployee：Employee的子类，销售人员，工资由月销售额和提成率决定。
		属性：月销售额、提成率 
	BasePlusSalesEmployee：SalesEmployee的子类，
		有固定底薪的销售人员， 工资由底薪加上销售提成部分 
		属性：底薪。 编写测试类Test，用来测试每个工种每月的工资数。
*/
public class Employee{

	//定义员工姓名和生日月份
	String name;
	double month = 10;
	double birth = 10;
	
	int salary;
	
	
	//方法：
	public getSalary(int month){
		if(month == birth){
			salary = salary + 100;
		
		}else{
			salary = salary;
		}
			return salary;
		}
		
	/*public void info(){
		System.out.println("");
	}
	*/
	
}