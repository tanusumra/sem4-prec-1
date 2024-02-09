public class ArraySumCalculator {
    public static void main(String[] args) {
       
        int[] numbers = {5, 10, 15, 20, 25};

        int sum = sumArray(numbers);

        System.out.println("Sum of array elements: " + sum);
    }

    private static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
