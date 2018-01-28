package com.ds.tree;

import com.ds.tree.Node;
import com.ds.tree.BinaryTree;
/* 
LevelOrderTree or BreadthFirstSearch is a tree which traverse the tree width wise on the bases of level, It checks for the level recursively and traverse the tree.
It can be useful when we are aware that the searched node is nearby the root node.
*/
class LevelOrderTree
{
public static void main(String args[])
{
//CHeck the name of tree
/*---------Tree Creation End-----------*/
BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(2);
tree.root.right=new Node(3);
tree.root.left.left=new Node(4);
tree.root.left.right=new Node(5);
/*---------Tree Creation End-----------*/
/*---------Tree Traversal-----------*/
tree.printLevelOrder(tree.root);
}
}
