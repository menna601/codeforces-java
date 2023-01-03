import java.util.InputMismatchException;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/294/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte noOfWires = scanner.nextByte();
        short[] birdsByWire = new short[noOfWires + 2];

        for (byte i = 1; i <= noOfWires; i++)
            birdsByWire[i] = scanner.nextShort();

        byte noOfShots = scanner.nextByte();

        for (byte i = 0; i < noOfShots; i++) {
            byte wire = scanner.nextByte();
            short birdNum = scanner.nextShort();
            birdsByWire[wire - 1] += birdNum - 1;
            birdsByWire[wire + 1] += birdsByWire[wire] - birdNum;
            birdsByWire[wire] = 0;
        }

        for (byte i = 1; i <= noOfWires; i++)
            System.out.println(birdsByWire[i]);

    }
}
