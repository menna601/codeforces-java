import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/431/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short[] stripsCalories = new short[4];
        int sum = 0;

        for (short i = 0; i < stripsCalories.length; i++)
            stripsCalories[i] = scanner.nextShort();

        String[] pressSequence = scanner.next().split("");
        for (String s : pressSequence) {
            sum += stripsCalories[Integer.parseInt(s) - 1];
        }

        System.out.println(sum);

    }
}
