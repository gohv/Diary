package diary.diaryholder;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DiaryHolder {

	ArrayList<String> thoughts = new ArrayList<>();
	private SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy");
	private String dateString;
	

	public void setDate(String date) {
		this.dateString = date;
		try {
			Date newdate = dateformat2.parse(dateString);
		} catch (ParseException e) {
			System.err.println("Invalid DATE!!!!!");
			System.err.println("Example: 01-01-2016");
			
			
		}

	}

	public DiaryHolder(String date,String entry) {
		this.dateString = date;
		setDate(date);
		thoughts.add(entry);
	}
	
	@Override
	public String toString() {
		
		return dateString + " , "  + thoughts.toString();
		
		
	} 

}
