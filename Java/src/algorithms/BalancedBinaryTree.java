package algorithms;

import leetcode.TreeNode;


/**
 * @author yuchengkai
 *
 * @time   2016年5月30日
 *
 */
public class BalancedBinaryTree {

	/**
	 * if the left child is not balanced, it's not balanced.
	 * if the right child is not balanced, it's not balanced.
	 * when the difference of the height is greater than 1, it's not balanced.
	 * */
    boolean fun(TreeNode root,int[] h){
        if(root==null){h[0]=0;return true;}
        int []hl=new int[1];
        int []hr=new int[1];
        if(!fun(root.left,hl))return false;
        if(!fun(root.right,hr))return false;
        if(Math.abs(hl[0]-hr[0])>1)return false;
        h[0]=Math.max(hl[0],hr[0])+1;
        return true;
    }
    
    public boolean isBalanced(TreeNode root) {
        int []h=new int[1];
        return fun(root,h);
    }

}
