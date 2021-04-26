package com.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3Numbers_WhenAddedToQueue_ShouldAddAtEnd(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        myQueue.printQueue();
        boolean result = myQueue.getHead().equals(myFirstNode) &&
                         myQueue.getHead().getNext().equals(mySecondNode) &&
                         myQueue.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
