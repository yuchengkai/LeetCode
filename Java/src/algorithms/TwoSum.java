//	
//	Given an array of integers, find two numbers such that they add up to a specific
//	target number.
//	
//	The function twoSum should return indices of the two numbers such that they add
//	up to the target, where index1 must be less than index2. Please note that your
//	returned answers (both index1 and index2) are not zero-based.
//	You may assume that each input would have exactly one solution.
//	Input: numbers={2, 7, 11, 15}, target=9
//	Output: index1=1, index2=2 
package algorithms;

import java.util.HashMap;

/**
 * @author yuchengkai
 *
 * @time   2015年12月19日
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        int[] r=new int[2];
        int l=nums.length;
        for(int i=0;i<l;i++){
        	m.put(nums[i], i);
        }
        for(int i=0;i<l;i++){
        	if(m.containsKey(target-i)){
        		int j=m.get(target-i);
        		if(i>j){
        			r[0]=j;
        			r[1]=i;
        		}else{
        			r[0]=i;
        			r[1]=j;
        		}
        		break;
        	}
        }
        return r;
    }
}
