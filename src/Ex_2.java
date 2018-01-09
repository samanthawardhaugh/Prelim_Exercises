import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer num = Integer.valueOf(input.trim());
        Integer i;
        for (i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
