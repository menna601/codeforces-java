import java.util.InputMismatchException;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/709/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfOranges = scanner.nextInt();
        int maxOrangeSize = scanner.nextInt();
        int maxOrangesSize = scanner.nextInt();
        long sumOfOranges = 0;
        int count = 0;

        for (int i = 0; i < numOfOranges; i++) {
            int currentOrange = scanner.nextInt();
            if (currentOrange <= maxOrangeSize) {
                sumOfOranges += currentOrange;
                if (sumOfOranges > maxOrangesSize) {
                    sumOfOranges = 0;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
