/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab02;

/**
 *
 * @author tpronschinske
 */
public class StartUp {
   
    public static void main(String[] args) {
        
        
        String date;
        
        DateService dateService = new DateService();
        date = "12/22/2014";
        dateService.convertStringToDate(date);
        
        
        // having issues with the convertStringToCalendar
        // Format is now correct but still cant get the date i have to be outputed only does the current date and time stamp
        
        
        date = "Dec 31, 2014 12:00 AM";
        dateService.convertStringToCalendar(date);
    
 
        
        
    }
 
}
