package com.gracias;

public class ToDoList {
	// To-Do List class
	
	    private Node head;

	    public ToDoList() {
	        this.head = null;
	    }

	    // Add a new task to the end of the linked list
	    public void addToDo(Task task) {
	        Node newNode = new Node(task);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }

	    // Mark a task as completed based on its title
	    public void markToDoAsCompleted(String title) {
	        Node current = head;
	        while (current != null) {
	            if (current.task.getTitle().equals(title)) {
	                current.task.markCompleted();
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Task not found: " + title);
	    }

	    // Display the list of tasks in the to-do list
	    public void viewToDoList() {
	        Node current = head;
	        System.out.println("To-Do List:");
	        while (current != null) {
	            String status = current.task.isCompleted() ? "[X]" : "[ ]";
	            System.out.println(status + " " + current.task.getTitle() + " - " + current.task.getDescription());
	            current = current.next;
	        }
	    }
	}

	


