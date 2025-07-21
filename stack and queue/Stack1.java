
// implment stack using arrays
public class Stack1 {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(6);
        st.push(3);
        st.push(7);
        System.out.println("Top of the stack before deleting any element " + st.peek());
        System.out.println("Size of the stack before deleting any element " + st.size());
        System.out.println("The element deleted is " + st.pop());
        System.out.println("Size of the stack after deleting an element " + st.size());
        System.out.println("Top of the stack after deleting an element " + st.peek());
    }
}

class Stack {
    int size = 1000;
    int[] arr = new int[size];
    int top = -1;
    
    void push(int x) {
        if(top >= size - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = x;
    }
    int pop() {
        if(top == -1) {
            System.out.println("stack underflow");
            return -1;
        }
        int x = arr[top];
        top--;
        return x;
    }
    int peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    int size() {
        return top + 1;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)