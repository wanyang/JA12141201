public class Manager extends Employee{
	//��������
	String car;
	String office;
	
	
	// ���๹�췽����������á����๹�췽����
	// �����޲ι��췽�� + û����ʽ���ø��๹�췽�� = �Զ����ø�����޲ι��췽��
	public Manager(){ 
		super();    //�Զ������޲εĹ��캯��
		System.out.println("�����޲ι��캯��");
	}
	
	//����һ�ι��췽��
	public Manager(int id){
		super(id);    // ����Ĺ��캯��
		System.out.println("����һ�ι��캯��");
		//this.id = id;
		
	}
	
	public Manager(int id,String name){
		this(id);    //this ����һ�ι��캯��
		System.out.println("��������ι��캯��");
		//this.id = id;
		
		this.name = name;
	}
	
	
	public void drive(){
		//System.out.println("name:" + name + "��" + car + "�ϰ�");
		//System.out.println("name:" + super.name + "��" + this.car + "�ϰ�");
		System.out.println("name:" + this.name + "��" + this.car + "�ϰ�");
	}
	//super:���������
	public void info(){
	
		System.out.println("�����info()");
		
		//System.out.println("id:" + id + "\nname :" + name + "\nsalary:" + salary);
		
		super.info();
	
		System.out.println("car:" + car + "\noffice :" + office);
	}
}