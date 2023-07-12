package org.lessons.java.security;

import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        //Dichiarazione e assegnazione delle variabile

        String name="kaam";
        String surname="julienne";
        String favoriteColor="white";
        int dayOfBirth=3;
        int monthOfBirth=10;
        int yearOfBirth=1997;
        String birthInfo= dayOfBirth +"/" + monthOfBirth +"/" + yearOfBirth ;
        int sumBirthInfo= dayOfBirth+monthOfBirth+yearOfBirth;
        String password=name  + surname + favoriteColor + sumBirthInfo ;

        //stampa a video
        System.out.println("la somma è:" +sumBirthInfo);
        System.out.println("la tua password è:" +password);

    }
}
