package com.gqt.corejava.challenges;
class TreeNode1 {
int val;
TreeNode left;
TreeNode right;
TreeNode1(int val) {
this.val = val; this.left = null;
this.right = null;
}}
public class KthSmallestInBST {
private static int count = 0;
private static int result = -1;
public static void main(String[] args) {
TreeNode root =new TreeNode(3);
root.left =new TreeNode(1);
root.right =new TreeNode(4);
root.left.right= new TreeNode(2);
int k=2;
int kthSmallest =kthSmallest(root, k);
System.out.println("The kth smallest element in the BST is:"+ kthSmallest);
}
private static int kthSmallest (TreeNode root, int k) {
inorderTraversal(root, k);
return result;
}
private static void inorderTraversal(TreeNode root, int k) {
if (root== null || count>=k) {
return;
}
inorderTraversal(root.left, k);
count++;
if (count== k) { 
result= root.val;
return;
}
inorderTraversal(root.right, k);
}
}
