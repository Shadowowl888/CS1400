public class Recursive {
    public static void main(String[] args) {
        message(5);
        System.out.println("Done");
    }

    public static void message(int n) {
        if (n > 0) {
            message(n - 1);
            System.out.println("done with " + n);
        }
    }
}
