package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // input a word
        Scanner keyboard = new Scanner(System.in);

        boolean cont = true;
        int x = 0;
        while(cont)
        {
            System.out.println("gimme a number -> ");
            x = keyboard.nextInt();
            if (x < 0){
                cont = true;
                System.out.println("sigh....seriously?");
            } else {
                cont = false;
                System.out.println("thanks");
            }
        }

    }
}
