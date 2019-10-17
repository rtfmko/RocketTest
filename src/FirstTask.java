import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FirstTask {

	/**
	 *Write a program to find all distinct words from a text file. Ignore chars like ".,/-;:" and
	 Ignore case sensitivity.
	 */

	private static int count;

	public static void main(String[] args) {
		try {
			readFile( "InputWordList.txt");  //Change file name
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void readFile(String fileName) throws FileNotFoundException {
		File inputFile = new File(fileName);
		if (inputFile.exists()){
			Scanner in = new Scanner(inputFile);
			while (in.hasNext()){
				System.out.println(distinctWords(in.nextLine()));
			}
			in.close();
			System.out.println("\nWords count - " + count);
		} else {
			System.err.println("Incorrect file");
		}
	}

	private static ArrayList distinctWords(String inputArray){
		ArrayList<String> wordList = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(inputArray, " .,/-;:");
		while (st.hasMoreTokens()){
			String tmp = st.nextToken().toLowerCase();
			wordList.add(tmp);
		}
		count = count + wordList.size();
		return wordList;
	}
}
