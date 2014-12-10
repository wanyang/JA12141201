public class Army{

	private Weapon[] w;//创建Weapon数组w
	private int count = 0;
	
	//在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量
	public Army(int x){
		this.w = new Weapon[x];
	}
	
	public void addWeapon(Weapon wa){
		//判断武器是否超出最大数量
		if(count<w.length){
			w[count] = wa;
			count++;
		}else{
			System.out.println("武器装载失败！");
		}
	}
	
	public void attackAll(){
		//for循环实现数组w[]从0武器到所有武器攻击
		for(int i=0;i<count;i++){
			w[i].attack();
		}
	}
	
	public void moveAll(){
		//for循环实现数组[]从0武器到所有武器移动
		for(int i=0;i<count;i++){
			w[i].move();
		}
	}
}