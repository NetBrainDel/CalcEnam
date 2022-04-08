package com.company;

public class Exceptions extends Throwable{

    public Exceptions(String massage){
        super("НА 0 НЕ ДЕЛЯТ!!!!");
        System.out.println(massage);

    }
}
