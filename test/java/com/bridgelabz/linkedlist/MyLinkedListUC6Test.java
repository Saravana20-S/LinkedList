package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC6Test {

    @Test
    public void given3Numbers_WhenPoppedLast_ShouldDeleteLastElement() {
        // Create individual generic nodes
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        // Instantiate the Linked List
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        // Append nodes to set up the baseline sequence: 56 -> 30 -> 70
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        // UC6: Pop the last element (70)
        INode<Integer> poppedNode = myLinkedList.popLast();

        // Print sequence to visually verify (Should show 56->30)
        myLinkedList.printMyNodes();

        // Assert/Verify 70 was returned and new tail is 30
        Assert.assertEquals(thirdNode, poppedNode);
        Assert.assertEquals(secondNode, myLinkedList.tail);
        Assert.assertNull(secondNode.getNext());
    }
}