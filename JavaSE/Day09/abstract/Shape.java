//�����ࡾֻ�ܱ��̳С�---->���ࣺʵ�����г��󷽷�----->����
//��������                 ������
public abstract class Shape{
	//����������
	{
		System.out.println("ִ��shape�ĳ�ʼ����");
	}
	private String color;
	
	//����һ�������ܳ��ĳ��󷽷�
	public abstract double calPerimeter();
	
	//����һ��������״�ĳ��󷽷�
	public abstract String getType();
	
	//����Shape�Ĺ��������ù��������������ڴ���Shape����
	//�������ڱ��������
	public Shape(){}
	public Shape(String color){
		System.out.println("ִ��Shape�Ĺ�����");
		this.color = color;
	}
	
	//ʡ��color���Ե�setter��getter����
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}