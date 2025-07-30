public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        return new double[]{(double)sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.print("Numbers: ");
        for (int n : randomNumbers) System.out.print(n + " ");
        double[] stats = findAverageMinMax(randomNumbers);
        System.out.println("\nAverage: " + stats[0] + ", Min: " + stats[1] + ", Max: " + stats[2]);
    }
}
