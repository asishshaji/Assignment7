package Q7;

public class InvalidFeeException extends Exception {
    public InvalidFeeException(String invalid_fees) {
        super(invalid_fees);
    }
}
