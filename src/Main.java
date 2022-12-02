import java.util.Scanner;

//https://codeforces.com/problemset/problem/236/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] chars = new boolean[27];
        byte distinctCharsCount = 0;

        char[] string = scanner.nextLine().toCharArray();
        for (char c : string) {
            byte charPosition = (byte) (c - 'a');
            if(!chars[charPosition]){
                distinctCharsCount++;
                chars[charPosition] = true;
            }
        }
        if(distinctCharsCount %2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
