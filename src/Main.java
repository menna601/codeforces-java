import java.util.Scanner;

//https://codeforces.com/problemset/problem/158/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short count = 0;
        byte n = scanner.nextByte();
        byte k = scanner.nextByte();
        byte kthScore=0;
        for (byte i = 1; i <= n; i++) {
            byte value = scanner.nextByte();
            if (value == 0)
                break;
            if (i == k) {
                kthScore = value;
                count++;
            }
            else if (value >= kthScore)
                count++;
            else break;
        }
        System.out.println(count);
    }
}
