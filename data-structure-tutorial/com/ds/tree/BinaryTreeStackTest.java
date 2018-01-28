package com.ds.tree;

import com.ds.stack.*;

class BinaryTreeStackTest
{
public static void main (String []args)
 {
 BinaryTreeStack tree=new BinaryTreeStack();
 tree.root=new TreeNode(1);
 tree.root.left=new TreeNode(2);
 tree.root.right=new TreeNode(3);
 tree.root.left.left=new TreeNode(4);
 tree.root.left.right=new TreeNode(5);
/*---------Tree Creation End-----------*/
/*---------Tree Traversal-----------*/
tree.printInorderStackImpl(tree.root);

 
 }
}
