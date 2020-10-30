package com.aditya.jokeslib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JokesJava {

    List<String> jokesList= asList(
            "Does He bite, no but he can hurt you in other ways, HTML is not a programming language",
            "Does He bite, no but he can hurt you in other ways, Knowing many Js frameworks is still knowing one language",
            "Does He bite, no but he can hurt you in other ways, You aren't even worth an insult",
            "Does He bite, no but he can hurt you in other ways, WWE is not real",
            "Does He bite, no but he can hurt you in other ways, React os wont match Windows ever"
    );


    public String getJoke(){
        Random r  = new Random();
        return jokesList.get(r.nextInt(jokesList.size()));
    }
}
