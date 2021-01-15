import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String str = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter non-duplicate numbers between 1 and 7");
            List<Integer> source = new ArrayList<>();
            List<Integer> target = new ArrayList<>();

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
                if (source.get(i) == 1) {
                    total++;
                    target.add(source.get(i));
                } else if (source.get(i) != 1 && source.size() == 0) {
                    target.add(source.get(i));
                } else {
                    int count = 0;
                    int sourceItem = source.get(i) - 1;
                    for (int j = 0; j < target.size(); j++) {
                        for (int k = 1; k <= sourceItem; k++) {
                            if (k == target.get(j))
                                count++;
                        }
                    }
                    if (source.get(i) - 1 == count) {
                        total++;
                    }
                    target.add(source.get(i));
                }
            }
            System.out.println("Total: " + total);

            System.out.println("Do you want to continue y or n");
            str = scanner.nextLine();
        } while (str.equalsIgnoreCase("Y"));
    }
}
