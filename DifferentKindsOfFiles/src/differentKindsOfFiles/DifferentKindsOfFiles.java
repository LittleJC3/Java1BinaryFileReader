/*
 * Open and read a binary file
 */
package differentKindsOfFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DifferentKindsOfFiles {

	public static void main(String[] args) {
		// In this example we will read a binary file
		try {
			FileInputStream fis = new FileInputStream("DifferentKindsOfFiles.class");
			// If we get this far, we have opened the file.
			int myByte;
			myByte = fis.read(); // Read a single byte from the file
			while (myByte != -1) {
				// System.out.println(myByte);
				// How can I convert the integer value of the byte to a printable character?
				char c;
				c = (char) myByte; // Perform a type cast from integer to character
				System.out.print(c);
				myByte = fis.read();
			}
			System.out.println(myByte);
			fis.close();
		} catch (FileNotFoundException e) {

		} catch (IOException ex) {

		}

	}

}
