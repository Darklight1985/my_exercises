package exercises.lists;

import java.util.Scanner;

class Node{
    String data;
    Node next;
    Node(String value) {
        this.data = value;
    }
}

public class SSL {
    public static Node createSLLFromString(String s) {
        String[] data = s.split(" ");
        Node node = null;
        Node last;
        for (int i = data.length - 1; i >= 0; i--) {
            last = node;
            node = new Node(data[i]);
            node.next = last;
        }
        return node;
    }
    public static void printSLL(Node head) {
        Node red = head;
        String data = red.data;
        while (red.next != null) {
            red = red.next;
            data = data.concat("->").concat(red.data);
        };
        System.out.println(data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Node head = createSLLFromString(s);
        printSLL(head);
    }
}