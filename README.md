# File Encryption and Decryption Tool

## Overview
This is a simple **AES-based file encryption and decryption tool** written in **Core Java**.  
It allows users to:
- Generate an **AES-128 encryption key**
- Encrypt any file using **AES encryption**
- Decrypt the encrypted file back to its original form  

**No additional dependencies required!**  
**No frontend, no backend – just pure Java!**  

---

## ⚡ Features
✔️ AES-128 Encryption & Decryption  
✔️ Securely stores and loads the encryption key  
✔️ Works with **any file type** (TXT, PDF, JPG, etc.)  
✔️ CLI-based, easy to use  
✔️ Efficient file handling with **stream-based encryption**  

---

## USAGE GUIDE
**1️⃣ Compile the Java Files**
Before running the program, **compile all .java files:**
javac Main.java KeyManager.java FileEncryptor.java FileDecryptor.java

**2️⃣ Run the Program**
java Main

This will start the command-line interface (CLI) where you can choose different operations.

**📜 Using the CLI**
When you run the program, you'll see this menu:

======== File Encryption Tool ========
1. Generate Encryption Key
2. Encrypt a File
3. Decrypt a File
4. Exit
Enter your choice:
**🔹 1. Generate an Encryption Key**
If this is your first time using the tool, you need to generate a key.

Select option 1 from the menu.

The program will create a 128-bit AES key and save it in secret.key.

Encryption Key generated and saved as 'secret.key'
📌 Note: You only need to do this once unless you delete secret.key.

**🔹 2. Encrypt a File**
Choose option 2 from the menu.

Enter the path of the file you want to encrypt (e.g., input.txt).

Provide a name for the encrypted output file (e.g., encrypted.enc).

Example:
Enter file path to encrypt: input.txt
Enter output encrypted file name: encrypted.enc
Encryption successful! Encrypted file saved as encrypted.enc

📌 Note:

**The encrypted file is not readable and is stored in encrypted.enc.**

You must keep secret.key safe because you need it for decryption.

**🔹 3. Decrypt a File**
Choose option 3 from the menu.

Enter the path of the encrypted file (e.g., encrypted.enc).

Provide a name for the decrypted output file (e.g., decrypted.txt).

Example:
Enter file path to decrypt: encrypted.enc
Enter output decrypted file name: decrypted.txt
Decryption successful! Decrypted file saved as decrypted.txt

📌 Note:The decrypted file will restore the original content.

**If the secret.key file is missing or incorrect, decryption will fail.**

**🔹 4. Exit**
Choose option 4 to exit the program.
