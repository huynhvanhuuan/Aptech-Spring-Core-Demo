package com.koi.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach secondCoach = context.getBean("myCoach", Coach.class);

        boolean result = coach == secondCoach;

        System.out.println(result);
        System.out.println(coach);
        System.out.println(secondCoach);

        context.close();
    }
}
