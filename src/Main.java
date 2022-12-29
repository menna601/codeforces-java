import java.util.Scanner;

//https://codeforces.com/problemset/problem/268/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte teamsCount = scanner.nextByte();
        byte[] teamsHomeUniform = new byte[101];
        byte[] teamsGuestUniform = new byte[101];
        short gamesCount = 0;

        for (int i = 0; i < teamsCount; i++) {
            teamsHomeUniform[scanner.nextByte()]+=1;
            teamsGuestUniform[scanner.nextByte()]+=1;
        }

        for (int i = 0; i < 101; i++)
            gamesCount += teamsHomeUniform[i] * teamsGuestUniform[i];

        System.out.println(gamesCount);
    }
}
