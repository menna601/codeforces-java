import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/344/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int groupCount = 0;
        byte currentMagnet;
        byte previousMagnet = 0;

        while (n != 0){
            currentMagnet = scanner.nextByte();
            if(previousMagnet != currentMagnet)
                groupCount++;
            previousMagnet = currentMagnet;
            n--;
        }
        System.out.println(groupCount);
    }
}
