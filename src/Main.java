import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://codeforces.com/problemset/problem/443/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Character> chars = new HashSet<>();

        for (char c : scanner.nextLine().replaceAll("\\}|\\{| |,", "").toCharArray())
            chars.add(c);

        System.out.println(chars.size());
    }
}
