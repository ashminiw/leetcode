import java.util.HashMap;

class Solution {
	//given a roman numeral convert to an integer
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
	
	public static int romanToInt(String s) {
		//create a hashmap to map roman numerals to numbers as 'rules'
		HashMap<String,Integer> romannum = new HashMap<String,Integer>();
		romannum.put("I", 1);
		romannum.put("V", 5);
		romannum.put("X", 10);
		romannum.put("L", 50);
		romannum.put("C", 100);
		romannum.put("D", 500);
		romannum.put("M", 1000);
		// int j = 0 ;
		int value = 0;
		for (int i = 0; i < s.length(); i++) {
			char keychar = s.charAt(i);
			String key = String.valueOf(keychar);
			int number = romannum.get(key);
			value = value + number;
		} 
		return value;
	}
	public static void main(String[] args){
		romanToInt("LX");
	}
    }

