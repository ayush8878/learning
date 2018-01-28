package com.ds.stack;

class Stack
{
StackNode root;
public StackNode newNode(int data)
 {
StackNode stackNode=new StackNode(data);
return stackNode;
 }
public boolean isEmpty(StackNode node)
 {
if(node==null)
return true;
return false;
 }
public void push(int data)
 {
  StackNode stackNode=newNode(data);
  stackNode.next=root;
  root=stackNode;
 }
public int peek()
 {
if(root==null)
return -1;
 return root.data;
 }
public int pop()
 {
if(root==null)
return -1;
StackNode temp=root;
root=root.next;
return temp.data;
 }
}


