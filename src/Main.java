import java.util.Scanner;

//https://codeforces.com/problemset/problem/112/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toLowerCase();
        int result = string1.compareTo(string2);
        if(result > 0)
            result = 1;
        else if(result < 0)
            result = -1;
        System.out.println(result);
    }
}
