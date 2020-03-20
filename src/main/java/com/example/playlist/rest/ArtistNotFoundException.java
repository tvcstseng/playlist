package com.example.playlist.rest;

public class ArtistNotFoundException extends RuntimeException {

    public ArtistNotFoundException() {
        super();
    }

    public ArtistNotFoundException(String message) {
        super(message);
    }

    public ArtistNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArtistNotFoundException(Throwable cause) {
        super(cause);
    }

    protected ArtistNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
