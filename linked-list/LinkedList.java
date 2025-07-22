
// self defining objects in linked list like node i think
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node y = new Node(arr[0]);
        System.out.println(y.data);
        System.out.println(y);
    }    
}
