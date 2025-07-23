
// insertion in ll
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1) {
        this.data = data1;
    }
}
public class insertionLL {
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
    
    private static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    // insert a node at head of ll
    private static Node insertHead(Node head, int value) {
        Node temp = new Node(value, head);
        return temp;
    }
    // insert a node at tail of ll
    private static Node insertTail(Node head, int value) {
        if(head == null) {
            return new Node(value);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }
    // insert element at kth postion in ll
    private static Node insertKPostion(Node head, int element, int k) {
        if(head == null) {
            if(k == 1) {
                return new Node(element);
            } else {
                return head;
            }
        }
        if(k == 1) {
            return new Node(element, head);
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if(count == (k - 1)) {
                Node x = new Node(element, temp.next);;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertBeforeValue(Node head, int element, int value) {
        if(head == null) {
            return null;
        }
        if(head.data == value) {
            return new Node(element, head);
        }
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.data == value) {
                Node x = new Node(element, temp.next);;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 2, 5, 7};
        Node head1 = convertArr2LL(arr);
        Node result1 = insertHead(head1, 1);
        printLL(result1);

        Node head2 = convertArr2LL(arr);
        Node result2 = insertTail(head2, 100);
        printLL(result2);

        Node head3 = convertArr2LL(arr);
        Node result3 = insertKPostion(head3, 1, 5);
        printLL(result3);

        Node head4 = convertArr2LL(arr);
        Node result4 = insertBeforeValue(head4, 100, 2);
        printLL(result4);
    }
}
