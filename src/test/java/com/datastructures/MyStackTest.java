package com.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode(){
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode,peak);
    }
}