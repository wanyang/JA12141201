public class Circle extends Shape{
	private double radius;
	public Circle(){}
	public Circle(String color){
		super(color);  //������Ĺ��캯��
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter(){
		return 2*Math.PI*radius;
	}
	//��дShape��ķ�����״�ĳ��󷽷�
	public String getType(){
		return getColor() + "Բ��";
	} 
	
	
}