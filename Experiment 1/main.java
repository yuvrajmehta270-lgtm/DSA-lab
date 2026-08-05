class Stack {
    int[] stack = new int[5];
    int top = -1;

    // Push
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    // Pop
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }

    // Peek
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Display
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    boolean isFull() {
        return top == stack.length - 1;
    }
}

public class main {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();

        System.out.println("Is Stack Empty? " + s.isEmpty());
        System.out.println("Is Stack Full? " + s.isFull());
    }
}