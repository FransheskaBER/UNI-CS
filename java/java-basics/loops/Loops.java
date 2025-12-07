public class Loops {
    public static void main(String[] arg) {
        int[] numbers = {3, 7, 10, 2, 5};

        int sum = 0;

        for (int i = 0; i< numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("The sum of the numbers is: " + sum);

        int bonusSum = 0;
        for (int num : numbers) {
            bonusSum += num;
        }

        System.out.println("Bonus sum using enhanced loop: " + bonusSum);
    }
}
