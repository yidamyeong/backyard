package encrypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import regex.Ascii;

import java.util.Scanner;

public class StringEncryptHelper {

    public StandardPBEStringEncryptor encryptor;
    public String line = "----------------------------------";

    public StringEncryptHelper(String password) {
        encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(password);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ascii ascii = new Ascii();

        int index = 0;
        while (index == 0) {
            System.out.print("SET PASSWORD >> ");
            String password = in.nextLine();
            if (!ascii.isAsciiPattern(password)) {
                System.out.println("::: RESET ASCII PASSWORD!");
                continue;
            }

            StringEncryptHelper helper = new StringEncryptHelper(password);
            index = 1;
            while (index == 1) {
                String choice = helper.selectNumber(in);
                index = helper.showResult(in, choice);
            }
        }

        in.close();
    }

    public int showResult(Scanner in, String choice) {
        String message;
        String result;

        switch (choice) {
            case "1":  // ENC
                message = getMessage(in, "ENCRYPT");
                result = encryptor.encrypt(message);
                break;
            case "2":  // DEC
                message = getMessage(in, "DECRYPT");
                result = decrypt(message);
                break;
            case "3":  // RESET PW
                System.out.println(line);
                return 0;
            case "4":  // EXIT
                System.out.println("\n::: CLOSED");
                return -1;
            default:
                System.out.println("::: INVALID INPUT");
                return 1;
        }

        System.out.println(line);
        System.out.println(result);
        return 1;
    }

    public String decrypt(String message) {
        if (message.startsWith("ENC(") && message.endsWith(")")) {
            message = message.substring(4, message.length() - 1);
        }

        String decrypted = "::: TRY AGAIN!";
        try {
            decrypted = encryptor.decrypt(message);
        } catch (EncryptionOperationNotPossibleException e) {
            e.printStackTrace();
        }

        return decrypted;
    }

    public String getMessage(Scanner in, String type) {
        System.out.println(line);
        System.out.printf("MESSAGE YOU WANT TO %s >> ", type);
        return in.nextLine();
    }

    public String selectNumber(Scanner in) {
        System.out.println(line);
        System.out.println("1. ENCRYPT");
        System.out.println("2. DECRYPT");
        System.out.println("3. CHANGE PASSWORD");
        System.out.println("4. EXIT");
        System.out.print("SELECT NUMBER (1/2/3/4) >> ");
        return in.nextLine();
    }

}