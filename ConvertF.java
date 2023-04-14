import java.util.Scanner;

public class ConvertF {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
    }
}
