import java.util.Scanner;

//https://codeforces.com/problemset/problem/677/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        short h = scanner.nextShort();
        short width = n;
        for (int i = 0; i < n; i++) {
            if ( scanner.nextShort() > h )
                width++;
        }
        System.out.println(width);
    }
}
