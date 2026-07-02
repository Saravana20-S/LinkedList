# Linked List Data Structure in Java

## Overview

This project demonstrates the implementation of a **Singly Linked List** in Java using Object-Oriented Programming principles. The project covers various Linked List operations such as insertion, deletion, searching, sorting, and size calculation through a series of use cases.

---

## Features

* Create a Linked List
* Add nodes at the beginning
* Append nodes at the end
* Insert nodes at a specific position
* Delete the first node
* Delete the last node
* Search for a node
* Insert a node after a specific node
* Delete a specific node
* Calculate the size of the Linked List
* Create a Sorted (Ordered) Linked List

---

## Project Structure

```text
src/
└── com/
    └── bridgelabz/
        ├── linkedlist/
        │   ├── Node.java
        │   ├── LinkedList.java
        │   └── LinkedListTest.java
        │
        └── sortedlinkedlist/
            ├── Node.java
            ├── SortedLinkedList.java
            └── Main.java
```

---

# Use Cases Implemented

## UC1: Create a Simple Linked List

### Objective

Create a simple Linked List containing:

```text
56 -> 30 -> 70
```

### Operations

* Create Node class
* Create LinkedList class
* Add nodes to the Linked List
* Display Linked List

### Output

```text
56 -> 30 -> 70
```

---

## UC2: Add Nodes to Create Linked List

### Objective

Create Linked List by adding:

```text
70
30
56
```

at the beginning.

### Final Sequence

```text
56 -> 30 -> 70
```

### Concept Used

* addFirst()
* Head manipulation

---

## UC3: Append Nodes to Create Linked List

### Objective

Create Linked List by appending:

```text
56
30
70
```

### Final Sequence

```text
56 -> 30 -> 70
```

### Concept Used

* append()
* Traversing to the last node

---

## UC4: Insert 30 Between 56 and 70

### Initial Sequence

```text
56 -> 70
```

### Operation

Insert:

```text
30
```

between 56 and 70.

### Final Sequence

```text
56 -> 30 -> 70
```

### Concept Used

* insertAfter()
* Node linking

---

## UC5: Delete First Element

### Initial Sequence

```text
56 -> 30 -> 70
```

### Operation

Delete first node.

### Final Sequence

```text
30 -> 70
```

### Concept Used

* pop()
* Updating head reference

---

## UC6: Delete Last Element

### Initial Sequence

```text
56 -> 30 -> 70
```

### Operation

Delete last node.

### Final Sequence

```text
56 -> 30
```

### Concept Used

* popLast()
* Finding second-last node

---

## UC7: Search for Node 30

### Initial Sequence

```text
56 -> 30 -> 70
```

### Operation

Search for node containing:

```text
30
```

### Result

```text
Node Found
```

### Concept Used

* Traversal
* Linear Search

### JUnit Test Included

* Search existing node
* Search non-existing node

---

## UC8: Insert 40 After 30

### Initial Sequence

```text
56 -> 30 -> 70
```

### Operation

Insert:

```text
40
```

after:

```text
30
```

### Final Sequence

```text
56 -> 30 -> 40 -> 70
```

### Concept Used

* Search node
* Insert node after target node

### JUnit Test Included

* Verify insertion
* Verify node links

---

## UC9: Delete Node 40 and Find Size

### Initial Sequence

```text
56 -> 30 -> 40 -> 70
```

### Operation

Delete node:

```text
40
```

### Final Sequence

```text
56 -> 30 -> 70
```

### Size

```text
3
```

### Concept Used

* Delete by key
* Size calculation

### JUnit Test Included

* Verify deletion
* Verify size

---

## UC10: Ordered Linked List

### Objective

Create an Ordered Linked List by inserting:

```text
56
30
40
70
```

### Final Sequence

```text
30 -> 40 -> 56 -> 70
```

### Concept Used

* Comparable Interface
* Generic Node Class
* Sorted insertion during add()

---

# Time Complexity Analysis

| Operation     | Time Complexity |
| ------------- | --------------- |
| Add First     | O(1)            |
| Append        | O(n)            |
| Insert After  | O(n)            |
| Delete First  | O(1)            |
| Delete Last   | O(n)            |
| Search        | O(n)            |
| Delete by Key | O(n)            |
| Size          | O(n)            |
| Sorted Insert | O(n)            |

---

# Technologies Used

* Java
* Eclipse IDE
* JUnit 5
* Object-Oriented Programming
* Generics
* Comparable Interface

---

# Learning Outcomes

Through this project, the following concepts were explored:

* Classes and Objects
* Encapsulation
* Linked List Data Structure
* Node Manipulation
* Traversal Techniques
* Generic Programming
* Comparable Interface
* JUnit Testing
* Time Complexity Analysis

---

# Sample Output

```text
56 -> 30 -> 70

Insert 40 after 30

56 -> 30 -> 40 -> 70

Delete 40

56 -> 30 -> 70

Size = 3

Sorted Linked List

30 -> 40 -> 56 -> 70
```

---

## Author

Saravanan S

Java Developer | Data Structures & Algorithms Learner
