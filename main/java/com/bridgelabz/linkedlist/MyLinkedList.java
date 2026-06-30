package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // UC2: Method to add elements to the front (Prepend)
    public void add(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            // Point new node's next to the current head
            newNode.setNext(this.head);
            // Move head pointer to the new node
            this.head = newNode;
        }
    }

    // Helper method to display the linked list sequence
    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("LinkedList Sequence: ");
        INode<K> tempNode = head;
        while (tempNode != null) {
            myNodes.append(tempNode.getKey());
            if (tempNode.getNext() != null) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        System.out.println(myNodes);
    }


    // UC3: Method to append elements to the end (Add to tail)
    public void append(INode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            // Link the current tail's next to the new node
            this.tail.setNext(newNode);
            // Move the tail pointer to the new node
            this.tail = newNode;
        }
    }

    // UC4: Method to insert a node after a specific node
    public void insert(INode<K> destNode, INode<K> newNode) {
        if (destNode == null) {
            System.out.println("The destination node cannot be null.");
            return;
        }
        // Set the new node's next to the destination node's next
        newNode.setNext(destNode.getNext());
        // Point the destination node's next to the new node
        destNode.setNext(newNode);
    }

    // UC5: Method to delete the first element (Pop)
    public INode<K> pop() {
        if (this.head == null) {
            return null;
        }
        INode<K> tempNode = this.head;
        // Shift head to point to the next node
        this.head = this.head.getNext();

        // If list becomes empty, set tail to null as well
        if (this.head == null) {
            this.tail = null;
        }

        return tempNode;
    }
}