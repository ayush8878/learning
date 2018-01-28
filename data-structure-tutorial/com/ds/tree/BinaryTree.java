package com.ds.tree;
class Node
{
int key;
Node left,right;

public Node(int key)
{
this.key=key;
}
}
class BinaryTree
{
Node root;
int maxDiameter;
public BinaryTree(int key)
 {
Node root=new Node(key); 
 }
public BinaryTree()
 {
root=null;
 }
public void printPreOrder(Node node)
 {
if(node==null)
return;
//First print the node as its pre-order traversal
System.out.print(node.key);
//This will traverse the left of tree and reach the leftmost child
printPreOrder(node.left);
//This will traverse the right of tree and reach the rightmost child
printPreOrder(node.right);
 }
public void printPostOrder(Node node)
 {
if(node==null)
return;
//This will traverse the left of tree and reach the leftmost child
printPostOrder(node.left);
//This will traverse the right of tree and reach the rightmost child
printPostOrder(node.right);
//After left and right print node 
System.out.print(node.key);
 }
public void printInOrder(Node node)
 {
if(node==null)
return;
//This will traverse the left of tree and reach the leftmost child
printInOrder(node.left);
//First print the left as its in-order traversal
System.out.print(node.key);
//This will traverse the right of tree and reach the rightmost child
printInOrder(node.right);
 }
public void printLevelOrder(Node root)
 {
for(int d=1;d<=height(root);d++)
   {
    printGivenLevel(root,d);
   }
 }
public void printGivenLevel(Node node,int level)
 {
if(node==null)
return;
if(level==1)
System.out.print(node.key+"-->");
else if(level>1)
 {
printGivenLevel(node.left,level-1);
printGivenLevel(node.right,level-1);
 }
else
 {
//Yet to be decided most probably error
 }
 }
public int height(Node node)
 {
//This function will recursively traverse tree to find the height, When it reaches the leaf node then it return 0 as node.left will be null in that case which makes last second recursive call value to be 1. When recursion ends it results in value 3 for the above case.
if(node==null)
return 0;
else
 {
int lheight=height(node.left);
int rheight=height(node.right);

if(lheight>rheight)
 {
return lheight+1;
 }
else
 {
return rheight+1;
 }
 }
 }
public int calcDiameter(Node node)
 {
if(node==null)
return 0;
else
 {
int lheight=calcDiameter(node.left);
int rheight=calcDiameter(node.right);
if(lheight+rheight>	this.maxDiameter)
this.maxDiameter=lheight+rheight;
if(lheight>rheight)
 {
return lheight+1;
 }
else
 {
return rheight+1;
 }
 }
}}
