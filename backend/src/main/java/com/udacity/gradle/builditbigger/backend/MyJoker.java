package com.udacity.gradle.builditbigger.backend;

import com.aditya.jokeslib.JokesJava;

public class MyJoker {

    private String myJoker;

    public String getData() {
        myJoker = new JokesJava().getJoke();
        return myJoker;
    }

    public void setJoker(String Joker) {
        myJoker = Joker;
    }
}