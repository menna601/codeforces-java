import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://codeforces.com/problemset/problem/228/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> horseShoesColors = new HashSet<>();

        for (int i = 0; i < 4; i++)
            horseShoesColors.add(scanner.nextInt());

        System.out.println(4 - horseShoesColors.size());
    }
}
