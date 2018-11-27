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
    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1)
        word = word + "s";
        return word;
    }

    //TODO: Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.
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

    //TODO: Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes. Zero-pad single digit numbers as strings so the timestamp is always the same number of characters.
    public static void clock() {

    }
}