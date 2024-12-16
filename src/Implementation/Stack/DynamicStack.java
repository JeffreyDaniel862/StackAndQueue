package Implementation.Stack;

public class DynamicStack extends CustomStack{

    public DynamicStack () {
        super();
    }
    public DynamicStack (int size) {
        super(size);
    }

    @Override
    public void push(int item) {
        if (this.isFull()) {
           int[] temp = new int[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        super.push(item);
    }
}
