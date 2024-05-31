package com.smart;
//Singly Linked List class
public class LinkedList {
	Node head;

    // Insert a node at a given position
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node prevNode = head;
        int currentPos = 1;
        while (prevNode != null && currentPos < position - 1) {
            prevNode = prevNode.next;
            currentPos++;
        }

        if (prevNode == null) {
            return;
        }

        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete a node at a given position
    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node prevNode = head;
        int currentPos = 1;
        while (prevNode.next != null && currentPos < position - 1) {
            prevNode = prevNode.next;
            currentPos++;
        }

        if (prevNode.next == null) {
            return;
        }

        Node nextNode = prevNode.next.next;
        prevNode.next = nextNode;
    }

    // Delete a node after a given node
    public void deleteAfterNode(Node givenNode) {
        if (head == null || givenNode.next == null) {
            return;
        }

        Node nextNode = givenNode.next;
        givenNode.next = nextNode.next;
    }

    // Search for a node with a given value
    public Node searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}

// Stack using Linked List
class Stack {
    LinkedList linkedList;

    Stack() {
        linkedList = new LinkedList();
    }

    // Push operation
    public void push(int data) {
        linkedList.insertAtPos(data, 1);
    }

    // Pop operation
    public int pop() {
        if (linkedList.head == null) {
            return -1;
        }

        int data = linkedList.head.data;
        linkedList.deleteAtPosition(1);
        return data;
    }

    // Peek operation
    public int peek() {
        if (linkedList.head == null) {
            return -1;
        }
        return linkedList.head.data;
    }

	}

  

