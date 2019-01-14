package com.example.springbootdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Hanumantharao Bitragunta
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ChannelNotFoundException extends RuntimeException {
    public ChannelNotFoundException(String exception){
        super(exception);
    }
}
