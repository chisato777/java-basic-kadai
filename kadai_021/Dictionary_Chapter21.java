package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void addWord() {
	Hashmap<String,String> wordMap = new Hashmap<String,String>();
	
	wordMap.put("apple", "りんご");
	wordMap.put("peach","桃");
	wordMap.put("banana","バナナ");
	wordMap.put("lemon","レモン");
	wordMap.put("pear","梨");
	wordMap.put("kiwi","キウィ");
	wordMap.put("strawberry","いちご");
	wordMap.put("grape","ぶどう");
	wordMap.put("muscat","マスカット");
	wordMap.put("cherry","さくらんぼ");
	
	public void searchWord(String word) {
		
		for(int i = 0; i < wordMap.size(); i++) {
			if(wordMap.get(word) == null) {
				System.out.println(word + 辞書に存在しません);
			} else {
				System.out.printLn(word + "の意味は" + wordMap.get(word) + "です");
				
			}
		}

	}
	
	
	}
}
