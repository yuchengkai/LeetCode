package algorithms;



/**
 * @author yuchengkai
 *
 * @time   2016年6月1日
 *
 */
public class SpiralMatrixII {

	/**
	 * determine the direction of the iteration according to the indices;
	 * */
	public int[][] generateMatrix(int n) {
	        int [][]mat=new int[n][n];
	        int c=1;
	        int i=0,j=0;
	        int direction=0;
	        while(c<=n*n){
	            mat[i][j]=c;
	            if(direction==0){//left to right
	                if(j==n-1-i){
	                    direction=1;
	                    i++;
	                }else j++;
	            }
	            else if(direction==1){//top to bottom
	                if(i==j){
	                    direction=2;
	                    j--;
	                }else i++;
	            }
	            else if(direction==2){//right to left
	                if(j==n-1-i){
	                    direction=3;
	                    i--;
	                }else j--;
	            }
	            else if(direction==3){//bottom to top
	                if(i==j+1){
	                    direction=0;
	                    j++;
	                }else i--;
	            }
	            c++;
	        }
	        return mat;
	    }

}
