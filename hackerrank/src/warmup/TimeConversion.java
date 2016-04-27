package warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	static void timeConversion(String timeInput){
		 //String timeInput = "10:22:12 PM";		
		 DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		 DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
		 Date date = null;
		 String output = null;
		 try{   
		 //Converting the input String to Date
	    	 date= df.parse(timeInput);
	         //Changing the format of date and storing it in String
	    	 output = outputformat.format(date);
	         //Displaying the date
	    	 System.out.println(output);
		 }catch(ParseException pe){
	         pe.printStackTrace();
	       }
		 
		//DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss a");
		//System.out.println(dateFormat.format(dateFormat));
		
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        timeConversion(time);
    }

}
