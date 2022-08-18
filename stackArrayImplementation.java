package stackImplementation;


public class stackArrayImplementation {

    int top;
    int capacity;
    int[] stack;

    stackArrayImplementation() {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
        }
        return stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }
    public void display(){
        for (int i:stack){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
    stackArrayImplementation st = new stackArrayImplementation();
        st.isEmpty();
//        st.push(45);
//        st.push(55);
//        st.push(65);
//        st.push(75);
        System.out.println(st.isEmpty());
        System.out.println(st.push(45));
        System.out.println(st.push(55));
        System.out.println(st.push(65));
        System.out.println(st.push(75));
        System.out.println(st.pop());
        System.out.println(st.isFull());
        System.out.println(st.peek());
//        st.display();
    }
}
