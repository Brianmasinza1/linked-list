public class LinkedList {

    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Push method adds a new node to the beginning of the list (LIFO behavior)
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Pop method removes and returns the first node in the list (LIFO behavior)
    public int pop() {
        if (head == null) {
            return -1; // Return -1 if the list is empty
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null; // Set tail to null if the list becomes empty
        }
        return data;
    }

    // Enqueue method adds a new node to the end of the list (FIFO behavior)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Dequeue method removes and returns the first node in the list (FIFO behavior)
    public int dequeue() {
        return pop(); // Call the pop method to remove and return the first node
    }
}
