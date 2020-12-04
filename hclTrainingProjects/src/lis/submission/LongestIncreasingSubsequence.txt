package lis;

import java.util.Random;

public class LongestIncreasingSubsequence {
	
	public static int lengthOfLIS(int[] nums) {
	    int[] tails = new int[nums.length];
	    int size = 0;
	    
	    for (int num : nums) {
	        int index = 0;
	        int temp = size;
	        
	        while (index != temp) {
	            int relMedian = (index + temp) / 2;
	            
	            if (tails[relMedian] < num) {
	            	index = relMedian + 1;
	            }
	            else {
	            	temp = relMedian;
	            }
	        }
	        
	        tails[index] = num;
	        
	        if (index == size) {
	        	++size;	        
	        }
	    }
	    return size;
	}
	
	public static void main(String[] args) {
		final int MAXINT = 100;
		
		Random r = new Random();
		int randomInt = r.nextInt(MAXINT) + 1;
		
		int [] nums = new int[randomInt];
		
		for(int i = 0; i < randomInt; i++) {
			nums[i] = r.nextInt(Integer.MAX_VALUE) + 1;
		}
		
		System.out.println(lengthOfLIS(nums));
	}
}
