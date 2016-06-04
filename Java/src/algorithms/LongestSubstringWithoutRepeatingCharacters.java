package algorithms;

/**
 * @author yuchengkai
 *
 * @time   2016年6月4日
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {
	/**
	 * use map to record the index of current character.
	 * check the length of current substring.
	 * update the result.
	 * */
    public int lengthOfLongestSubstring(String s) {
        int []m=new int [256];
        int max=1;
        int i=0,j=1,l=s.length();
        if(l<2)return l;
        ++m[s.charAt(0)];
        while(j<l){
            ++m[s.charAt(j)];
            if(m[s.charAt(j)]>1){
                while(m[s.charAt(j)]>1){
                    --m[s.charAt(i)];
                    ++i;
                }
            }
            max=Math.max(max,j-i+1);
            ++j;
        }
        return max;
    }
}

