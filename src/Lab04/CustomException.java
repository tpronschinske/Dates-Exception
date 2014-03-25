/*
 * Create Class That Extends Exception (CustomException)
 */

package Lab04;

/**
 *
 * @author Travis
 */
public class CustomException extends Exception {
    
    
    public CustomException()
    {        
    }
    
    public CustomException(String exceptionMessage){
        super(exceptionMessage);
    }
    
    
    
}
