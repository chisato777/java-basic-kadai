package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice(){
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");


		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		if (input.equals("r") ||input.equals("s") ||input.equals("p")  ) {
			scanner.close();
			return input;
		} else {
			System.out.println("r,s,pを入力しましょう");
			scanner.close();
			return getMyChoice();
		}
	}
	
	public String getRandom() {
		String[] opponentHands = {"r", "s", "p"};
		
		int i = (int) Math.floor(Math.random() * 3);
		
		return opponentHands[i];
	}

	public void playGame() {
		HashMap<String,String> gameMap = new HashMap<String,String>();
	
		gameMap.put("r","グー");
		gameMap.put("s","チョキ");
		gameMap.put("p","パー");
		
		String me = getMyChoice();
		String you = getRandom();
		
		System.out.println("自分の手は" + me + "," + "対戦相手の手は" + you);
		
		if (me.equals(you)) {
			System.out.println("あいこです");
		}
		
		if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p")) || (me.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		}
		
		if ((me.equals("s") && you.equals("r")) || (me.equals("p") && you.equals("s")) || (me.equals("r") && you.equals("p"))) {
			System.out.println("自分の負けです");
		}
	}

}
