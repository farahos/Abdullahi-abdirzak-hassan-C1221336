package Stack.linkedStack;

public class node<T> {
    T Element ;
    node<T> next;

    node()
    {
        Element = null;
        next = null;
    }
    node(T Element)
    {
        this.Element = Element;
        next = null;
    }

    public node<T> getNext() {
        return next;
    }
    public void setNext(node<T> next) {
        this.next = next;
    }
    public T getElement() {
        return Element;
    }
    public void setElement(T Element) {
        this.Element = Element;

    }
}
