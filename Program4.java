import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: list size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] input = new int[n];

        // Input: array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        // Map to count multiples
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count multiples
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Output
        System.out.println("\nOutput:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + countMap.get(i));
        }

        sc.close();
    }
}
