package Implementation.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int pointer = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    protected boolean isFull() {
        return this.pointer == this.data.length - 1;
    }

    protected boolean isEmpty() {
        return this.pointer == -1;
    }

    public void push(int item) {
        if (this.isFull()) return;
        this.data[++pointer] = item;
    }

    public int pop () throws Exception {
        if (this.isEmpty()) throw new StackException("Cannot pop from empty stack");
        return this.data[pointer--];
    }

    public int peek() throws Exception{
        if (this.isEmpty()) throw new StackException("Cannot peek from empty stack");
        return this.data[this.pointer];
    }
}
