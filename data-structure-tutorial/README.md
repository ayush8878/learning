# data-structure-tutorial

1)In a full binary tree number of leaf node are internal node+1 where internal node are nodes with child.
2) A full binary tree will have either two childs or zero child.
3)A complete binary tree has a exception that last level need not to be completely filled.
If last level need to be filled it should be from left to right.
It helps filling the tree fast as filling alays starts from  left.
 Below example will not be counted as complete binary tree.
eg. 1
     \ 
      3
link:http://cs-study.blogspot.in/2012/11/complete-binary-tree.html
4) full binary tree is a subset of complete binary tree.
5)Perfect binary tree has all levels completely filled.
6)Handshaking Lemma
Sum of odd degree vertex is always even in a undirected graph
M deg(v)=2|E|
where M rep summation v is vertex and E is edges.
Stats of Handshaking Lemma:
6.1)In  a k-ary tree every node has either 0 or K child using below property
L=(k-1)*I +1
where L=Leaf
I=internal node 
Case 1: Root is Leaf(Only one node)
Case 2:
Sum of degree of leaves+sum of internal node except root+roots degree=2*(No of nodes -1)
6.2) In Binary Tree Always
L=I+1
where L=Leaf
I=internal node
7)Enumration of binary tree: Enumration rep in how many ways tree can be rewritten i.e left and right
It can be of two types 
1)Unlabeled(BST):if n=1 T=1,n=2,T=2(one chiled at left or right)...
T(n)=[i=1|M|n]T(i-1)T(n-i)
where T(i-1) rep in how many ways left subtree can be represented and viceversa for other one. 
Can be further simplified to
T(n)=(2n)!/(n+1)!n!
2)Labeled
Number of Labeled Tree=(Number of unlabeled trees) * n!
                      =[(2n)!/(n+1)!n!]*n!

eg n=3 T=30
<-------------------------------TREE-TRAVERSAL---------------------------->
              1
            /   \
           2     3
          / \ 
         4   5
8) 
Depth First Traversal
8.1)Inorder(left,root,right):42513
Algo:
a)Traverse Left Subtree i.e. call Inorder(left-subtree)
b)Visit root
c)Traverse right subtree i.e call Inorder(right-subtree)
8.2)Preorder(root,left,right):12453
8.3)PostOrder(left,right,root):45213
Breadth First Traversal:12345
<--------------------TREE-TRAVERSAL USING STACK-------------------------->
9)Algo for Inorder traversing using Stack
9.1)Create an empty stack S.
9.2)Initiallise current node as root.
9.3)Pust current node to S and set current=current->left while current is not null
9.4)If current is null and stack is non empty then
    a)Pop the top item from Stack.
    b)Print current=popped_item->right
    c)Go to step 9.3
9.5)If Current is null and stack is empty then we are done.	 



 






