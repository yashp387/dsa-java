
// array to linkedlists
public class LinkedList2 {
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;  i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // length of linked list
    private static int lenghtLL(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // search the element is present in linked list
    private static int checkIfPresent(Node head, int element) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == element) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 4};
        Node head = convertArr2LL(arr);
        System.out.println(head.data);

        // traversal in linked list
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // length of linked list
        System.out.println();
        System.out.println("Length of linked list: " + lenghtLL(head));

        // check for element is present
        System.out.println(checkIfPresent(head, 3));
    }
}
