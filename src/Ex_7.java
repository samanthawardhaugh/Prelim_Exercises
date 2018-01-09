public class Ex_7 {
    public static void main(String[] args) {
        int start = 0;
        int finish = 100;

        while (start < finish) {
            start++;
            if (start % 3 == 0 && start % 5 != 0) {
                System.out.println("Fizz");
            } else if (start % 5 == 0 && start % 3 != 0) {
                System.out.println("Buzz");
            } else if (start % 5 == 0 && start % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(start);
            }
        }
    }
}
