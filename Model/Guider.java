package Model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class Guider {
	private String guiderid;
	private String Email;
	private String PhoneNo;
	private String LanguageSpoken;
	private GuiderType guidertypeid; // forignkey
	private String Availability;
	private LinkedList<Guider> guiders = new LinkedList<>();

	// Constracor
	public Guider(String guiderid, String Email, String PhoneNo, String LanguageSpoken, GuiderType guidertypeid,
			String Availability) {
		setguiderid(guiderid);
		setEmail(Email);
		setPhoneNo(PhoneNo);
		setLanguageSpoken(LanguageSpoken);
		setguidertypeid(guidertypeid);
		setAvailability(Availability);
	}

	// method getter and setter
	public void setguiderid(String guiderid) {
		if (guiderid != null) {
			this.guiderid = guiderid;
		}
	}

	public String getguiderid() {
		return this.guiderid;
	}

	public void setEmail(String Email) {
		String regex = "^[A-Za-z0-9-_.]+@(.+)$";
		if (Email != null && Email.matches(regex)) {
			this.Email = Email;
		
		} 
	}

	public String getEmail() {
		return this.Email;
	}

	public void setPhoneNo(String PhoneNO) {
		String regex = "^[0-9]{10}$"; // contains only 10 digits.

		if (PhoneNO != null && PhoneNO.matches(regex)) {
			this.PhoneNo = PhoneNO;
			
		}

	}

	public String getPhoneNo() {
		return this.PhoneNo;
	}

	public void setLanguageSpoken(String LanguageSpoken) {
		if (LanguageSpoken != null) {
			this.LanguageSpoken = LanguageSpoken;
		}
	}

	public String getLanguageSpoken() {
		return this.LanguageSpoken;
	}

	public void setguidertypeid(GuiderType guidertypeid) {
		this.guidertypeid = guidertypeid;
	}

	public GuiderType getguidertypeid() {
		return this.guidertypeid;
	}

	public void setAvailability(String Availability) {
		this.Availability = Availability;
	}

	public String getAvailability() {
		return this.Availability;
	}

   // delete Guider
   public void deleteGuider(String guiderid) {
      for (Iterator<Guider> iterator = guiders.iterator(); iterator.hasNext();) {
          Guider guider = iterator.next();
          if (guider.getguiderid().equals(guiderid)) {
              iterator.remove();
              System.out.println("Gyider with ID: " + guiderid + " removed");
          }
 
      }
      System.out.println("Guider with ID: " + guiderid + " not found ");
  }

	// insert Guider
	public void insertGuider(Guider newguider){
		guiders.add(newguider);
		writetoFile();
	}

   //update 
   public void UpdateGuider(Guider updateguider){
	for(int i=0;i<guiders.size();i++){
	   Guider guider= guiders.get(i);
	   if(guider.getguiderid().equals(updateguider.getguiderid())){
		  guiders.set(i,updateguider);
		  writetoFile();;
	   }
	}
 }
	// method to return guider by id
	public Guider getGuiderById(String id) {
		readfromfile();
		for (Guider guider : guiders) {
			if (guider.getguiderid().equals(id)) {
				return guider;
			}
		}
		return null;
	}
	
	public void writetoFile() {

		try {
			BufferedWriter write = new BufferedWriter(
					new FileWriter("C:\\Users\\HC\\OneDrive\\Desktop\\code\\MyCodeLast\\files\\guider.txt", true));
			for (Guider guider : guiders) {
				write.write(guider.toString() + "\n");
			}
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readfromfile() {
		try {
			BufferedReader read = new BufferedReader(
					new FileReader("C:\\Users\\HC\\OneDrive\\Desktop\\code\\MyCodeLast\\files\\guider.txt"));
			String line;
			while ((line = read.readLine()) != null) {
				System.out.println(line);
			}
			read.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return "[\n{'guiderid' : " + this.guiderid + "\n'Email' : " + this.Email + "\n'PhoneNo' : " + this.PhoneNo
				+ "\n'LanguageSpoken' : " + this.LanguageSpoken +
				"" + this.guidertypeid + "\n'Availability' : " + this.Availability + "}\n]";

	}

}
