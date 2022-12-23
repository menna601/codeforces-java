import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/405/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte noOfCols = scanner.nextByte();
        byte[] noOfCubesPerCol = new byte[noOfCols];

        for (int i = 0; i < noOfCols; i++) {
            noOfCubesPerCol[i] = scanner.nextByte();
        }

        byte[] sortedArray = sortByCounting(noOfCubesPerCol);

        System.out.println(convertArrToString(sortedArray));
    }

    public static byte[] sortByCounting(byte[] arr){
        byte max = findMax(arr);

        byte[] count = new byte[max + 1];
        for (byte num : arr)
            count[num]++;

        for (byte i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        byte[] sorted = new byte[arr.length];
        for (byte i = 0; i < arr.length; i++) {
            byte index = (byte)(count[arr[i]] - 1);
            sorted[index] = arr[i];
            count[arr[i]]--;
        }

        return sorted;
    }

    public static byte findMax(byte[] arr){
        byte max = 0;
        for (byte num : arr) {
            max = (byte) Math.max(max,num);
        }
        return max;
    }

    public static String convertArrToString(byte[] arr){
        return Arrays.toString(arr).replace(","," ")
                .replace("[","")
                .replace("]","");
    }
}
