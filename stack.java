public class stack {
    int top, cap;
    int arr[];

    public stack(int capacity) {
        cap = capacity;
        top = -1;
        arr = new int[cap];
    }

    boolean push(int data) {
        if (top == cap - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        top++;
        arr[top] = data;
        System.out.println(data + "Inserted Successfully");
        return true;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int popEle = arr[top];
        top--;
        return popEle;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack underflow");

        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        stack stk = new stack(5);
        for (int i = 10; i <= 60; i += 10) {
            stk.push(i);
        }
        System.out.println(stk.peek());
        System.out.println("The popped element is" + stk.pop());
        stk.display();
    }
}