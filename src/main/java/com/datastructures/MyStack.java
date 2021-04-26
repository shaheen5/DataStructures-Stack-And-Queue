package com.datastructures;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }
    //method to add element to top in stack
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }
    //method to print nodes in stack(linked list)
    public void printStack() {
        myLinkedList.printMyNodes();
    }
    //method to get top element from stack
    public INode peak() {
        return myLinkedList.head;
    }
    //method to delete top element from stack
    public INode pop() {
        return myLinkedList.pop();
    }
}
