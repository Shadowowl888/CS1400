import java.util.Scanner;

public class HelloWorld
{
  public static void main(String[] args)
  {
    String message = "Hello World!";
    System.out.println(message);

    System.out.println("This line is too long so " + 
                        "I expanded this");
    
    char char1 = 'a';
    char char2 = 'A';
    System.out.println(char1 < char2);

    Scanner scan = new Scanner(System.in);
    System.out.println("What is your favorite color?");
    String color = scan.nextLine();
    System.out.println("Your favorite color is " + color);
    scan.close();
  }
}