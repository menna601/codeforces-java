import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/381/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short n = scanner.nextShort();
        short[] cards = new short[n];
        short leftPointer = 0;
        short rightPointer = (short) (n-1);
        short maxPerRound = 0;
        int serejaScore = 0;
        int dimaScore = 0;
        boolean isSerejaTurn = true;

        for (int i = 0; i < cards.length; i++)
            cards[i] = scanner.nextShort();

        while (leftPointer <= rightPointer) {
            if (cards[leftPointer] > cards[rightPointer]) {
                maxPerRound = cards[leftPointer];
                leftPointer++;
            } else {
                maxPerRound = cards[rightPointer];
                rightPointer--;
            }
            if (isSerejaTurn)
                serejaScore += maxPerRound;
            else
                dimaScore += maxPerRound;
            isSerejaTurn = !isSerejaTurn;
        }

        System.out.println(serejaScore + " " + dimaScore);
    }
}
