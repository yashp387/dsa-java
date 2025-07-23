
// delation in LL
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

public class deletionLL {
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
    // delete head of ll
    private static Node removeHead(Node head) {
        if(head == null) return head;
        head = head.next;
        return head;
    }
    // delete tail of ll
    private static Node deleteTail(Node head) {
        if(head ==  null || head.next == null) return null;
        // temporary head for traversal
        Node temp = head;
        // traverse the ll until second last nodes
        while(temp.next.next != null) {
            temp = temp.next;
        }
        // Nullify the connection from the second-to-last node to delete the last node
        temp.next = null;
        // return updated head
        return head;
    }
    // delete kth positioned from the ll
    private static Node delelteKthNode(Node head, int k) {
        if(head == null) return head;

        if(k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head, prev = null;
        while(temp != null) {
            count++;
            if(count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    // remove an element from the ll
    private static Node removeElement(Node head, int element) {
        if(head == null) return head;

        if(head.data == element) {
            head = head.next;
            return head;
        }
        Node temp = head, prev = null;
        while(temp != null) {
            if(temp.data == element) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        Node head1 = convertArr2LL(arr);
        Node result1 = removeHead(head1);
        printLL(result1);

        Node head2 = convertArr2LL(arr);
        Node result2 = deleteTail(head2);
        printLL(result2);

        Node head3 = convertArr2LL(arr);
        Node result3 = delelteKthNode(head3, 5);
        printLL(result3);

        Node head4 = convertArr2LL(arr);
        Node result4 = removeElement(head4, 3);
        printLL(result4);
    }
}
