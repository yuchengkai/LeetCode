package algorithms;



/**
 * @author yuchengkai
 *
 * @time   2016年5月30日
 *
 */
public class RangeSumQueryImmutable {

	/**
	 * range_sum(a,b)=sum(b)-sum(a)
	 * */
    int []n;
    public RangeSumQueryImmutable(int[] nums) {
        n=nums;
        for(int i=1;i<n.length;i++)
            n[i]+=n[i-1];
    }

    public int sumRange(int i, int j) {
        if(i==0)return n[j];
        return n[j]-n[i-1];
    }

}
