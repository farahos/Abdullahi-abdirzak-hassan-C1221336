package Stack;

public class pair<t,u> {
    t first;
    u last ;
    pair(t first, u last)
    {
        this.first = first;
        this.last = last;
    }
    public t getFirst()
    {
        return first;
    }
    public u getLast()
    {
        return last;
    }

    @Override
    public String toString() {
        return "pair{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    public static void main(String[] args) {
        pair<Integer,String> pairs = new pair<>(1,"farah");

        System.out.println(pairs.getFirst());
        System.out.println(pairs.getLast());
        System.out.printf(pairs.toString());


    }

}
