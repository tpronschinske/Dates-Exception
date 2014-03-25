/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab01;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author tpronschinske
 */
public class Invoice {

    private Calendar invoiceDate;
    private int gracePeriod = 15;
    private Calendar dueDate;
    private Date date;
    private SimpleDateFormat simpledateformat;
    
    public Invoice() {
        date = new Date();
        invoiceDate = Calendar.getInstance(); 
    }


    public String getFormattedDateForInvoice(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm ");
        return dateFormat.format(getInvoiceDate().getTime());
    }
    
    
    
    public Calendar getNewDueDate(){
        dueDate = invoiceDate;
        dueDate.add(Calendar.DATE, gracePeriod);
        return dueDate;
    }
    
    
    public String getDueDateToString(){
        simpledateformat = new SimpleDateFormat("MM/dd/yy");
        dueDate = invoiceDate;
        dueDate.add(Calendar.DATE, gracePeriod);
        date.getTime();
        return simpledateformat.format(getDate());
    }
    
    
    public final Calendar getInvoiceDate() { 
        return invoiceDate; 
    }

    public final void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SimpleDateFormat getSimpledateformat() {
        return simpledateformat;
    }

    public void setSimpledateformat(SimpleDateFormat simpledateformat) {
        this.simpledateformat = simpledateformat;
    }
    
    
    
}
