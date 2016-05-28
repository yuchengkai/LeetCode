package algorithms;

/**
 * @author yuchengkai
 *
 * @time   2016年5月28日
 *
 */
public class SqrtX {

	/**
	 * negative integers do not have a root.
	 * root*root<=x<(root+1)*(root+1) if root equals to (int)sqrt(x).
	 * use binary search to find the root.
	 * consider special cases where x equals 0,1, and 0x7fffffff.
	 * */
	public int mySqrt(int x){
		if(x<0)
			return 0;
		else if(x<2)
			return x;
		double start=0;
		double end=x;
		while(end-start>1){
			double mid=(start+end)/2;
			if(Math.floor(mid)*Math.floor(mid)>x){
				end=mid;
			}else{
				start=mid;
			}
		}
		return (int)start;
	}
}
