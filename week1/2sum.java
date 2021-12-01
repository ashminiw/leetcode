package week1;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
import java.util.HashMap;
//BRUTE FORCE METHOD

class Solution {
	public int[] twoSum(int[] nums, int target) {
// 		Input: nums = [3,2,4], target = 6
// Output: [1,2]

	    for(int i=0; i<nums.length; i++){
		    for(int j= i+1; j<nums.length; j++){
			    if(nums[i] + nums[j] == target)
			    return new int[] {i,j};
		    }
		    
	    }
	return new int[0];
    }
    //time complexity: 0(n^2)
    //space complexity: 0(1)
    //explanation:

    //HASHMAP 
    public int[] twoSumHM(int[] nums, int target) { 
	    HashMap<Integer,Integer> map = new HashMap<>();
	    for (int i = 0; i<nums.length; i++){
		    int complement = target - nums[i];
		    if (map.containsKey(complement)){
			    return new int[] {map.get(complement), i};
		    }
		    else{
			    map.put(nums[i], i);
		    }
		}
		return new int[0];

	    }
	       //time complexity: 0(n)
    //space complexity: 0(n)
    //explanation:

//     public static void main(String args[]){
// 	    System.out.println("HII MOM");
	    
//     }


}
