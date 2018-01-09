import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer num = Integer.valueOf(input.trim());
        Integer i;
        String dotadd = "**";
        String dot = "*";
        for (i = 0; i < num; i++) {
            System.out.println(dot);
            dot = dot + dotadd;
        }
    }
}
