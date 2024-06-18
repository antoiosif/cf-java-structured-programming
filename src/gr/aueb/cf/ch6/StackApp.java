package gr.aueb.cf.ch6;

/**
 * Implements a stack based on a
 * static array implementation.
 */
public class StackApp {

    static int[] stack = new int[100];
    static int top = -1;    // δείχνει στο τελευταίο στοιχείο της στοίβας

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        int popped = pop();
        System.out.println("POPPED: " + popped);
        System.out.println("TRAVERSE");
        traverseStack();
    }

    /**
     * Inserts a num on top of stack.
     *
     * @param num   the input num.
     */
    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = num;
    }

    /**
     * Gets (and essentially removes) a num from
     * the top of the stack.
     *
     * @return      the num from the top of the stack.
     */
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;  // will be solved with exceptions
        }
        return stack[top--];
    }

    /**
     * Returns true if the stack is full.
     *
     * @return  true if the stack is full,
     *          false otherwise.
     */
    public static boolean isFull() {
        return (top == stack.length - 1);
    }

    /**
     * Returns true if the stack is empty.
     *
     * @return  true if the stack is empty,
     *          false otherwise.
     */
    public static boolean isEmpty() {
        return (top == - 1);
    }

    /**
     * Prints the elements of the stack.
     */
    public static void traverseStack() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
