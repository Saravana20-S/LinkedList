package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC2Test {

    @Test
    public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTop() {
        // Create individual generic nodes
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        // Instantiate the Linked List
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        // 1. Node with data 70 is First Created / Added
        myLinkedList.add(firstNode);

        // 2. Next 30 is added to 70
        myLinkedList.add(secondNode);

        // 3. Finally 56 is added to 30
        myLinkedList.add(thirdNode);

        // Print sequence to visually verify
        myLinkedList.printMyNodes();

        // Assert/Verify the underlying links are mathematically correct: 56 -> 30 -> 70
        boolean result = myLinkedList.head.equals(thirdNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(firstNode);

        Assert.assertTrue(result);
    }
}