import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/427/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int untreatedCrimeCount = 0;
        int policeOfficerCount = 0;

        while (n != 0){
            byte event = scanner.nextByte();
            if(event == -1){
                if (policeOfficerCount != 0)
                    policeOfficerCount--;
                else
                    untreatedCrimeCount++;
            }else {
                policeOfficerCount += event;
            }
            n--;
        }
        System.out.println(untreatedCrimeCount);
    }
}
