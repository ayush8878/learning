package com.ds.tree;

import com.ds.tree.Node;
public class PostOrderTraversal{

public static void main(String args[])
{
BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
/*
     1
   /   \
 null  null
*/
tree.root.left=new Node(2);
tree.root.right=new Node(3);
/*
             1
          /    \
         2      3
        / \    /  \
     null null null null

*/
tree.root.left.left=new Node(4);
tree.root.left.right=new Node(5);
/*
             1
          /    \
         2      3
        / \    /  \
       4   5 null n	ull

*/
System.out.print("Pre_order");
tree.printPreOrder(tree.root);
/**********START*************/
System.out.print("In_order");
tree.printInOrder(tree.root);
/***********************/
System.out.print("Post_order");
tree.printPostOrder(tree.root);
/***********END************/
}
}
