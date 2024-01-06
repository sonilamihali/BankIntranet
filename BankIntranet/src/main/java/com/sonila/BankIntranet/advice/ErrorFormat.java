package com.sonila.BankIntranet.advice;

import java.time.LocalDateTime;

//@RestControllerAdvice
public class ErrorFormat {

//    @org.springframework.web.bind.annotation.ErrorFormat(RuntimeException.class)
//    public ResponseEntity<String> handleRuntimeExceptoin(RuntimeException runtimeException){
//        return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
//    }

    private String message;
    private LocalDateTime timestamp;

    public ErrorFormat() {
    }

    public ErrorFormat(String message, LocalDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
