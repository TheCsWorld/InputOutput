package inout;
import java.io.*;

public class CopyExample {
	public static void main(String[] args) {
		
//		FileReader file = new FileReader("file1.txt");
//		BufferedReader inputStream = new BufferedReader(file);
		BufferedReader inputStream;
		BufferedWriter outputStream;
		try {
			inputStream = new BufferedReader(new FileReader("fileFolder/file5"));
			outputStream = new BufferedWriter(new FileWriter("fileFolder/file2"));
			PrintStream printStream = new PrintStream("fileFolder/file4");
			
			String line;
			while ( (line = inputStream.readLine()) != null) {
				System.out.println(line);
				outputStream.write(line + "\n");
				printStream.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Could not find file");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("IO Excpetion occured!");
		}
	}
	
}
