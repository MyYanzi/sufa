package dongTai;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
    public static  int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map=new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
		   int m=target-nums[i];
		if(map.containsKey(m)&&map.get(m)!=i){
			return new int[]{map.get(m),i};
		}
		map.put(nums[i], i);
	}
	   return nums;
      
    }
       
   public static void main(String[] args){
        int nums[]= new int[]{1,2,3,5};
        int target=4;
        int arr2[]=new int[2];
        arr2=twoSum(nums,target);
        for (int i = 0; i < arr2.length; i++) {
        	  System.out.println(arr2[i]);
		}
    }
}
