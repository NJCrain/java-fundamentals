import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);
        flipNHeads(2);
        flipNHeads(3);

        clock();
    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1)
        word = word + "s";
        return word;
    }

    public static void flipNHeads(int streak) {
        int flips = 0;
        int heads = 0;
        Random rnd = new Random();
        while (heads < streak){
            if (rnd.nextFloat() >= 0.5) {
                heads++;
                flips++;
                System.out.println("heads");
            } else {
                flips++;
                heads = 0;
                System.out.println("tails");
            }
        }
        System.out.println("It took " + flips + " " + pluralize("flip", flips) + " to flip " + streak + " " + pluralize("head", streak) + " in a row.");
    }

    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        while (true) {
            int second = now.getSecond();
            do {
                // System.out.println(second == now.getSecond());
                now = LocalDateTime.now();
                time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            } while (second == now.getSecond());

            System.out.println(time);
        }
    }
}