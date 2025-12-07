import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print the question:
        System.out.println("What's your name?");
        String name = scanner.nextLine(); // reads the full line as a String

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        int nextYearAge = age + 1;

        System.out.println("Hello " + name + ", next year, you will be " + nextYearAge + " years old");

        scanner.close();
    }
}