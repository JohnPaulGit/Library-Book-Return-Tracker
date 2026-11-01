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

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
