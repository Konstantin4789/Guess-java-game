import java.util.Scanner;

public class Logic {
    private int range_Begin;
    private int range_End;
    private int rand;

    private boolean state = false;

    private Scanner scanner = new Scanner(System.in);

    public Logic() {
        start();
        randomizer();
        guess();
    }

    private void randomizer() {
        rand = range_Begin + (int) (Math.random() * (range_End - range_Begin + 1));
    }


    private void start() {
        System.out.println("Welcome to game");
         do {
            System.out.println("Enter range of numbers:");
            range_Begin = scanner.nextInt(); // ввод первого числа с консоли
            range_End = scanner.nextInt(); // ввод второго числа с консоли
            if (range_Begin >= range_End){
                System.out.println("Error");
            }
        } while (range_Begin >= range_End);
        System.out.println("Range is from " + range_Begin + " to " + range_End);
    }

    private void guess(){
        while (!state) {
            System.out.println("Enter the hidden number:");
            int hidden_Number = scanner.nextInt();
            if (hidden_Number == rand) {
                System.out.println("Great!");
                state = true;
            } else {
                if (rand < hidden_Number) {
                    System.out.println("Try less number");
                } else {
                    System.out.println("Try bigger number");
                }
            }
        }
    }
}
