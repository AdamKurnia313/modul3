
import java.util.Arrays;

class median {
    public static void main(String[] args) {
        int[] numbers = {56, 40, 64, 32, 16, 48, 8, 24};

        // Mengurutkan array
        Arrays.sort(numbers);

        double median;
        int middle = numbers.length / 2;

        if (numbers.length % 2 == 1) {
            // Jika jumlah elemen ganjil, median adalah elemen tengah
            median = numbers[middle];
        } else {
            // Jika jumlah elemen genap, median adalah rata-rata dua elemen tengah
            median = (double) (numbers[middle - 1] + numbers[middle]) / 2;
        }

        System.out.println("Median: " + median);
    }
}