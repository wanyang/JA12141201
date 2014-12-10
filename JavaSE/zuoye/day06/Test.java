interface Assaultable{
	void attack();
}

interface Mobile{
	void move();
}

abstract class Weapon implements Assaultable,Mobile{
	public void attack(){}
	public void move(){}
}

class Tank extends Weapon{
	public void attack(){
		System.out.println("Tank attack!");
	}
	
	public void move(){
		System.out.println("Tank move!");
	}
}

class Flighter extends Weapon{
	public void attack(){
		System.out.println("Flighter attack!");
	}
	
	public void move(){
		System.out.println("Flighter move!");
	}
}

class WarShip extends Weapon{
	public void attack(){
		System.out.println("WarShip attack!");
	}
	
	public void move(){
		System.out.println("WarShip move!");
	}
}

class Army{
	Weapon[] w;
	int max;
	int temp = 0;
	
	Army(int max){
		this.max = max;
		w = new Weapon[max];
	}
	public void addWeapon(Weapon wa){
		for (int i = 0; i < w.length; i++){
			if(i < w.length){
				w[i] = wa;
				System.out.println("ÎäÆ÷¿â¼ÓÈëÒ»¸öÎäÆ÷£¡");
			}else{
				System.out.println("ÎäÆ÷¿âÒÑÂú£¡");
				return;
			}
		}
	}
	public void attackAll(){
		for(int i = 0; i < w.length; i++)
			w[i].attack();
	}
	public void moveAll(){
		for(int i = 0; i < w.length; i++)
			w[i].move();
	}
}

public class Test{
	public static void main(String[] args){
		Army a = new Army(9);
		
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		a.addWeapon(new Tank());
		
		a.attackAll();
		a.moveAll();
	}
}
