package org.example.exceptions;

public class InvalidateNoOfPlayersException extends  RuntimeException{
    public InvalidateNoOfPlayersException() {
    }

    public InvalidateNoOfPlayersException(String message) {
        super(message);
    }

    public InvalidateNoOfPlayersException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidateNoOfPlayersException(Throwable cause) {
        super(cause);
    }

    public InvalidateNoOfPlayersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
