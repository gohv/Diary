package fileserver;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import diary.diaryholder.*;

public class FileService {

	public static void add(DiaryHolder diary) {

		// TRY WITH RESOURCES IS HERE!!!!!
		try (BufferedWriter out = new BufferedWriter(new FileWriter("file/Diary.csv", true))) {
			out.write(diary.getDateString() + "," + diary.getThoughts().replace('\n', ' '));
			System.getProperty("line.separator");
			out.write("\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
