/*
ĳ��˾�Ĺ�Ա��Ϊ���������ࣺ
 
	Employee����������Ա���ܵĸ���
		���ԣ�Ա���������������·ݡ� 
		������getSalary(int month) 
			���ݲ����·���ȷ�����ʣ��������Ա�������գ� ��˾����⽱��100Ԫ��
	SalariedEmployee��Employee������,�ù̶����ʵ�Ա����
		���ԣ���н 
	HourlyEmployee��Employee�����࣬
		��Сʱ�ù��ʵ�Ա����ÿ�¹�������160Сʱ�Ĳ��ְ���1.5�����ʷ���
		���ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ�� 
	SalesEmployee��Employee�����࣬������Ա�������������۶������ʾ�����
		���ԣ������۶����� 
	BasePlusSalesEmployee��SalesEmployee�����࣬
		�й̶���н��������Ա�� �����ɵ�н����������ɲ��� 
		���ԣ���н�� ��д������Test����������ÿ������ÿ�µĹ�������
*/
public class Employee{

	//����Ա�������������·�
	String name;
	double month = 10;
	double birth = 10;
	
	int salary;
	
	
	//������
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