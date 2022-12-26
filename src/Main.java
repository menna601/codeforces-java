import java.util.Scanner;

//https://codeforces.com/problemset/problem/731/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] wordChars = scanner.next().toCharArray();
        char previousChar = 'a';
        short minRotations = 0;

        for (byte i = 0; i < wordChars.length; i++) {
            byte distance = (byte) Math.abs(wordChars[i] - previousChar);
            if (distance > 13)
                minRotations += 26 - distance;
            else
                minRotations += distance;

            previousChar = wordChars[i];
        }
        System.out.println(minRotations);
    }
}
