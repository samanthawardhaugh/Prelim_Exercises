import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer num = Integer.valueOf(input.trim());
        Integer i;
        String pad = " ";
        String dot = "*";
        for (i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(pad);
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(dot);
            }
            System.out.println();
        }

        for (i = num - 1; i > 0 ; i--){
            for (int j = 0; j < num - i; j++) {
                System.out.print(pad);
            }
            for (int k = 0; k < 2*i - 1; k++) {
                System.out.print(dot);
            }
            System.out.println();
        }
    }
}
