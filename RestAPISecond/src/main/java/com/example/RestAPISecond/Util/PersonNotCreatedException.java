package com.example.RestAPISecond.Util;


public class PersonNotCreatedException extends RuntimeException{
    public PersonNotCreatedException (String msg){
        super(msg);
    }
}
