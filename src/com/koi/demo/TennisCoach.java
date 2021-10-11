package com.koi.demo;

public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Jump 2 around the yard";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

}
