import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sequenceLong = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < sequenceLong; i++) {
            int input = scanner.nextInt();
            if (input % 6 == 0) {
                sum += input;
            }
        }
        System.out.println(sum);
    }
}
