/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.book.pkgreturn.tracker;

public class LibraryBookReturnTracker {
// >>>>>>>>>>>>>>>>>>>>> LINKED LIST LOGIC PARA SA STACK <<<<<<<<<<<<<<<<<<<<<<<< //

    //Node 
    private class Node {

        int data;
        Node next;
        //Constructor

        Node(int data) {
            this.data = data;
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
    public void push(int value) {
        // Create a new node
        Node newNode = new Node(value);
        // Connect the new node to the current top
        newNode.next = top;
        // Make the new node the new top
        top = newNode;
        System.out.println(value + " pushed into the stack.");
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
