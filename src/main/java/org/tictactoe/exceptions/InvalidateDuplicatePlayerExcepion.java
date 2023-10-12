package org.tictactoe.exceptions;

public class InvalidateDuplicatePlayerExcepion extends RuntimeException{
    public InvalidateDuplicatePlayerExcepion() {
    }

    public InvalidateDuplicatePlayerExcepion(String message) {
        super(message);
    }

    public InvalidateDuplicatePlayerExcepion(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidateDuplicatePlayerExcepion(Throwable cause) {
        super(cause);
    }

    public InvalidateDuplicatePlayerExcepion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
