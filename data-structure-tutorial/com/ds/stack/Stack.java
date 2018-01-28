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
 return root.data;
 }
public int pop()
 {
StackNode temp=root;
root=root.next;
root.next=null;
return temp.data;
 }
}


