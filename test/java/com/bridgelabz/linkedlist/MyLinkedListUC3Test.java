package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC3Test {

    @Test
    public void given3Numbers_WhenAppendedToLinkedList_ShouldBeAddedToTail() {
        // Create individual generic nodes
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        // Instantiate the Linked List
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        // 1. Node with data 56 is First Created / Appended
        myLinkedList.append(firstNode);

        // 2. Next Append 30 to 56
        myLinkedList.append(secondNode);

        // 3. Finally Append 70 to 30
        myLinkedList.append(thirdNode);

        // Print sequence to visually verify
        myLinkedList.printMyNodes();

        // Assert/Verify the underlying links are correct: 56 -> 30 -> 70
        boolean result = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);

        Assert.assertTrue(result);
    }
}