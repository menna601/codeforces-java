import java.util.Scanner;

//https://codeforces.com/problemset/problem/732/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short shovelPrice = scanner.nextShort();
        byte denominationCoin = scanner.nextByte();
        byte shovelsCount = 0;

        for (byte i = 1; i < 11; i++) {
            if ((shovelPrice * i) % 10 == 0 || (shovelPrice * i ) % 10 == denominationCoin) {
                shovelsCount = i;
                break;
            }
        }

        System.out.println(shovelsCount);
    }
}
