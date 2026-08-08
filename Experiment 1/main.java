import java.util.Scanner;

class Stack {
    int[] stack = new int[5];
    int top = -1;

   
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }

    
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

   
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

    
    boolean isEmpty() {
        return top == -1;
    }

   
    boolean isFull() {
        return top == stack.length - 1;
    }
}

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack s = new Stack();

        boolean running = true;

        while (running) {
            System.out.println("\n== STACK MENU ==");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if Empty");
            System.out.println("6. Check if Full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Is Stack Empty? " + s.isEmpty());
                    break;

                case 6:
                    System.out.println("Is Stack Full? " + s.isFull());
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 7.");
            }
        }

        scanner.close();
    }
}