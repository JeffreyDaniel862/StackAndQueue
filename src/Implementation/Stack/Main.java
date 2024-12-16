package Implementation.Stack;

public class Main {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(10);
        try {
            System.out.println(stack.pop());
            System.out.println(stack.peek());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}