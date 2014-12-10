import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ArrayUtils {
	/**
	 * 定义一个工具方法，工具方法从字符串数组中找到对应的字符串元素的位置
	 * 
	 * @param array
	 *            搜索的数组
	 * @param target
	 *            搜索的字符串
	 * @return 目标字符串出现的位置,-1表明找不到
	 */
	public static int search(String[] array, String target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && array[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
}

public class SuoHa {

	// 定义最多有多少名玩家
	private static final int PLAY_NUM = 5;
	// 定义扑克牌的花色
	private String[] types = { "方块", "草花", "红心", "黑桃" };
	// 定义扑克牌的数值
	private String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"J", "Q", "K", "A" };
	// 定义LinkedList集合 用来存放扑克牌
	private List<String> cards = new LinkedList<String>();
	// 定义所有玩家
	private String[] players = new String[PLAY_NUM];
	// 定义一个List集合的数组 用来存放 玩家手上的扑克牌
	@SuppressWarnings("unchecked")
	private List<String>[] playerCards = new List[PLAY_NUM];

	/**
	 * 构建 一副 扑克牌
	 */
	public void initCards() {
		System.out.println("------------买一副扑克！！-----------\n\n");

		for (int i = 0; i < types.length; i++) {
			for (int j = 0; j < values.length; j++) {
				cards.add(types[i] + values[j]);
			}
		}
	}

	/**
	 * 洗牌
	 */
	public void washCards() {
		System.out.println("---------------洗牌中。。。---------------\n");
		System.out.println("---------------洗牌中。。。---------------\n");
		System.out.println("---------------洗牌中。。。---------------\n");
		Collections.shuffle(cards);
	}

	/**
	 * 玩家报名
	 * 
	 * @param name
	 *            玩家的名字 用，隔开
	 * @throws Exception
	 */
	public void initPlayers(String... name) {
		if (name.length < 2) {
			// 人为的抛出异常
			try {
				throw new Exception("玩家不足两人");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (name.length > PLAY_NUM) {
			// 人为的抛出异常
			try {
				throw new Exception("玩家超过上限");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < name.length; i++) {
			players[i] = name[i];
		}
	}

	/**
	 * 初始化玩家的手牌 Suoha开始时 玩家的手牌都是空的 程序使用一个长度为0的LinkedList 来表示
	 */
	public void initPlaterCards() {
		for (int i = 0; i < PLAY_NUM - 1; i++) {
			// 判断 玩家名字 为 空 和 空串
			if (players[i] != null && !players[i].equals("")) {

				playerCards[i] = new LinkedList<String>();
			}
		}
	}

	/**
	 * 验牌 就是输出所有的牌 没有实际作用 只是拿来检测
	 */
	public void checkCards() {
		System.out.println("---------------验牌---------------");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < types.length; j++) {
				 System.out.print(types[j] + values[i]+"\t");
			}
			System.out.println();
		}
	}

	/**
	 * 发牌
	 * 
	 * @param first   第一个发给谁
	 * @param   i     第几轮发牌     
	 */
	public void sendCards(String first,int j) {
		// ArrayUtils是自定义的一个类
		// search()自定义类中的方法
		System.out.println("\n-----------第 "+j+" 轮发牌,从"+first+"开始发牌-----------");
		int firstP = ArrayUtils.search(players, first);
		if (firstP == -1) {
			try {
				throw new Exception("找不到这个玩家");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = firstP; i < players.length; i++) {
			if (players[i] == null) {
				break;
			}

			playerCards[i].add(cards.get(0));
			cards.remove(0);
		}
		for (int i = 0; i < firstP; i++) {
			playerCards[i].add(cards.get(0));
			cards.remove(0);
		}
	}

	/**
	 * 亮牌
	 */
	public void showCards() {
		System.out.println("----------------------------------------");
		for (int i = 0; i < players.length; i++) {
			if (players[i] == null) {
				break;
			}
			System.out.print(players[i] + ":\t");
			for (String card : playerCards[i]) {
				System.out.print(card + "\t");
			}
			System.out.println();
		}
		
	}

	// 测试
	public static void main(String[] args) {

		SuoHa sh = new SuoHa();
		// 买一副扑克
		sh.initCards();
		// 验牌
		sh.checkCards();
		// 玩家报名
		sh.initPlayers("万利", "老爷", "大哥", "小老表");
		// 洗牌
		sh.washCards();
		// 还没开始抓牌
		sh.initPlaterCards();
		// 发牌 每次都是先发老爷 发5次
		sh.sendCards("老爷",1);
		sh.showCards();
		
		sh.sendCards("老爷",2);
		sh.showCards();
		
		sh.sendCards("老爷",3);
		sh.showCards();
		
		sh.sendCards("老爷",4);
		sh.showCards();
		
		sh.sendCards("老爷",5);
		sh.showCards();

	}
}
