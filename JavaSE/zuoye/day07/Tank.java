public class Tank extends Weapon{
	public void attack(){
		System.out.println("̹�˹�����");
	}
	public void move(){
		System.out.println("̹���ƶ���");
	}
	public static void main(String[] args){
		Tank tank = new Tank();
		tank.attack();
		tank.move();
	}
}