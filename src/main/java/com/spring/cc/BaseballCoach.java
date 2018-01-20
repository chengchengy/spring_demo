package com.spring.cc;

public class BaseballCoach implements Coach {

    //define a private field for the dependencies
    private FortuneService fortuneService;

    //define a constructor for the dependency injecion
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        //use my fortuneSerive to get
        return fortuneService.getFortune();
    }

}








