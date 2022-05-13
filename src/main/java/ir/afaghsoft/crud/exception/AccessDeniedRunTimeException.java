package ir.afaghsoft.crud.exception;

public class AccessDeniedRunTimeException extends RuntimeException {
    public AccessDeniedRunTimeException(String message) {
        super(message);
    }
}
