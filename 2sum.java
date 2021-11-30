//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

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

    public static void main(String args[]){
	    System.out.println("HII MOM");
    }


}
