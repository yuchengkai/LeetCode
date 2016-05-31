package algorithms;

/**
 * @author yuchengkai
 *
 * @time   2016年5月31日
 *
 */
public class HappyNumber {

	/**
	 * similar with two pointers which used to determine whether 
	 * there is a circle in a linked list.
	 * */
    public boolean isHappy(int n) {
        int fastn=cal(n);
        while(fastn!=n){
            n=cal(n);
            fastn=cal(cal(fastn));
        }
        return n==1;
    }
    
    /**
     * calculate the sum of its digits
     * @param n
     * @return the sum
     */
    public int cal(int n){
        int newn=0;
        while(n>0){
            newn+=(n%10)*(n%10);
            n/=10;
        }
        return newn;
    }
    
}
