package com.kozich.arraytask.exception;

public class FileException extends Exception{
    public FileException(Throwable cause) {
        super(cause);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileException(String message) {
        super(message);
    }

    public FileException() {
    }
}
