package passwordstuff;

/**
 02:  * This demonstrates password-based encryption (PBE) using the
 03:  * DES algorithm.  As mentioned before, DES is not very secure,
 04:  * but the SDK version used for this example does not support
 05:  * other (stronger) PBE algorithms
 06:  *
 07:  * The text file "clear.txt" will be read, encrypted and written back
 08:  * as "clear.txt.des".
 09:  *
 10:  * I've done all the "hardcoding" of the file names and password for
 11:  * simplicity of discussion.
 12:  *
 13:  */

import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;

public class FileEncryptor {
	private static String filename;
	private static String password;
	private static FileInputStream inFile;
	private static FileOutputStream outFile;

	/**
	 * 29: * Note: As with the pervious example, all kinds of exceptions 30: *
	 * can be thrown in main. See the API documentation for each 31: * method
	 * used. 32:
	 */
	public static void main(String[] args) throws Exception {

		// File to encrypt. It does not have to be a text file!

		filename = "clear.txt";

		// Password must be at least 8 characters (bytes) long

		String password = "super_secret";

		inFile = new FileInputStream(filename);
		outFile = new FileOutputStream(filename + ".des");

		// Use PBEKeySpec to create a key based on a password.
		// The password is passed as a character array

		PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray());
		SecretKeyFactory keyFactory = SecretKeyFactory
				.getInstance("PBEWithMD5AndDES");
		SecretKey passwordKey = keyFactory.generateSecret(keySpec);

		// PBE = hashing + symmetric encryption. A 64 bit random
		// number (the salt) is added to the password and hashed
		// using a Message Digest Algorithm (MD5 in this example.).
		// The number of times the password is hashed is determined
		// by the interation count. Adding a random number and
		// hashing multiple times enlarges the key space.

		byte[] salt = new byte[8];
		Random rnd = new Random();
		rnd.nextBytes(salt);
		int iterations = 100;

		// Create the parameter spec for this salt and interation count

		PBEParameterSpec parameterSpec = new PBEParameterSpec(salt, iterations);
		// Create the cipher and initialize it for encryption.

		Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
		cipher.init(Cipher.ENCRYPT_MODE, passwordKey, parameterSpec);

		// Need to write the salt to the (encrypted) file. The
		// salt is needed when reconstructing the key for decryption.

		outFile.write(salt);

		// Read the file and encrypt its bytes.

		byte[] input = new byte[64];
		int bytesRead;
		while ((bytesRead = inFile.read(input)) != -1) {
			byte[] output = cipher.update(input, 0, bytesRead);
			if (output != null)
				outFile.write(output);
		}

		byte[] output = cipher.doFinal();
		if (output != null)
			outFile.write(output);

		inFile.close();
		outFile.flush();
		outFile.close();

	}
}