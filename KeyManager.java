import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;

public class KeyManager {
    private static final String KEY_FILE = "secret.key";

    // Generates and saves a new AES key
    public static void generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // AES-128 encryption
        SecretKey key = keyGen.generateKey();
        saveKeyToFile(key);
        System.out.println("Encryption Key generated and saved as 'secret.key'");
    }

    // Loads an existing AES key from file
    public static SecretKey loadKey() throws Exception {
        File keyFile = new File(KEY_FILE);
        if (!keyFile.exists()) {
            throw new Exception("Key file not found! Generate a key first.");
        }
        byte[] keyBytes = Files.readAllBytes(keyFile.toPath());
        return new javax.crypto.spec.SecretKeySpec(keyBytes, "AES");
    }

    // Saves the AES key to a file
    private static void saveKeyToFile(SecretKey key) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(KEY_FILE)) {
            fos.write(key.getEncoded());
        }
    }
}
