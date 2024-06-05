package org.example;

public class Queue {
    private Node first;
    private Node last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    // Add to the end
    public int enqueue(String val) {
        Node newNode = new Node(val);
        if (this.size == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.size += 1;
        return this.size;
    }

    // Remove from the beginning
    public String dequeue() {
        if (this.size == 0) {
            return null;
        }

        Node oldFirst = this.first;
        if (this.size == 1) {
            this.first = null;
            this.last = null;
        } else {
            this.first = oldFirst.next;
            oldFirst.next = null;
        }
        this.size -= 1;

        return oldFirst.value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = this.first;
        while (current != null) {
            result.append(current.value).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }
}
