package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC8Test {

    @Test
    public void given3Numbers_WhenInserting40After30_ShouldFormCorrectSequence() {
        // Create individual generic nodes for baseline setup
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        // Instantiate the Linked List
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        // Setup the initial baseline sequence: 56 -> 30 -> 70
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        System.out.print("Before Insertion: ");
        myLinkedList.printMyNodes();

        // 1. Search LinkedList to get Node with key value 30
        INode<Integer> targetNode = myLinkedList.search(30);
        Assert.assertNotNull(targetNode);

        // 2. Create the new node with value 40 and insert it after 30
        MyNode<Integer> newNode = new MyNode<>(40);
        myLinkedList.insert(targetNode, newNode);

        // Print sequence to visually verify (Should show 56->30->40->70)
        System.out.print("After Insertion:  ");
        myLinkedList.printMyNodes();

        // 3. Assert/Verify that the final sequence links match up perfectly
        boolean result = myLinkedList.head.equals(firstNode) &&
                firstNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(newNode) &&
                newNode.getNext().equals(thirdNode) &&
                myLinkedList.tail.equals(thirdNode);

        Assert.assertTrue(result);
    }
}