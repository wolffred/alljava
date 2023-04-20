package org.example;

public class ExampleException extends Exception{
    //checked exception

    //throw new example exception
    ExampleException(){
        super();
    }

    ExampleException(String message){
        super((message));
    }
}
