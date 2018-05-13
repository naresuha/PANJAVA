//Program to create Text Editor
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str[] = new String [100];
		
		System.out.println("Enter line of Text:");
		System.out.println("Enter STOP to quit");
		
			for (int i=0;i<100;i++){
				try {
					str[i] = br.readLine();
				} catch (IOException e) {
					if(str[i].equals("STOP"))
						break;
					e.printStackTrace();
				}
			
		System.out.println("\nHere is your file:");
		
			for (i=0;i<100;i++){
				if (str[i].equals("STOP"))
					break;
		System.out.println(str[i]);
			}
		}
	}
}