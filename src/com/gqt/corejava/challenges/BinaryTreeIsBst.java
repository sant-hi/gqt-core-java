package com.gqt.corejava.challenges;
class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode(int val) {
this.val = val;
this.left = null;
this.right = null;
}
}
public class BinaryTreeIsBst {
public static void main(String[] args) {
TreeNode root=new TreeNode(2);
root.left =new TreeNode(1);
root.right= new TreeNode(3);
if (isBST (root)) {
System.out.println("The binary tree is a Binary Search Tree (BST).");
}
else
{
System.out.println("The binary tree is not a Binary Search Tree(BST).");
}
}
private static boolean isBST(TreeNode root) {
	return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}
private static boolean isBSTUtil (TreeNode root, int min, int max) {
if (root== null) {
return true;
}
if (root.val<= min || root.val >= max) {
return false;
}
return isBSTUtil(root.left, min, root.val) && isBSTUtil(root.right, root.val,max);
}
}
