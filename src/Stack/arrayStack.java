package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class arrayStack<t> {
    // variables
    private final static int DEFAULT_CAPACITY = 3;
        private int top;
        private t[] stack;


    // constotoctor
    public arrayStack() {
        this(DEFAULT_CAPACITY);
    }
    public arrayStack(int size) {
        top = 0;
        stack = (t[]) new Object[size];
    }
    // methods
    int size()
    {
        return top;
    }
    boolean isEmty()
    {
        return top == 0;
    }
    boolean isfull(){
        return top == stack.length;
    }


    // push
    void push(t element)
    {
       // if(size() == stack.length)

        if(isfull())
            ExpendCapacity();


            stack[top] = element;
            top++;

    }
    private void ExpendCapacity()
    {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }
    // peek
     t peek() throws EmptyStackException{
        if(isEmty())
            throw new EmptyStackException();
        return stack[top - 1];
    }
    // pop

    t pop() throws EmptyStackException
    {
        if(isEmty())
        throw new EmptyStackException();
        top--;
        t result = stack[top];
        stack[top] = null;
        return result;
    }
    // Get lenght method
    public String getlenght(){
        return String.valueOf(stack.length);
    }
    // dispaly metond
    public void dispaly() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i] + "");
        }
    }
    // tostring


    @Override
    public String toString() {
        return "arrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }
    private boolean contains(t element) {
        for (int i = 0; i < size(); i++) {
            if (stack[i] == element || (stack[i] != null && stack[i].equals(element))) {
                return true;
            }
        }
        return false;
    }

    public void merge(arrayStack<t> arr1, arrayStack<t> arr2) {
        int newSize = arr1.size() + arr2.size();

        if (stack.length < newSize) {
            stack = Arrays.copyOf(stack, newSize);
        }

        for (int i = 0; i < arr1.size(); i++) {
            if (!contains(arr1.stack[i])) {
                this.push(arr1.stack[i]);

            }
        }

        for (int i = 0; i < arr2.size(); i++) {
            if (!contains(arr2.stack[i])) {
                this.push(arr2.stack[i]);
            }
        }
    }





    public static void main(String[] args) {

        arrayStack<Integer> list1 = new arrayStack<Integer>();
        arrayStack<Integer> list2 = new arrayStack<Integer>();
        arrayStack<Integer> list3 = new arrayStack<>();
    // list one
        list1.push(700);
        list1.push(900);
        list1.push(800);
        list1.push(700);
        list1.push(700);
        list1.push(700);
        list1.push(700);
        list1.push(700);
        list1.push(700);
        list1.push(700);
        list1.push(700);

    // list two
       list2.push(100);
        list2.push(700);
        list2.push(10);


//list2.push(300);
       list3.merge(list1, list2);
       list3.dispaly();
    }
}
