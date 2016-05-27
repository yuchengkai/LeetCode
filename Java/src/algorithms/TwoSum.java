package algorithms;

import java.util.HashMap;

/**
 * @author yuchengkai
 *
 * @time   2015年12月19日
 *
 */
public class TwoSum {
	
	/**
	 * Use a map to record the numbers and their indices.
	 * Iterate the array again to check if there is target-i in the map for 
	 * every i in the array. 
	 * */
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
