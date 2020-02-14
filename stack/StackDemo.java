package stack;

public class StackDemo {

    public static void main(String args[]) {
        StackUsingArray stackUsingArray = new StackUsingArray(10);
        stackUsingArray.printStack();
        stackUsingArray.peek();
        stackUsingArray.push(12);
        stackUsingArray.printStack();
        stackUsingArray.push(1);
        stackUsingArray.printStack();
        stackUsingArray.pop();
        stackUsingArray.printStack();
        stackUsingArray.pop();
        stackUsingArray.printStack();
        stackUsingArray.push(10);
        stackUsingArray.push(5);
        stackUsingArray.push(4);
        stackUsingArray.push(3);
        stackUsingArray.push(2);
        stackUsingArray.push(1);
        stackUsingArray.printStack();
        stackUsingArray.pop();
        stackUsingArray.printStack();
        stackUsingArray.search(2);
        stackUsingArray.search(1);
        stackUsingArray.push(1);
        stackUsingArray.search(1);
    }
}
