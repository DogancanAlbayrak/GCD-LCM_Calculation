import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Asking the user to enter the value of n1
        System.out.print("n1 değerini giriniz: ");
        int n1 = input.nextInt();

        // Asking the user to enter the value of n2
        System.out.print("n2 değerini giriniz: ");
        int n2 = input.nextInt();

        // Variable to store the greatest common divisor (GCD)
        int gcd = 1;

        // Variable to store the least common multiple (LCM)
        int lcm = 1;

        // Finding the greatest common divisor
        int k = n1;
        while (k >= 1) {
            // Checking if both n1 and n2 are divisible by k
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;// Updating the GCD
                System.out.println("EBOB: " + gcd);
                break;// Exiting the loop once GCD is found
            }
            k--; // Decrementing k to check the next divisor
        }

        // Finding the least common multiple
        int i = 1;
        boolean foundLcm = false;
        while (!foundLcm) {

            // Checking if i is divisible by both n1 and n2
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;// Updating the LCM
                System.out.println("EKOK: " + lcm);
                foundLcm = true;// Setting foundLcm to true to exit the loop
            }
            i++;// Incrementing i to check the next multiple
        }
    }
}
