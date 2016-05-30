package algorithms;

/**
 * @author yuchengkai
 *
 * @time   2016年5月30日
 *
 */
public class RomanToInt {

	/**
	 * scan the string from right to left.
	 * when the weight of current character is
	 * less than the previous one, subtract it from the sum.
	 * otherwise add it to the sum.  
	 * */
    public int romanToInt(String s) {
        int result=0;
        int max=0;
        for(int i=s.length()-1;i>=0;i--){
            int cur=val(s.charAt(i));
            if(cur>=max){
            	max=cur;
            	result+=cur;
            }
            else result-=cur;
        }
        return result;
    }
    int val(char c){
        switch(c){
            case 'I':return 1;
            case 'X':return 10;
            case 'C':return 100;
            case 'V':return 5;
            case 'L':return 50;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
}
