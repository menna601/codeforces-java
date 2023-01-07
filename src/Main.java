import java.util.*;

//https://codeforces.com/problemset/problem/490/A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Short> programmers = new ArrayList<>();
        List<Short> mathematicians = new ArrayList<>();
        List<Short> sportsmen = new ArrayList<>();
        short children = scanner.nextShort();

        for (short i = 1; i <= children; i++)
            switch (scanner.nextByte()) {
                case 1:
                    programmers.add(i);
                    break;
                case 2:
                    mathematicians.add(i);
                    break;
                case 3:
                    sportsmen.add(i);
                    break;
            }
        short pmMin = (short) Math.min(programmers.size(), mathematicians.size());
        short maxTeamCount = (short) Math.min(pmMin, sportsmen.size());

        System.out.println(maxTeamCount);

        for (short i = 0; i < maxTeamCount; i++) {
            System.out.print(programmers.get(i) + " ");
            System.out.print(mathematicians.get(i) + " ");
            System.out.println(sportsmen.get(i));
        }
    }
}
