package dongTai;

import java.util.Arrays;

public class remove {

	public static void main(String[] args) {
		int a[]={3,2,2,3};
		int m=removeElement2(a,3);
        System.out.println(m);
        int nums[]={1,2,1,2,3,4,5};
        int n=removeDuplicates(nums);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}
	
	 public static int removeElement(int[] nums, int val) {
		  int i,j=0;
		  for(i=0;i<nums.length;i++){
			  if(nums[i]!=val){
				  nums[j]=nums[i];
				  j++;
			  }
		  }
		  return j;
	    }
	 
	 public static int removeElement2(int[] nums, int val) {
		 int i;
		 int m=nums.length;
		 for(i=0;i<m;){
			 if(nums[i]==val){
				 nums[i]=nums[m-1];
				 m--;
			 }else{
				i++; 
			 }
		 }
		return i;
		
	    }
	 
	   public static int removeDuplicates(int[] nums) {
		   int i,j=1;
		   Arrays.sort(nums);
		   for(i=1;i<nums.length;i++){
			   if (nums[i]!=nums[i-1]) {
				   nums[j]=nums[i];
				   j++;
			}
		   }
		   return j;
	    }
}
