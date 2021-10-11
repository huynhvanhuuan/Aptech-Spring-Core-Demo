package com.koi.demo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 2km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
