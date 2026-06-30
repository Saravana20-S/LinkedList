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

    // UC6: Method to delete the last element (PopLast)
    public INode<K> popLast() {
        if (this.head == null) {
            return null;
        }

        INode<K> tempNode = this.head;

        // If there's only one element in the list
        if (this.head.equals(this.tail)) {
            this.head = null;
            this.tail = null;
            return tempNode;
        }

        // Traverse until we find the second-to-last node
        while (tempNode.getNext() != this.tail) {
            tempNode = tempNode.getNext();
        }

        // Save the tail node to return it
        INode<K> poppedTail = this.tail;

        // Disconnect the last node and update the tail pointer
        tempNode.setNext(null);
        this.tail = tempNode;

        return poppedTail;
    }

    // UC7: Method to search for a node by its key value
    public INode<K> search(K key) {
        INode<K> tempNode = this.head;

        // Loop through the LinkedList until the end
        while (tempNode != null) {
            // Check if the current node's key matches the search key
            if (tempNode.getKey().equals(key)) {
                return tempNode; // Node found
            }
            tempNode = tempNode.getNext();
        }
        return null; // Node not found
    }

    // UC9: Method to delete a specific node by its key value
    public boolean delete(K key) {
        if (this.head == null) {
            return false;
        }

        // If the node to be deleted is the head node
        if (this.head.getKey().equals(key)) {
            this.pop();
            return true;
        }

        INode<K> tempNode = this.head;
        // Search for the node preceding the node we want to delete
        while (tempNode.getNext() != null && !tempNode.getNext().getKey().equals(key)) {
            tempNode = tempNode.getNext();
        }

        // If the node was found
        if (tempNode.getNext() != null) {
            INode<K> nodeToDelete = tempNode.getNext();
            // If deleting the tail node, update the tail pointer
            if (nodeToDelete.equals(this.tail)) {
                this.tail = tempNode;
            }
            // Link over the deleted node
            tempNode.setNext(nodeToDelete.getNext());
            return true;
        }

        return false; // Node not found
    }

    // UC9: Method to return the size of the LinkedList
    public int size() {
        int count = 0;
        INode<K> tempNode = this.head;
        while (tempNode != null) {
            count++;
            tempNode = tempNode.getNext();
        }
        return count;
    }
}