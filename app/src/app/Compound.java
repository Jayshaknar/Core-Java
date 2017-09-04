package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compound {
	public static void main(String[] args) throws IOException {

		
		/*
		 * FileReader file1 = new FileReader("file1.text"); BufferedReader br1 =
		 * new BufferedReader(file1); System.out.println("Inter first file");
		 * String s=br1.readLine();
		 * 
		 * FileReader file2 = new FileReader("file2.text"); BufferedReader br2 =
		 * new BufferedReader(file2); String s1=br2.readLine();
		 */
		
		String s ="go one earth to some every quack";//we need to make meaningful word from given
	    String s1="earthquack someone everyone hate";//Dictionary file which has meaningful value

		// String to String array
		String[] s2 = s.split(" ");
	
		// Add each word to each other to
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				String ss = s2[i] + s2[j]; // join word for make meaningfull word
				// System.out.println(ss);

				String[] s3 = s1.split(" ");
				for (String st : s3) {
					// compare dictionary words from
					if (ss.equals(st)) {
						System.out.println(st);
					}

				}

			}

		}

	}

}
