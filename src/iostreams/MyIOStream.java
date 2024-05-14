package iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyIOStream {

	public static void main(String[] args) throws IOException {
		File myFile = new File("file.txt");
		myFile.createNewFile();

		FileWriter fileWriter = new FileWriter(myFile);
		Scanner fileReader = new Scanner(myFile);

		fileWriter.write("Merhaba Dünya");
		fileWriter.write("\nBen Komutan Lazar");
		fileWriter.flush();
		fileWriter.close();
		while (fileReader.hasNext()) {
			System.out.println(fileReader.next());
		}
		fileReader.close();
		
		bufferedWriterAndReader();


	}

	private static void bufferedWriterAndReader() throws IOException {
		File mySecondFile = new File("buffer.txt");
		
		FileWriter buffer = new FileWriter(mySecondFile);
		BufferedWriter bufferedWriter = new BufferedWriter(buffer);
		
		bufferedWriter.write(28);
		bufferedWriter.newLine();
		bufferedWriter.append("Merhaba 28").append("\n Merhaba Dunya");
		bufferedWriter.flush();
		FileReader read = new FileReader(mySecondFile);
		BufferedReader bufferedReader = new BufferedReader(read);
		
		
		
		for (int i=0;i<12;i++) {
			System.out.println((char)bufferedReader.read());
		}
		System.out.println(bufferedReader.readLine());
		
		bufferedWriter.close();
		bufferedReader.close();
	}

}
