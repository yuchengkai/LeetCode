package algorithms;
import java.util.Scanner;
public class Main {
    public static void main(String[] argv){
    	Scanner in=new Scanner(System.in);
    	while(in.hasNextInt()){
    		int n=in.nextInt();
    		int m=in.nextInt();
    		if(n>m){
    			int t=n;
    			n=m;
    			m=t;
    		}
    		long [][]mat=new long[2][];
    		mat[0]=new long[m];
    		mat[1]=new long[m];
    		for(int i=0;i<m;i++)mat[0][i]=1;
    		mat[1][0]=1;
    		int f=1;
    		--n;
    		while(n>0){
//    			for(int i=0;i<m;i++){
//    				System.out.printf("%d ",mat[0][i]);
//    			}
//    			System.out.println("");
//    			for(int i=0;i<m;i++){
//    				System.out.printf("%d ",mat[1][i]);
//    			}
//    			System.out.println("");
    			for(int i=1;i<m;i++){
    				mat[f%2][i]=(mat[(f+1)%2][i]+mat[f%2][i-1])%1000000007;
    			}
    			++f;
    			--n;
    		}
    		System.out.println(mat[f%2][m-2]);
    	}
    	in.close();
    }
}