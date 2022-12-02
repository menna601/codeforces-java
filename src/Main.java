import java.util.Scanner;

//https://codeforces.com/problemset/problem/263/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(scanner.nextByte() == 1){
                    System.out.println(Math.abs(3-i) + Math.abs(3-j));
                    break;
                }
            }
        }
    }
}
