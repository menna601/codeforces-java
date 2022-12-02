import java.util.Scanner;

//https://codeforces.com/problemset/problem/231/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short noOfProblems = scanner.nextShort();
        short problemSolvedCount = 0;
        for (short i = 0; i < noOfProblems; i++) {
            byte sum = 0;
            for (byte j = 0; j < 3; j++)
                sum += scanner.nextByte();
            if (sum >= 2)
                problemSolvedCount++;
        }
        System.out.println(problemSolvedCount);
    }
}
