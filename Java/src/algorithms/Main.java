package algorithms;
import java.util.Scanner;
public class Main {
    public static void main(String[] argv){
    	SqrtX s=new SqrtX();
    	for(int i=-1;i<111;i++){
    		System.out.printf("%d %d\n", i,s.mySqrt(i));
    	}
    	System.out.println(s.mySqrt(0x7fffffff));
    }
}