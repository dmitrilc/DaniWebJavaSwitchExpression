package com.example.switcher;

public class Entry {

    public static void main(String[] args){
        //arrowSwitch(Season.SPRING);
        //System.out.println(arrowSwitch2(Season.FALL));
        colonSwitchExpression(Season.SPRING);
    }

    private static void arrowSwitch(Season season){
        switch(season){
            case SPRING -> System.out.println("It is Spring.");
            case SUMMER -> System.out.println("It is Summer.");
            case FALL -> System.out.println("It is Fall.");
            case WINTER -> System.out.println("It is Winter");
        }
    }

    private static Season arrowSwitch2(Season season){
        return switch (season){
            case SPRING -> Season.SPRING;
            case SUMMER -> Season.SUMMER;
            case FALL -> Season.FALL;
            case WINTER -> Season.WINTER;
        };
    }

    private static Season colonSwitchExpression(Season season){
        return switch (season){
            case SPRING:
                System.out.println("It is Spring.");
                yield Season.SPRING;
            case SUMMER:
                System.out.println("It is Summer.");
                yield Season.SUMMER;
            case FALL:
                System.out.println("It is Fall.");
                yield Season.FALL;
            case WINTER:
                System.out.println("It is Winter");
                yield Season.WINTER;
        };
    }

}

enum Season { SPRING, SUMMER, FALL, WINTER }