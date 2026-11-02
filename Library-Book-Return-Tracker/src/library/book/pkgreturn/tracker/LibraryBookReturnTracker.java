
package library.book.pkgreturn.tracker;

public class LibraryBookReturnTracker {

    // LINKED LIST LOGIC FOR STACK

    // Node
    private class Node {

        int id;
        String title;
        Node next;

        // Constructor
        Node(int id, String title) {
            this.id = id;
            this.title = title;
            this.next = null;
        }
    }

    // Top Book of Stack
    private Node top;

    // Constructor
    public LibraryBookReturnTracker() {
        top = null;
    }

    // Check if a Book ID already exists
    public boolean containsBook(int searchID) {

        Node current = top;

        while (current != null) {

            if (current.id == searchID) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Add a returned book to the stack (push operation)
    public void push(int id, String title) {

        Node newNode = new Node(id, title);

        newNode.next = top;
        top = newNode;
    }

    // Process the most recent return (pop operation)
    public String pop() {

        if (isEmpty()) {
            return "Stack Underflow! Stack is empty.";
        }

        String processedBook = "\t\tID: " + top.id
                + " - Title: " + top.title;

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
            return "Stack is empty.";
        }

        Node current = top;
        String result = "\t--- BOOK ID ---     ||    --- BOOK TITLE ---\n\n";

        while (current != null) {

            result += "\t\t[ID: " + current.id + "]        "
                    + current.title + "\n";

            current = current.next;
        }

        return result;
    }

    // Linear Search: Search for a book using its ID
    public String searchBook(int searchID) {

        Node current = top;

        while (current != null) {

            if (current.id == searchID) {
                return "Book Found!\n\n"
                        + "Book ID: " + current.id + "\n"
                        + "Book Title: " + current.title + "\n\n"
                        + "The book is currently in the return stack.";
            }

            current = current.next;
        }

        return "Book Not Found!\n\n"
                + "No book with ID " + searchID
                + " exists in the current return stack.";
    }

    public static void main(String[] args) {
        // Main method
    }
}
