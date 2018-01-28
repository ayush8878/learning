/*This is the simplest example of tree data structure 

           1
          / \
          2  3
         /
         4
*/
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
public BinaryTree(int key)
{
Node root=new Node(key); 
}
public BinaryTree()
{
root=null;
}
}

public class FirstSimpleTree{

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

}
}
