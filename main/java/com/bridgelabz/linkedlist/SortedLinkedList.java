package com.bridgelabz.linkedlist;

public class SortedLinkedList<K extends Comparable<K>> {
    public INode<K> head;
    public INode<K> tail;

    public SortedLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // UC10: Add node while maintaining ascending sorted order
    public void add(INode<K> newNode) {
        // Case 1: List is completely empty
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        // Case 2: New node belongs at the very front (New Head)
        if (newNode.getKey().compareTo(this.head.getKey()) < 0) {
            newNode.setNext(this.head);
            this.head = newNode;
            return;
        }

        // Case 3: Traverse and find the correct spot in the middle or end
        INode<K> current = this.head;
        while (current.getNext() != null &&
                current.getNext().getKey().compareTo(newNode.getKey()) < 0) {
            current = current.getNext();
        }

        // Insert the node
        newNode.setNext(current.getNext());
        current.setNext(newNode);

        // Update tail if inserted at the very end
        if (newNode.getNext() == null) {
            this.tail = newNode;
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("Sorted LinkedList Sequence: ");
        INode<K> tempNode = head;
        while (tempNode != null) {
            myNodes.append(tempNode.getKey());
            if (tempNode.getNext() != null) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        System.out.println(myNodes);
    }
}