import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://codeforces.com/problemset/problem/9/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] probability = {"0/1", "1/6", "1/3", "1/2", "2/3", "5/6", "1/1"};

        byte max = (byte) Math.max(scanner.nextByte(), scanner.nextByte());
        byte numerator = (byte) (6 - max + 1);

        System.out.println(probability[numerator]);
    }
}
