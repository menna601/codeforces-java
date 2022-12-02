import java.util.Scanner;

//https://codeforces.com/problemset/problem/282/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        short x = 0;
        scanner.nextLine();
        for (short i = 0; i < n; i++) {
            String statement = scanner.nextLine();
            if(statement.contains("++"))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}
