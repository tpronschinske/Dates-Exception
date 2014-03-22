/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab01;



public class StartUp {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //
        
//        Date date = new Date();
//        Calendar c = Calendar.getInstance();
//        date = c.getTime();
//        System.out.println(date);
        
       Invoice i = new Invoice();
       
        System.out.println(i.getInvoiceDate().getTime());
        System.out.println(i.getChangedDueDate().getTime());
        System.out.println(i.getDueDateToString());


        
        
    }
    
}
