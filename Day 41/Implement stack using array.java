class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if(top==arr.length-1){
            System.out.println("Stack is full");
        }
        top++;
        arr[top]=x;
    }

    public int pop() {
        if(top==-1){
            return -1;
        }
        int element=arr[top];
        top--;
        return element;
    }
}
