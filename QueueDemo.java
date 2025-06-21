public class QueueDemo {
    int front, rear, cap;
    int queue[];

    public QueueDemo(int cap) {
        this.cap = cap;
        queue = new int[cap];
        front = -1;
        rear = -1;
    }

    boolean enqueue(int ele) {
        if (rear == cap - 1) {
            System.out.println("Queue Overflow");
            return false;
        }

        rear++;
        queue[rear] = ele;
        if (front == -1) {
            front = 0;
        }
        System.out.println(ele + " inserted successfully");
        return true;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int delEle = queue[front];
        front++;
        if (front > rear) {
            rear = -1;
        }
        return delEle;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        }
        System.out.println("Queue elements are-->");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        QueueDemo qd = new QueueDemo(5);
        for (int i = 10; i <= 60; i += 10) {
            qd.enqueue(i);
        }
        qd.dequeue();
        qd.display();
    }
}
