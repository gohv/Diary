package diary.diaryholder;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DiaryHolder {

	//ArrayList<String> thoughts = new ArrayList<>();


	public String getDateString() {
		return dateString;
	}


	public String getThoughts() {
		return thoughts;
	}


	private SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy");
	private String dateString;
	private String thoughts;
	

	

	public DiaryHolder(String date,String entry) {
		this.dateString=date;
		this.thoughts=entry;
		try {
			dateformat2.parse(dateString);
		} catch (ParseException e) {
			System.err.println("Invalid DATE!!!!!");
			System.err.println("Example: 01-01-2016");		
		}
	}
	
 
	@Override
	public String toString() {
		return dateString + ","+ thoughts+"";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateString == null) ? 0 : dateString.hashCode());
		result = prime * result + ((thoughts == null) ? 0 : thoughts.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiaryHolder other = (DiaryHolder) obj;
		if (dateString == null) {
			if (other.dateString != null)
				return false;
		} else if (!dateString.equals(other.dateString))
			return false;
		if (thoughts == null) {
			if (other.thoughts != null)
				return false;
		} else if (!thoughts.equals(other.thoughts))
			return false;
		return true;
	}

}
