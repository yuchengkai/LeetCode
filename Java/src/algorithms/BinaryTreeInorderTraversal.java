package algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import leetcode.TreeNode;


/**
 * @author yuchengkai
 *
 * @time   2016年6月6日
 *
 */
public class BinaryTreeInorderTraversal {

	/**
	 * recursively visit left child.
	 * visit itself.
	 * recursively visit right child.
	 * */
	List<Integer> recursive(TreeNode root){
        List<Integer> res=new LinkedList<Integer>();
        if(root==null)return res;
        res.addAll(recursive(root.left));
        res.add(root.val);
        res.addAll(recursive(root.right));
        return res;
    }
    
	/**
	 * push all the left children into a stack.
	 * pop and visit the top when there is no left child.
	 * visit the right.
	 * */
    List<Integer> nonrecursive(TreeNode root){
        List<Integer> res=new LinkedList<Integer>();
        if(root==null)return res;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            res.add(root.val);
            root=root.right;
        }
        return res;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        return nonrecursive(root);
    }
}
