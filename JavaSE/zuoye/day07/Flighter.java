public class Flighter extends Weapon{
	public void attack(){
		System.out.println("战机攻击！");
	}
	public void move(){
		System.out.println("战机移动！");
	}
	public static void main(String[] args){
		Flighter flighter = new Flighter();
		flighter.attack();
		flighter.move();
	}
}