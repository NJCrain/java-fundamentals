import java.util.Random;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {

    public static int[] roll(int rolls) {
        int[] values = new int[rolls];
        Random rnd = new Random();
        for (int i = 0; i < values.length; i++) {
            int roll = rnd.nextInt(6) + 1;
            values[i] = roll;
        }
        return values;
    }

    public static boolean containsDuplicates(int[] arr) {
        boolean hasDupe = false;
        outer: for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDupe = true;
                    break outer;
                }
            }
        }
        return hasDupe;
    }

    public static double average(int[] arr) {
        double average = 0;
        for (int value : arr)
            average += value;
        return average/ (double)arr.length;
    }

    public static int[] lowestAverage(int[][] arraySet) {
        double lowestAvg = average(arraySet[0]);
        int lowestIndex = 0;
        for (int i = 1; i < arraySet.length; i++) {
            double setAvg = average(arraySet[i]);
            if (setAvg < lowestAvg) {
                lowestAvg = setAvg;
                lowestIndex = i;
            }
        }
        return arraySet[lowestIndex];
    }
}
