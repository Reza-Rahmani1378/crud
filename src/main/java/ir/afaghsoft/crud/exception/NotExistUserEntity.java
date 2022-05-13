package ir.afaghsoft.crud.exception;

public class NotExistUserEntity extends RuntimeException {
    public NotExistUserEntity(String message) {
        super(message);
    }
}
