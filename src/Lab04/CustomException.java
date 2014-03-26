/*
 * Create Class That Extends Exception (CustomException)
 */

package Lab04;

/**
 *
 * @author Travis
 */
public class CustomException extends IllegalArgumentException {
    
    
    public CustomException()
    {        
    }
    
    public CustomException(String exceptionMessage){
        super(exceptionMessage);
    }
    
    public CustomException(String exceptionMessage, Throwable cause){
        super(exceptionMessage, cause);
    }
    
    public CustomException(Throwable cause){
        super(cause);
    }
    
}
