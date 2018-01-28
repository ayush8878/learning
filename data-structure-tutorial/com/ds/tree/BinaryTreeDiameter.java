package com.ds.tree;

import com.ds.tree.Node;
import com.ds.tree.BinaryTree;
class BinaryTreeDiameter
{
public static void main(String args[])
{
//CHeck the name of tree
/*---------Tree Creation End-----------*/
//<Tree 1 of https://www.geeksforgeeks.org/diameter-of-a-binary-tree/>
BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(2);
tree.root.right=new Node(3);
tree.root.left.left=new Node(4);
tree.root.left.right=new Node(5);
tree.root.left.right.left=new Node(6);
tree.root.left.right.right=new Node(7);
tree.root.right.right=new Node(8);
tree.root.right.right.right=new Node(9);
tree.root.right.right.right.right=new Node(10);
tree.root.right.right.right.right.left=new Node(11);
tree.root.right.right.right.right.left.left=new Node(12);
tree.root.right.right.right.right.left.right=new Node(13);
tree.root.right.right.right.right.right=new Node(14);


/*---------Tree Creation End-----------*/
/*---------Tree Traversal-----------*/
tree.calcDiameter(tree.root);
System.out.println("Tree One Diameter:"+tree.maxDiameter);
System.out.println("");
tree=new BinaryTree();
//Level 0
tree.root=new Node(1);
//Level 1
tree.root.left=new Node(2);
tree.root.right=new Node(3);
//Level 2
tree.root.left.left=new Node(4);
tree.root.left.right=new Node(5);
tree.root.right.right=new Node(6);
//Level 3
tree.root.left.left.left=new Node(7);
tree.root.left.left.right=new Node(8);
tree.root.left.right.right=new Node(9);
//Level 4
tree.root.left.left.right.left=new Node(10);
tree.root.left.right.right.left=new Node(11);
tree.root.left.right.right.right=new Node(12);
//Level 5
tree.root.left.left.right.left.left=new Node(13);
tree.root.left.left.right.left.right=new Node(14);
tree.root.left.right.right.right.right=new Node(15);
tree.calcDiameter(tree.root);
System.out.println("Tree Two Diameter:"+tree.maxDiameter);
System.out.println("");
}
}
