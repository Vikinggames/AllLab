package Lab10;

public class LessThanZeroException extends RuntimeException  {
    public LessThanZeroException(){

    }
    public LessThanZeroException(String message) {
        super(message);
    }
}