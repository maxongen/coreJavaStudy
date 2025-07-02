package main.erroHandling;

public class RunTimeErrors {
    public static void main(String[] args) {
//        divide by 0

        int x = 10;
        int y = 0;
        int result = x / y;
        System.out.println(result);

        //    Array Index Out of Bounds
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[8]);
    }

}
