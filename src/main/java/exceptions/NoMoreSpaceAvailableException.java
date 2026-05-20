package exceptions;

public class NoMoreSpaceAvailableException extends RuntimeException{
    public NoMoreSpaceAvailableException(String message){
        super(message);
    }
}
