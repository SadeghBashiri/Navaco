import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApp2 {

    static List<Integer> source = new ArrayList<>();
    static List<Integer> target = new ArrayList<>();

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter non-duplicate numbers between 1 and 7");

            for (; source.size() < 7; ) {
                Boolean flag = false;
                do {
                    try {
                        System.out.println("Enter number " + (source.size() + 1));
                        Integer integer = scanner.nextInt();
                        if (integer > 0 && integer < 8) {
                            source.add(integer);
                            flag = false;
                        } else {
                            System.out.println("Please enter non-duplicate numbers between 1 and 7");
                            flag = true;
                        }
                    } catch (InputMismatchException exception) {
                        System.err.println("Please Enter Number ");
                        flag = true;
                    }
                    scanner.nextLine();
                } while (flag);
            }
            int total = 0;
            for (int i = 0; i < source.size(); i++) {
                switch (source.get(i)) {
                    case 1:
                        total++;
                        target.add(source.get(i));
                        break;
                    case 2:
                        if (calc(2) == 1) {
                            total++;
                            target.add(source.get(i));
                        } else target.add(source.get(i));
                        break;
                    case 3:
                        if (calc(3) == 3) {
                            total++;
                            target.add(source.get(i));
                        } else target.add(source.get(i));
                        break;
                    case 4:
                        if (calc(4) == 6) {
                            total++;
                            target.add(source.get(i));
                        } else target.add(source.get(i));
                        break;
                    case 5 :
                        if (calc(5) == 10) {
                            total++;
                            target.add(source.get(i));
                        } else target.add(source.get(i));
                        break;
                    case 6:
                        if (calc(6) == 15) {
                            total++;
                            target.add(source.get(i));
                        } else target.add(source.get(i));
                        break;
                    case 7 :
                        if (calc(7) == 21) {
                            total++;
                            target.add(source.get(i));
                        } else target.add(source.get(i));
                }
            }
            System.out.println("Total: " + total);
    }

    public static int calc(int num) {
        int sum = 0;
        for (int i = 0; i < target.size(); i++) {
            for (int k = 1; k <= num - 1; k++) {
                if (k == target.get(i))
                    sum += target.get(i);
            }
        }
        return sum;
    }
}
