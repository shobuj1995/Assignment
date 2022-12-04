package com.java.oop;

public class OOP {
    public static void main(String[] args) {
        System.out.println("This is a main class");
        
    }
}

class  subclass extends OOP{
    subclass(){
        System.out.println("This is a default constructor");
    }
    OOP object = new subclass();
}