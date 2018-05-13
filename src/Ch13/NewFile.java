//Attempt to create new file in Drive C:
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch13;
import java.io.*;
public class NewFile {

	public static void main(String[] args) {
		boolean newFile = false;
		File file = new File("Test1.txt");
		System.out.println(file.exists());
		
		try {
			newFile = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(newFile);
		System.out.println(file.exists());
	}
}
