package com.abhi.empwage;

public class Main {

    public static void main(String[] args) {
        
        //taking dice number by using random
        int diceCheck = (int) Math.floor(Math.random() * 10) % 6+1;
        System.out.println("Dice Value::"+ diceCheck);
    }

}

    

