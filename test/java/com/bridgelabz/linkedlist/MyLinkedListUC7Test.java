package com.bridgelabz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListUC7Test {

    @Test
    public void given3Numbers_WhenSearched_ShouldReturnMatchingNode() {
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

        // UC7: Search for the node with key value 30
        INode<Integer> foundNode = myLinkedList.search(30);

        // Print sequence to visually verify
        myLinkedList.printMyNodes();
        System.out.println("Searched for 30, Found Node with Key: " + (foundNode != null ? foundNode.getKey() : "null"));

        // Assert/Verify that the returned node is exactly the secondNode
        Assert.assertNotNull(foundNode);
        Assert.assertEquals(secondNode, foundNode);
    }
}