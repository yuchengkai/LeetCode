package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuchengkai
 *
 * @time   2016年5月28日
 *
 */
public class PascalsTriangleII {

	/**
	 * f(0)=[1]
	 * f(n)[0]=1;
	 * f(n)[i]=f(n-1)[i]+f(n-1)[i+1],i>=1;
	 * */
	public List<Integer> getRow(int rowIndex) {
	    int [][]res=new int[2][];
	    for(int i=1;i>=0;i--){
	    	res[i]=new int[rowIndex+1];
	    	res[i][0]=1;
	    }
	    int t=0;
	    while(t<rowIndex){
	    	for(int i=0;i<=t;i++){
	    		res[(t+1)%2][i+1]=res[t%2][i+1]+res[t%2][i];
	    	}
	    	t++;
	    }
	    List<Integer> ret=new ArrayList<Integer>();
	    for(int i:res[t%2])ret.add(i);
	    return ret;
	    //return Arrays.asList(res[t%2]);
	}

}
