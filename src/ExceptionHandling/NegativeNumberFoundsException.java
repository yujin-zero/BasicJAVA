package ExceptionHandling;

public class NegativeNumberFoundsException extends Exception{
    private static final long serialVersionID = 1L;
    public NegativeNumberFoundsException(String message) {
        super(message);
    }
}
