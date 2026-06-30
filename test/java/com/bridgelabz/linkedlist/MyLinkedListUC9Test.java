package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC9Test {

    @Test
    public void given4Numbers_WhenDeleting40_ShouldReturnSize3AndCorrectSequence() {
        // Create individual generic nodes
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(40);
        MyNode<Integer> fourthNode = new MyNode<>(70);

        // Instantiate the Linked List
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        // Setup initial sequence: 56 -> 30 -> 40 -> 70
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.append(fourthNode);

        System.out.print("Before Deletion: ");
        myLinkedList.printMyNodes();
        System.out.println("Initial Size: " + myLinkedList.size());

        // 1. Search LinkedList to find node with key value 40 and Delete it
        boolean isDeleted = myLinkedList.delete(40);
        Assert.assertTrue(isDeleted);

        // 2. Print sequence to visually verify (Should show 56->30->70)
        System.out.print("After Deletion:  ");
        myLinkedList.printMyNodes();

        // 3. Implement size() and show the Linked List size is 3
        int finalSize = myLinkedList.size();
        System.out.println("Final Size:   " + finalSize);
        Assert.assertEquals(3, finalSize);

        // Verify underlying structural links are correct
        boolean sequenceValid = myLinkedList.head.equals(firstNode) &&
                firstNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(fourthNode) &&
                myLinkedList.tail.equals(fourthNode);

        Assert.assertTrue(sequenceValid);
    }
}