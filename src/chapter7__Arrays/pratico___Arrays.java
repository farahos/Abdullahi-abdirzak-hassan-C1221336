package chapter7__Arrays;

public class pratico___Arrays {
    public static void main(String[] args) {
        int[] numbers = { 3, 5,6,9,7,8,9};
        int sum = sumArray(numbers);
        System.out.println("The sum of the array elements is: " + sum);

    }



    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
           sum += num;
        }
       return sum;



    }




}
