package com.bridgelabz.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        // Create individual generic nodes
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        // Link the nodes together: 56 -> 30 -> 70
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        // Verify the links by printing the sequence
        System.out.println("Linked List Sequence:");
        System.out.print(firstNode.getKey() + " -> ");
        System.out.print(firstNode.getNext().getKey() + " -> ");
        System.out.println(firstNode.getNext().getNext().getKey());
    }
}