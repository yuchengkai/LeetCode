package algorithms;


/**
 * @author yuchengkai
 *
 * @time   2016年5月28日
 *
 */
public class BullsAndCows {

	/**
	 * use two arrays to record the occurrence of each character in
	 * the secret and guess strings respectively.
	 * the less occurrence is the number of cows for that character.
	 * do not count bulls as cows in the iteration.
	 * */
	public String getHint(String secret, String guess) {
		int [][]map=new int[2][10];
		int l=secret.length();
		int bull=0,cow=0;
		for(int i=0;i<l;i++){
			if(secret.charAt(i)==guess.charAt(i)){
				++bull;
			}else{
				++map[0][secret.charAt(i)-'0'];
				++map[1][guess.charAt(i)-'0'];
			}
		}
		for(int i=0;i<10;i++){
			cow+=Math.min(map[0][i], map[1][i]);
		}
		return bull+"A"+cow+"B";
	}

}
