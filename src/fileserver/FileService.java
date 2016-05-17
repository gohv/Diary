package fileserver;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import diary.diaryholder.*;

public class FileService {
	
	public static void add(DiaryHolder diary){
	//TRY WITH RESOURCES IS HERE!!!!!
		try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("file/Diary.csv", true)))){
			
				writer.write(diary.toString());
				writer.write("\n");
			
		}catch (IOException e) {
		System.err.print("Missing File!");
		e.printStackTrace();
		}			
	}
	
	public static DiaryHolder[] load(){
		DiaryHolder[] word = new DiaryHolder[0];
		
		try (FileInputStream fis = new FileInputStream("file/Diary.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);){
			word = (DiaryHolder[]) ois.readObject();
			
		} catch (Exception e) {
			System.err.print("No file");
			e.printStackTrace();
		}
		return word;
	}	
	

}
