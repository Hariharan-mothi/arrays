public class LinkedList {
    Node head; // Head of the list

    // Node class
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            // Store the next node
            next = current.next;

            // Reverse the current node's pointer
            current.next = prev;

            // Move prev and current one step forward
            prev = current;
            current = next;
        }

        // Set the head to the new first element (prev will be the last node after loop)
        head = prev;
    }

    // Method to add a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add some nodes to the list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        // Print original list
        System.out.println("Original Linked List:");
        list.printList();

        // Reverse the list
        list.reverse();

        // Print reversed list
        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
