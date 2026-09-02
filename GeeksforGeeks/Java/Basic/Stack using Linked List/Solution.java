/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {
    
    Node top;
    int size;
    public myStack() {
        // Initialize your data members
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return size == 0;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        size++;
        Node n1 = new Node(x);
        if(top==null) 
        {
            top = n1;
        }
        else
        {
            n1.next = top;
            top = n1;
        }
    }

    public void pop() {
        // Removes the front element of the stack.
        if(top==null) return;
        size--;
        top = top.next;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(top!=null) return top.data;
        return -1;
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
