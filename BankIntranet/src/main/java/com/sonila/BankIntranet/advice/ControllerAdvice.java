package com.sonila.BankIntranet.advice;
import com.sonila.BankIntranet.exceptions.AlreadyExistsException;
import com.sonila.BankIntranet.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;


    @RestControllerAdvice
    public class ControllerAdvice {

        @ExceptionHandler(NotFoundException.class)
        public ResponseEntity<ErrorFormat> handleNotFoundException(NotFoundException notFoundException){
            ErrorFormat errorFormat = new ErrorFormat(
                    notFoundException.getMessage(),
                    LocalDateTime.now()
            );
            return new ResponseEntity<>(errorFormat, HttpStatus.NOT_FOUND);
        }

        @ExceptionHandler(AlreadyExistsException.class)
        public ResponseEntity<ErrorFormat> handleAlreadyExistsException(AlreadyExistsException alreadyExistsException){
            ErrorFormat errorFormat = new ErrorFormat(
                    alreadyExistsException.getMessage(),
                    LocalDateTime.now()
            );
            return new ResponseEntity<>(errorFormat, HttpStatus.BAD_REQUEST);
        }
}
