import java.util.Scanner;

//https://codeforces.com/problemset/problem/71/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte noOfWords = scanner.nextByte();
        for (byte i = 0; i < noOfWords; i++) {
            String word = scanner.next();
            int wordLength = word.length();
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(wordLength -1);
            if(wordLength > 10 )
                System.out.println("" + firstChar + (wordLength-2) + lastChar);
            else
                System.out.println(word);
        }
    }
}