package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Trying {
	public static void main(String [] args)
	{
		try {
			File F1 = new File("D:TrialFile.txt");
			if(F1.createNewFile()) {
				System.out.println("The file  "+F1+"  Created sucessfully");
			}else { System.out.println("The file already there in there dictionary");}}
			catch(IOException exception){
				System.out.println("Unexpected error occured");
				exception.printStackTrace();}
	int ch;
	try {
		FileWriter f = new FileWriter("D:AnotherTrial.txt");
		f.write("The file is made here");
		f.close();
		FileReader fr = new FileReader("D:AnotherTrial.txt");
		
		}catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
	
	
}}}
