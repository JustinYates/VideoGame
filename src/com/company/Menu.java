package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private Scanner download = new Scanner(System.in);
    //menu to prompt user for library options

    public void startMenu() {

        System.out.println("Welcome to the Video game library, what would you like to do?     \n1. Add a game to the library   \n2. Remove a game from the library \n3. View what is currently in the library \n4. Check a game out \n5. Check a game in \n6. View checked out games \n7. Exit");
        try {
            Library library = new Library();

            switch (input.nextInt()) {
                case 1:
                    library.addGame();
                    System.out.print("These are the games in your library currently ~ ");
                    System.out.println(library.installedGames);
                    System.out.println("Whats the name of the game you'd like to download?");
                    String userSearch = download.nextLine();
                    System.out.println("Downloading " + userSearch + "....");
                    System.out.println("10%");
                    System.out.println("30%");
                    System.out.println("48%");
                    System.out.println("64%");
                    System.out.println("86%");
                    System.out.println("100%");
                    System.out.println(userSearch + " has been downloaded to the system."); System.out.println();
                    library.installedGames.add(userSearch);
                    startMenu();
                    //add a game
                    break;
                case 2:
                    //remove game
                    break;
                case 3:
                    library.addGame();
                    System.out.println(library.installedGames);
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
                    System.exit(0);
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
