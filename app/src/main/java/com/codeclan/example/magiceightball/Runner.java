package com.codeclan.example.magiceightball;

/**
 * Created by user on 23/02/2017.
 */

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        System.out.println("Enter your question, mortal!");

        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();

        Answer eightball = new Answer();
        System.out.println(eightball.getAnswer());
    }
}
