package dev.lukmann.exception;

public class ValidationException extends Throwable {
    private ValidationCode code;

    public ValidationException(ValidationCode code, String message) {
        super(message);
        this.code = code;
    }

    public ValidationCode getCode() {
        return code;
    }
}
