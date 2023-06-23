package Placement_Training.LinkedList;

import java.util.*;

public class stackUsingLinkedList {
    Node head;
    int size = 0;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void push(int element)  {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    int pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack is Empty");
        int ans = head.data;
        head = head.next;
        size--;
        return ans;
    }

    int peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack is Empty");
        return head.data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) throws Exception {

        stackUsingLinkedList stack = new stackUsingLinkedList();

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();


        while (option <= 5) {
            switch (option) {
                case 1 -> {
                    System.out.println("Pushing the element");
                    int t = sc.nextInt();
                    while (t > 0) {
                        int element = sc.nextInt();
                        stack.push(element);
                        t--;
                    }
                }
                case 2 -> {
                    System.out.println("Popping the element");
                    System.out.println(stack.pop());
                }
                case 3 -> {
                    System.out.println("Topmost element after peeking");
                    System.out.println(stack.peek());
                }
                case 4 -> {
                    System.out.println("Check if stack is Empty");
                    System.out.println(stack.isEmpty());
                }
                case 5 -> {
                    System.out.println("Length of the Stack");
                    System.out.println(stack.size());
                }

            }
            System.out.println("Enter the another option");
            option = sc.nextInt();
        }
    }
}