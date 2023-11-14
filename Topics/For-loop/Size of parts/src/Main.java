import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        int toBeShiped = 0;
        int toBeFixed = 0;
        int rejected = 0;

        for (int i = 0; i < input; i++) {
            int detectorPrint = scanner.nextInt();
            if (detectorPrint == 0) {
                toBeShiped++;
            } else if (detectorPrint == 1) {
                toBeFixed++;
            } else {
                rejected++;
            }
        }
        System.out.println(toBeShiped + " " + toBeFixed + " " + rejected);
    }
}