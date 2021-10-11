package com.koi.demo;

public class MyApp {

    public static void main(String[] args) {
        FortuneService fortuneService = new HappyFortuneService();

        TennisCoach theCoach = new TennisCoach();
        theCoach.setFortuneService(fortuneService);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }
}
