class MyQueue {
 
    int front, rear;
int arr[] = new int[100005];
 
    MyQueue()
{
front=0;
rear=0;
}
 
//Function to push an element x in a queue.
void push(int x)
{
    arr[rear] = x;
    rear++;
} 
int pop()
{
    if(front == rear) return -1;
    int val = arr[front];
    front++;
    return val;
} 
}
