package ExceptionHandling;

public class NotSupportedException extends Exception{
    private static final long serialVersionUID = 1L;
    public NotSupportedException(String message) {
        super(message);
    }
}
