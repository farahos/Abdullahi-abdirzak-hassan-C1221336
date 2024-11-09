package Stack.linkedStack;

import org.w3c.dom.Node;

import javax.xml.namespace.QName;

public class linkedstack<T> {
    int count;
    node<T> top;

    public linkedstack() {
        count = 0;
        top = null;
    }

    // size
    int size() {
        return count;
    }

    // ISEmpty
     boolean isEmpty() {
        return count == 0;
    }


    // push
    void push(T element) {
        node<T> temaddress = new node<>(element);
        temaddress.setNext(top);
        top = temaddress;
        count++;
    }

    // pop
    T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T removed = top.getElement();
        top = top.getNext();
        return removed;


    }

    // peek
    T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.getElement();

    }

    // print
    void display() {
        if (!isEmpty()) {
            node<T> currentAddres = top;
            while (currentAddres != null) {
                System.out.println(currentAddres);
                System.out.println(currentAddres.getElement());
                currentAddres = currentAddres.getNext();

            }
        } else
            System.out.println("Stack is empty");

    }

    //search
//    boolean search(T data) {
//        boolean found = false;
//        node<T> currentAddres = top;
//        if (isEmpty()) {
//            System.out.println("Stack is empty");
//        } else
//            while (currentAddres != null) {
//                if (data.equals(currentAddres.getElement()))
//                    found = true;
//                currentAddres = currentAddres.getNext();
//
//            }
//            return found;
//    }
    void search(T data)
    {
        int counter = 0;
        node<T> currentAddres = top;
       if(isEmpty())
       {
           System.out.println("Stack is empty");

       }else
       {
           while (currentAddres != null)
           {
               if(data.equals(currentAddres.getElement()))
                   counter++;
               System.out.println(counter);
               currentAddres = currentAddres.getNext();

           }
           // display
           if(counter == 0) {
               System.out.println("not found");
           }else
           System.out.println(data +" founds "+ counter + " times");
       }
    }

    public static void main(String[] args) {
        linkedstack<Integer> numbers = new linkedstack<>();
      //numbers.push(200);

     // numbers.push(300);

      numbers.display();
     //   System.out.println(numbers.top.getElement());


    }


}
