public class ArrayProductCalculator {
    public static void main(String[] args) {
        
        int[] numbers = {2, 3, 4, 5};

        int product = productArray(numbers);

        System.out.println("Product of array elements: " + product);
    }

    private static int productArray(int[] arr) {
        int product = 1;
        int index = 0;

        while (index < arr.length) {
            product *= arr[index];
            index++;
        }

        return product;
    }
}
