import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://codeforces.com/problemset/problem/686/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short lines = scanner.nextShort();
        long packsCount = scanner.nextInt();
        int distressCount = 0;

        for (short i = 0; i < lines; i++) {
            char sign = scanner.next().charAt(0);
            int value = scanner.nextInt();

            if (sign == '+')
                packsCount += value;
            else if (value > packsCount)
                distressCount++;
            else
                packsCount -= value;

        }

        System.out.println("" + packsCount + " " + distressCount);
    }
}
