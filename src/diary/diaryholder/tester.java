package diary.diaryholder;
import fileserver.*;
import java.text.ParseException;

public class tester {

	public static void main(String[] args) throws ParseException {
	DiaryHolder diary = new DiaryHolder("02-05-2015", "imashe 30 calla");
	DiaryHolder diary1 = new DiaryHolder("02-02-2015", "test");
	
	
	FileService.add(diary);
	
	FileService.add(diary1);
	
	}

}
