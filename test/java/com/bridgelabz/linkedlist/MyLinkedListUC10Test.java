package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC10Test {

    @Test
    public void given4Numbers_WhenAddedToSortedLinkedList_ShouldBeInAscendingOrder() {
        // Create nodes in the requested input sequence: 56, 30, 40, 70
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(40);
        MyNode<Integer> fourthNode = new MyNode<>(70);

        // Instantiate the Sorted Linked List
        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();

        // Add them one by one in random order
        sortedList.add(firstNode);
        sortedList.add(secondNode);
        sortedList.add(thirdNode);
        sortedList.add(fourthNode);

        // Print sequence to visually verify (Should show 30->40->56->70)
        sortedList.printMyNodes();

        // Assert/Verify the underlying links match up perfectly in ascending order
        boolean isValidOrder = sortedList.head.equals(secondNode) &&        // 30
                secondNode.getNext().equals(thirdNode) &&    // 40
                thirdNode.getNext().equals(firstNode) &&     // 56
                firstNode.getNext().equals(fourthNode) &&    // 70
                sortedList.tail.equals(fourthNode);

        Assert.assertTrue(isValidOrder);
    }
}