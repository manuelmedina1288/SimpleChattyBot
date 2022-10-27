import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;

        for (int i = 1; i <=  n; i++) {

            String grade = scanner.next();

            if ("A".equals(grade)) {
                aCounter++;
            } else if ("B".equals(grade)) {
                bCounter++;
            } else if ("C".equals(grade)) {
                cCounter++;
            } else {
                dCounter++;
            }
        }

        System.out.println(dCounter + " " + cCounter + " " + bCounter + " " + aCounter);

    }
}
