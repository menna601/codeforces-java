import java.util.InputMismatchException;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/799/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short cakesNeededCount = scanner.nextShort();
        short timeNeeded = scanner.nextShort();
        short bakedCakesSameTimeCount = scanner.nextShort();
        short o2BuildTime = scanner.nextShort();

        short o1Time = (short) (Math.ceil((double) cakesNeededCount/bakedCakesSameTimeCount) * timeNeeded);
        if((o2BuildTime + timeNeeded) >= o1Time)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
