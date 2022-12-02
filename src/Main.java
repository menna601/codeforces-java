import java.util.Scanner;

//https://codeforces.com/problemset/problem/4/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte weight = scanner.nextByte();
        if(weight % 2 == 0 && weight != 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}