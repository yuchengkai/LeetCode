package algorithms;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

import leetcode.TreeNode;

/**
 * @author yuchengkai
 *
 * @time   2016年6月3日
 *
 */
public class BinaryTreePaths {

	/**
	 * level order traversal.
	 * use one queue to record the node.
	 * use anther to record current path.
	 * when the node is a leaf node, add the path to result.
	 * */
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> res=new LinkedList<String>();
        if(root==null)return res;
        ArrayDeque<TreeNode>stack=new ArrayDeque<TreeNode>();
        ArrayDeque<String>str=new ArrayDeque<String>();
        stack.offerFirst(root);
        str.offerFirst("");
        while(!stack.isEmpty()){
            TreeNode t=stack.pollFirst();
            String s=str.pollFirst()+"->"+t.val;
            if(t.left==null&&t.right==null){
                res.add(s.substring(2));
            }
            if(t.left!=null){
                stack.offerFirst(t.left);
                str.offerFirst(s);
            }	
            if(t.right!=null){
                stack.offerFirst(t.right);
                str.offerFirst(s);
            }
        }
        return res;
    }

}
