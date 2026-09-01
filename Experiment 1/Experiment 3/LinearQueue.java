import java.util.Scanner;

public class LinearQueue {
    static final int MAX = 100;
    static int[] queue = new int[MAX];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int customer) {
        if (rear == MAX - 1) {
            System.out.println("Queue Overflow! Counter is full.");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = customer;

        System.out.println("Customer " + customer + " joined the queue.");
    }

   
    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! No customers in the queue.");
            return;
        }

        System.out.println("Customer " + queue[front] + " has been served.");
        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }


    static void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Customer at the front: " + queue[front]);
    }

    static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Customers in the queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Railway Ticket Reservation Counter ---");
            System.out.println("1. Enqueue (Add Customer)");
            System.out.println("2. Dequeue (Serve Customer)");
            System.out.println("3. Peek (View Front Customer)");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer number: ");
                    int customer = sc.nextInt();
                    enqueue(customer);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}