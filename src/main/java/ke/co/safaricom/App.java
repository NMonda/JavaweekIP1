package ke.co.safaricom;

import java.util.Scanner;

import static ke.co.safaricom.Decoding.decrypt;
import static ke.co.safaricom.Encoding.encrypt;

public class App {

    public App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Choose either to encode(e) or (d) to decode:");
        String process =sc.nextLine();

        System.out.println("Enter Your Message:");
        String message = sc.nextLine();

        System.out.println("Enter shift Value: (From 0 - 25);");
        int shift= Integer.parseInt(sc.nextLine());
       String encryptedMessage = encrypt(message, shift);
       String decryptedMessage = decrypt(encryptedMessage, shift);
        if (process.startsWith("e")){
            System.out.println("Encrypted message: " + encryptedMessage);
        }
        else if (process.startsWith("d")) {
            System.out.println("Decrypted message: " + decryptedMessage);
        }
        else {
                System.out.println("Invalid input");
                continue; // Prompt the user to start afresh
        }
            System.out.println("Do you wish to quit or continue?");
            String nextStep = sc.nextLine();

            if (nextStep.startsWith("q"))
                break; // Exit the loop and terminate the program

            }
        }
    }



