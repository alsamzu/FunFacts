package com.example.zulfa.funfacts;

import java.util.Random;

public class FactBook {
    //Fields or Member variables - Properties about the object
   private  String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches run faster than horses.",
            "Olympic gold medals are actually most made of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the sun to reach Earth.",
            "Some bamboo plants can grom almost a meter in one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3meters out of the water.",
            "On avarage it takes 66days to form a new habit.",
            "Mammoths still walked the Earth when the great pyramid was being built."
    };
    //Methods - Actions the object can take

    public  String getFact(){
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];

    };

}
