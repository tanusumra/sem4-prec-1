public class MaxValueFinder {
    public static void main(String[] args) {
        
        int[] numbers = {8, 15, 3, 10, 22, 5};

        int max = findMax(numbers);

        System.out.println("Maximum value in the array: " + max);
    }

    private static int findMax(int[] arr) {
        if (arr.length == 0) {
            
            System.out.println("Array is empty.");
            return Integer.MIN_VALUE; 
        }

        int max = arr[0];
        int index = 1;

        do {
            if (arr[index] > max) {
                max = arr[index];
            }
            index++;
        } while (index < arr.length);

        return max;
    }
}
