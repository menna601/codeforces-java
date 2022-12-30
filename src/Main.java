import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://codeforces.com/problemset/problem/265/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] stonesSeq = scanner.next().toCharArray();
        char[] instructions = scanner.next().toCharArray();
        byte currentPosition = 0;

        for (char instruction : instructions) {
            if (instruction == stonesSeq[currentPosition])
                currentPosition++;
        }

        System.out.println(currentPosition + 1);
    }
}
