package algorithms;


/**
 * @author yuchengkai
 *
 * @time   2016年5月28日
 *
 */
public class CountingBits {

	/**
	 * the 1's in an integer i is half of the 1's 
	 * in the integer i/2 plus with the i in the last bit.
	 * */
    public int[] countBits(int num) {
        int [] res=new int[num+1];
        for(int i=0;i<=num;i++)
            res[i]=res[i>>1]+(i&1);
        return res;
    }
}
