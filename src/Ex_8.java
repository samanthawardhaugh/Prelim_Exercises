import java.util.ArrayList;
import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer num = Integer.valueOf(input.trim());
        ArrayList<String> factors = new ArrayList<String>();
        while (num % 2 == 0) {
            num = num / 2;
            factors.add(Integer.toString(2));
        }

        for (int i = 3; i <= num; i = i + 2) {
            while (num % i == 0) {
                num = num/i;
                factors.add(Integer.toString(i));
            }
        }

        String answer = String.join(",", factors);
        System.out.println(answer);
    }
}
