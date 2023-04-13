public class Exam2Review {
    public static void main(String[] args) {
        // Exam 2 Review
        System.out.println("allDifferent(1, 2, 3): " + allDifferent(1, 2, 3));
        System.out.println("allDifferent(11, 11, 11): " + allDifferent(11, 11, 11));
        System.out.println("isPrime(10): " + isPrime(10));
        System.out.println("isPrime(2): " + isPrime(2));
        System.out.println("isPrime(13): " + isPrime(13));

        // Exam 2
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("computeDifference([1, 2, 3, 4, 5]):  " + computeDifference(arr));
    }

    // Methods Section
    public static boolean allDifferent(int num1, int num2, int num3) {
        return num1 != num2 && num2 != num3 && num1 != num3;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Exam 2 FRQ #2
    public static int computeDifference(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            } else if (x > max) {
                max = x;
            }
        }
        return max - min;
    }
}