package algorithms;

/**
 * @author yuchengkai
 *
 * @time   2016年5月31日
 *
 */
public class PlusOne {
	/**
	 * when the length of result is the same as original,
	 * add one until the carry is 0.
	 * when the length is changed, the result should be 1 followed
	 * with n zeros. n is the length of the input digits.
	 * */
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        while(n>=0){
            if(digits[n]<9){
                digits[n]++;
                return digits;
            }else digits[n]=0;
            n--;
        }
        int []res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
