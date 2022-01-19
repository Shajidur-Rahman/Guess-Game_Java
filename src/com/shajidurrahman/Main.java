package com.shajidurrahman;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    WelcomeText();
        UserOpinion();
    }

    private static void UserOpinion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your opinion: ");
        String userOpinion = sc.next();
        if (Objects.equals(userOpinion, "start")){
            gameStarted();
        } else if (Objects.equals(userOpinion, "exit")){
            gameExit();
        } else {
            System.out.println("Type some meaningfully word");
        }
    }

    public static void gameWon(int a){
        System.out.println("You have won the game :) !!!");
        System.out.println("Your trying time " + a);
        System.exit(0);
    }

    private static void gameExit() {
        System.out.println("Have a nice day :) ");
        System.exit(0);
    }

    private static void gameStarted() {
        System.out.println("Guess the number between 1-20 :) ");
        System.out.println("Game started :) ");
        Random rand = new Random();
        int randomNum = rand.nextInt(20);
        Scanner sc = new Scanner(System.in);
        String user = "";
        int tryingTime = 1;
        int userNum = -1;

        while (true){
            System.out.println("You entered");
            user = sc.next();

            if (Objects.equals(user, "exit")){
                gameExit();
            } else {
                try {
                    userNum = Integer.parseInt(user);
                } catch (Exception e){
                    System.out.println("Invalid input");
                    gameRestarted();
                }
            }

            if (userNum == randomNum){
                gameWon(tryingTime);
            } else if (userNum < randomNum){
                System.out.println("Try to input higher number :( ");
            } else if (userNum > randomNum){
                System.out.println("Try to input lower number :( ");
            } else {
                System.out.println("Something went wrong :( ");
            }

            tryingTime = tryingTime + 1;
        }

    }

    private static void gameRestarted() {

        System.out.println("\n \n");
        System.out.println("########################################");
        System.out.println("Game restarted :( ");
        System.out.println("Guess the number between 1-20 :) ");
        Random rand = new Random();
        int randomNum = rand.nextInt(20);
        Scanner sc = new Scanner(System.in);
        String user = "";
        int tryingTime = 1;
        int userNum = -1;

        while (true){
            System.out.println("You entered");
            user = sc.next();

            if (Objects.equals(user, "exit")){
                gameExit();
            } else {
                try {
                    userNum = Integer.parseInt(user);
                } catch (Exception e){
                    System.out.println("Invalid input");
                    gameRestarted();
                }
            }

            if (userNum == randomNum){
                gameWon(tryingTime);
            } else if (userNum < randomNum){
                System.out.println("Try to input higher number :( ");
            } else if (userNum > randomNum){
                System.out.println("Try to input lower number :( ");
            } else {
                System.out.println("Something went wrong :( ");
            }

            tryingTime = tryingTime + 1;
        }
    }

    private static void WelcomeText() {
        System.out.println("**********************************************");
        System.out.println("*********  Welcome to Guess Game  ************");
        System.out.println("To start the game type 'start'");
        System.out.println("You need to guess a number, if the matched with the random number you won otherwise you lost");
        System.out.println("To exit the game type 'exit'");
    }
}
