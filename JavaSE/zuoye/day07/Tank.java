public class Tank extends Weapon{
	public void attack(){
		System.out.println("Ì¹¿Ë¹¥»÷£¡");
	}
	public void move(){
		System.out.println("Ì¹¿ËÒÆ¶¯£¡");
	}
	public static void main(String[] args){
		Tank tank = new Tank();
		tank.attack();
		tank.move();
	}
}