// package week1;
// Given an integer x, return true if x is palindrome integer.
// An integer is a palindrome when it reads the same backward as forward.
//  For example, 121 is palindrome while 123 is not.
//also have to handle negatives
class Solution {
	public static void isPalindrome(int x) {
		// 121 // 10 = 12
		// 12 // 10 = 1
		// 121 % 10 = 21
		//21 //10 = 2
		// 121 % 100 = 1
		//1. challenge - how to make an integer into an array
		String temp = Integer.toString(x);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			newGuess[i] = temp.charAt(i) - '0';
		}
		System.out.println(newGuess[2]);
		int length = newGuess.length;
		for (int j = 0; j < length; j++){
			if(newGuess[j] == newGuess[length-1]){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}		
	    
	}
	public static void main(String[] args){
		isPalindrome(515);
	}
    }
