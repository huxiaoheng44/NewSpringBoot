package com.hxh.news;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundExcetion extends RuntimeException {

    public NotFoundExcetion(){

    }

    public NotFoundExcetion(String message){

    }

    public NotFoundExcetion(String message,)

}
