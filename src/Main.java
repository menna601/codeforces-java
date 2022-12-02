import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

//https://codeforces.com/problemset/problem/281/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string.substring(0,1).toUpperCase() + string.substring(1));
    }
}
