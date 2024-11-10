package Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class StackMerge {


    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> list3 = new ArrayList<>(list1); // Start with all elements from list1

        // Add elements from list2, but   if they're not already in list3
        for (Integer element : list2) {
            if (!list3.contains(element)) {
                list3.add(element);
            }
        }

        return list3;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(9);
        list1.add(5);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);

        List<Integer> list3 = merge(list1, list2);

        System.out.println("Merged list without duplicates: " +list3);
}
}

