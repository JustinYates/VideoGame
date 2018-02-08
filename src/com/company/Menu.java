package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    //menu to prompt user for library options

    public void startMenu() {

        System.out.println("Welcome to the Video game library, what would you like to do?     \n1. Add a game to the library   \n2.remove a game from the library \n3. View what is currently in the library \n4. Check a game out \n15 Check a game in \n6.View checked out games \n7. Exit");
        try {
            switch (input.nextInt()) {
                case 1:
                    //add a game
                    break;
                case 2:
                    //remove game
                    break;
                case 3:
                    //view library
                    break;
                case 4:
                    //check out game
                    break;
                case 5:
                    //check in game
                    break;
                case 6:
                    //view checked out games
                    break;
                case 7:
                    //exiting program
                    break;
                default:
                    //prompt user to pick a correct number, loop back to menu
                    break;


            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("select a number from 1 - 7");
            startMenu();
        }
    }
}
