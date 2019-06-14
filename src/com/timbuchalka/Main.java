package com.timbuchalka;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
       printFactors(32);
    }

    public static void printFactors(int number){


        if(number < 1){
            System.out.println("Invalid Value");
        }
        int i = 0;

        while(i < number){
            i++;
            if(number%i == 0){
                System.out.println(i);

            }

        }
    }
}
