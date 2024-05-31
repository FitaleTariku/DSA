package com.gracias;
// Task class
public class Task {
	

	    private String title;
	    private String description;
	    private boolean completed;

	    public Task(String title, String description) {
	        this.title = title;
	        this.description = description;
	        this.completed = false;
	    }

	    public String getTitle() {
	        return this.title;
	    }

	    public String getDescription() {
	        return this.description;
	    }

	    public boolean isCompleted() {
	        return this.completed;
	    }

	    public void markCompleted() {
	        this.completed = true;
	    }
	    
	    public class Main {
	        public static void main(String[] args) {
	            ToDoList toDoList = new ToDoList();

	            // Add tasks to the to-do list
	            toDoList.addToDo(new Task("Finish homework", "Complete the math assignment"));
	            toDoList.addToDo(new Task("Go for a walk", "Take a 30-minute walk outside"));
	            toDoList.addToDo(new Task("Call mom", "Check in with mom and see how she's doing"));

	            // View the to-do list
	            toDoList.viewToDoList();

	            // Mark a task as completed
	            toDoList.markToDoAsCompleted("Go for a walk");

	            // View the updated to-do list
	            toDoList.viewToDoList();
	        }
	    }
	    
	    
	}




