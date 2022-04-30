package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomNum = new Random();
        System.out.println("You roled a : ... ");
        System.out.println((randomNum.nextInt(6)+1)); //rolling a number between 1 and 6 inclusive.
    }
}
