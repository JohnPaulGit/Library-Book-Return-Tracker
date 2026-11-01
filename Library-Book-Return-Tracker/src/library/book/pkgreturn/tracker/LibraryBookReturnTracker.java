/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.book.pkgreturn.tracker;

public class LibraryBookReturnTracker {
// >>>>>>>>>>>>>>>>>>>>> LINKED LIST LOGIC PARA SA STACK <<<<<<<<<<<<<<<<<<<<<<<< //

    //Node 
    private class Node {

        int id;
        String title;
        Node next;
        //Constructor

        Node(int id, String title) {
            this.id = id;
            this.title = title;
            this.next = null;
        }
    }
    //Top Book of Stack
    private Node top;

    //Constructor
    public LibraryBookReturnTracker() {
        top = null;
    }

    // Add a returned book to the stack (push operation)
    public void push(int id, String title) {
        // Create a new node
        Node newNode = new Node(id, title);
        // Connect the new node to the current top
        newNode.next = top;
        // Make the new node the new top
        top = newNode;
    }

    // Process the most recent return (pop operation)
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
        }
        // Importante! diri ang call para sa display!!
        String processedBook = "\t\tID: " + top.id + " - " + top.title;
        // Move top to the next node
        top = top.next;
        return processedBook;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the return stack
    public String display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        Node current = top;
        String result = "\t--- BOOK ID ---     ||    --- BOOK TITLE ---\n\n";
        while (current != null) {
            result += "\t\t[ID: " + current.id + "]  ||  " + current.title + "\n";
            current = current.next; // Move to the next node
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
