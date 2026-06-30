package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC5Test {

    @Test
    public void given3Numbers_WhenPopped_ShouldDeleteFirstElement() {
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

        // UC5: Pop the first element (56)
        INode<Integer> poppedNode = myLinkedList.pop();

        // Print sequence to visually verify (Should show 30->70)
        myLinkedList.printMyNodes();

        // Assert/Verify 56 was returned and new head is 30
        Assert.assertEquals(firstNode, poppedNode);
        Assert.assertEquals(secondNode, myLinkedList.head);
    }
}