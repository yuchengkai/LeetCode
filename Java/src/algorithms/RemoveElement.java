package algorithms;

/**
 * @author yuchengkai
 *
 * @time   2016年6月5日
 *
 */
public class RemoveElement {
	/**
	 * use two pointers
	 * move current element if it doesn't equal to val.
	 * */
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        int begin=0;
        for(int i=0;i<l;i++){
            if(nums[i]!=val){
                nums[begin]=nums[i];
                begin++;
            }
        }
        return begin;
    }
}

