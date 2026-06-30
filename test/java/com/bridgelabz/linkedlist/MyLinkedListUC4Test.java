package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC4Test {

    @Test
    public void given3Numbers_WhenInsertingInBetween_ShouldPassLinkedListResult() {
        // Create individual generic nodes
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(70);
        MyNode<Integer> newNode = new MyNode<>(30);

        // Instantiate the Linked List
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        // Append 56 and 70 to set up the baseline sequence: 56 -> 70
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);

        // UC4: Insert 30 between 56 and 70
        myLinkedList.insert(firstNode, newNode);

        // Print sequence to visually verify
        myLinkedList.printMyNodes();

        // Assert/Verify the underlying links are exactly: 56 -> 30 -> 70
        boolean result = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(newNode) &&
                myLinkedList.tail.equals(secondNode);

        Assert.assertTrue(result);
    }
}