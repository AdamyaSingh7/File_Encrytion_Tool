import javax.crypto.SecretKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("\n======== File Encryption Tool ========");
                System.out.println("1. Generate Encryption Key");
                System.out.println("2. Encrypt a File");
                System.out.println("3. Decrypt a File");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        KeyManager.generateKey();
                        break;
                    case 2:
                        System.out.print("Enter file path to encrypt: ");
                        String inputFile = scanner.nextLine();
                        System.out.print("Enter output encrypted file name: ");
                        String encryptedFile = scanner.nextLine();
                        SecretKey key = KeyManager.loadKey();
                        FileEncryptor.encryptFile(inputFile, encryptedFile, key);
                        break;
                    case 3:
                        System.out.print("Enter file path to decrypt: ");
                        String encFile = scanner.nextLine();
                        System.out.print("Enter output decrypted file name: ");
                        String decFile = scanner.nextLine();
                        SecretKey secretKey = KeyManager.loadKey();
                        FileDecryptor.decryptFile(encFile, decFile, secretKey);
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
