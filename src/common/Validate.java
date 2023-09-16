package common;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Validate {

    final static Scanner sc = new Scanner(System.in);
    final static String binValid = "[01]+";
    final static String decValid = "[0-9]+";
    final static String hexValid = "[A-F0-9]+";

    public String inputBin() {
        System.out.println("Enter your binary number: ");
        String result;
        while (true) {
            result = sc.nextLine();
            if (result.matches(binValid)) {
                return result;
            } else {
                System.err.println("Using only 0 1");
                System.out.print("Enter again: ");
            }
        }
    }

    public String inputDec() {
        System.out.println("Enter your decimal number: ");
        String result;
        while (true) {
            result = sc.nextLine();
            if (result.matches(decValid)) {
                return result;
            } else {
                System.err.println("Using 0 - 9");
                System.out.println("Enter again: ");
            }
        }
    }

    public String inputHex() {
        System.out.println("Enter your hexademical number: ");
        String result;
        while (true) {
            result = sc.nextLine();
            if (result.matches(hexValid)) {
                return result;
            } else {
                System.err.println("Using 0 - 9 and A - F");
                System.out.println("Enter again: ");
            }
        }
    }
}
