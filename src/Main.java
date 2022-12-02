import java.util.Scanner;
import java.util.regex.Pattern;

//https://codeforces.com/problemset/problem/339/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] numberCount = new byte[3];
        String orderedString = "";

        String[] string = scanner.nextLine().split("\\+");

        for (byte i = 0; i < string.length; i++)
            numberCount[Integer.parseInt(string[i])-1]++;

        for (byte i = 0; i < numberCount.length; i++) {
            for (byte b = 0; b < numberCount[i]; b++) {
                orderedString += (i+1) + "+";
            }
        }

        System.out.println(orderedString.substring(0, orderedString.length() - 1));
    }
}
