package com.helloworldtechs.designPattern.creational.builder;

/**
 * Often in our applications we need to work with objects that contain lots class fields.
 * To instantiate such objects is very inconvenient using class constructor and is not thread safe
 * using the setters and getters approach.
 * The best way out will be to use Builder design pattern and in this blog post
 * I am going to share with you how to create a User object using the Builder design pattern approach.
 */
public class UserBuilderExample {

    public static void main(String[] args){

        User user = new User.Builder("Aslam","Islam")
                .city("Giza")
                .mobilePhone("01001842678")
                .build();
        System.out.println("User Object to String ::" + user);

    }


}
