package stack;

public class StackUsingArray {
    private int stack[];
    private int top;

    public StackUsingArray(int size) {
        stack = new int[size];
        top = -1;
    }

    /*
     * O(1) time and space
     */
    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    /*
     * O(1) time and space
     */
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty now :(");
            return -1;
        }
        int element = stack[top];
        top--;
        return element;
    }

    /*
     * O(1) time and space
     */
    public void push(int element) {
        top++;
        stack[top] = element;
    }

    /*
     * O(1) time and space
     */
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty now :(");
            return -1;
        }
        return stack[top];
    }

    /*
     * O(n) time and O(1) space
     */
    public void search(int element) {
        for (int i = 0; i <= top; i++) {
            if(stack[i] ==  element) {
                System.out.println("Element is present at " + i + " index");
                return;
            }
        }
        System.out.println("Element is not present");
    }

    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty now :(");
            return;
        }
        System.out.println("The Stack is : ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}
