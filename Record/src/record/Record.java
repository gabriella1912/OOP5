package record;

public class Record {

	String artistName;
	String NameOfRecord;
	int lenght;
	
	public Record(String artistName, String nameOfRecord, int lenght) {
		super();
		this.artistName = artistName;
		NameOfRecord = nameOfRecord;
		this.lenght = lenght;
	}

	@Override
	public String toString() {
		return   artistName + ":" + NameOfRecord + ", lenght=" + lenght + " minutes";
	}
	
	public int isLongerThan(Record record) {
		if (this.getLenght()==record.getLenght()) {
			return 0;
		}
		else if(this.getLenght()>record.getLenght())
		{
			return 1;
		}
		else return -1;
	}

	public String getArtistName() {
		return artistName;
	}


	public String getNameOfRecord() {
		return NameOfRecord;
	}


	public int getLenght() {
		return lenght;
	}

	
	public boolean isFrom(String artist)
	{
		if (this.getArtistName().equals(artist)) {
			return true;
		} else return false;
	}
	
}
