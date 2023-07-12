package org.lessons.java.security;

import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {

        // dichiaro che voglio uno scanner da tastiera
        Scanner scanner = new Scanner(System.in);

        //declaring variables

        String name;
        String surname;
        String favoriteColor;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        int sumBirthInfo;
        String birthInfo ;



        // getting information from the printer

        System.out.println("inter your name:");
        name = scanner.nextLine();
        System.out.println("inter your surname:");
        surname = scanner.nextLine();
        System.out.println("what is your favorite color:");
        favoriteColor = scanner.nextLine();

        //asking day of birth

        System.out.println("inter your day of birth:");
        dayOfBirth = scanner.nextInt();

        //asking month of birth

        System.out.println("inter your month of birth:");
        monthOfBirth = scanner.nextInt();

        //asking year of birth

        System.out.println("inter your year of birth:");
        yearOfBirth = scanner.nextInt();

        // print birth information
        birthInfo=dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
        System.out.println("your birth information: " + birthInfo);
        //stampa a video
        sumBirthInfo = dayOfBirth + monthOfBirth + yearOfBirth;

        System.out.println("the sum is:" + sumBirthInfo);
        String password = name + surname + favoriteColor + sumBirthInfo;
        System.out.println("your password is:" + password);
    }
}
