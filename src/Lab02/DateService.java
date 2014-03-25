/*
 * this class should have the ability to convert a date string to calendar and date
 *
 */

package Lab02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

/**
 *
 * @author Travis
 */
public class DateService {
    
    
    public final void convertStringToCalendar(String formattedDateString){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy h:mm a");
        try{
            Date date = calendar.getTime();
            calendar.setTime(dateFormat.parse(formattedDateString));
            System.out.println(dateFormat.format(date));
        } catch (ParseException parseException){
            System.out.println("Format Not Accepted: Must Be In This Format (Month/day/year time (am or pm) EX: 12/10/1987 12:00 PM");
            
        }
        
        
    }
    
    public final void convertStringToDate(String formattedDateString){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = dateFormat.parse(formattedDateString);
            System.out.println(dateFormat.format(date));
        } catch (ParseException parseException) {
            System.out.println("Format Not Accepted: Must Be Month/Day/Year (12/10/1987)");
        }
                
        
    }
    
}
