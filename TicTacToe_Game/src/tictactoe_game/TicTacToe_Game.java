package tictactoe_game;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe_Game {

    public static void main(String[] args) {
        System.out.println("\t    Tic Toe Game\nBy Lina Hammad Balqa' Appl"
                + "ied University\n\tDr. Muhammad Reyalat");
        Scanner input = new Scanner(System.in);
        Random R = new Random();
        String tryAgainstr;

        boolean tryAgain = true;
        boolean player1win = false;
        boolean player2win = false;
        boolean player1turn;
        boolean player2turn;
        String square;
        int x;
        String c;
        boolean AllowedMove = true;
        while (tryAgain == true) {
            tryAgain = false;

            int drawCounter = 0;
            System.out.println("1. 2 Players ");
            System.out.println("2. Versus PC ");
            System.out.println("Enter the number of game you want to play :");
            c = input.next();

            switch (c) {
                case "1":
                    player1turn = true;
                    player2turn = false;
                    String arr[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
                    System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
                    System.out.println("-+-+-");
                    System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
                    System.out.println("-+-+-");
                    System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);

                    player1turn = true;
                    player2turn = false;
                    while (player1win == false && player2win == false) {

                        while (player1turn == true) {
                            System.out.println("Player1 enter the number of square : ");
                            square = input.next();
                            x = Integer.parseInt(square);

                            while (!(x > 0 && x < 10)) {
                                System.out.print("Wrong choice enter right square !");
                                square = input.next();
                                x = Integer.parseInt(square);

                            }

                            if ((x == 1) && (arr[0][0] != "X") && (arr[0][0] != "O")) {
                                arr[0][0] = "X";
                                AllowedMove = true;

                            } else if ((x == 2) && (arr[0][1] != "X") && (arr[0][1] != "O")) {
                                arr[0][1] = "X";
                                AllowedMove = true;

                            } else if ((x == 3) && (arr[0][2] != "X") && (arr[0][2] != "O")) {
                                arr[0][2] = "X";
                                AllowedMove = true;

                            } else if ((x == 4) && (arr[1][0] != "X") && (arr[1][0] != "O")) {
                                arr[1][0] = "X";
                                AllowedMove = true;

                            } else if ((x == 5) && (arr[1][1] != "X") && (arr[1][1] != "O")) {

                                arr[1][1] = "X";
                                AllowedMove = true;

                            } else if ((x == 6) && (arr[1][2] != "X") && (arr[1][2] != "O")) {
                                arr[1][2] = "X";
                                AllowedMove = true;

                            } else if ((x == 7) && (arr[2][0] != "X") && (arr[2][0] != "O")) {
                                arr[2][0] = "X";
                                AllowedMove = true;
                            } else if ((x == 8) && (arr[2][1] != "X") && (arr[2][1] != "O")) {
                                arr[2][1] = "X";
                                AllowedMove = true;
                            } else if ((x == 9) && (arr[2][2] != "X") && (arr[2][2] != "O")) {
                                arr[2][2] = "X";
                                AllowedMove = true;
                            } else {
                                System.out.println("The square is already taken!!");
                                AllowedMove = false;

                            }

                            if ((arr[0][0] == arr[0][1]) && (arr[0][1] == arr[0][2])) {
                                player1win = true;
                            } else if ((arr[1][0] == arr[1][1]) && (arr[1][1] == arr[1][2])) {
                                player1win = true;
                            } else if ((arr[2][0] == arr[2][1]) && (arr[2][1] == arr[2][2])) {
                                player1win = true;
                            } else if ((arr[0][0] == arr[1][0]) && (arr[1][0] == arr[2][0])) {
                                player1win = true;
                            } else if ((arr[0][1] == arr[1][1]) && (arr[1][1] == arr[2][1])) {
                                player1win = true;
                            } else if ((arr[0][2] == arr[1][2]) && (arr[1][2] == arr[2][2])) {
                                player1win = true;
                            } else if ((arr[0][0] == arr[1][1]) && (arr[1][1] == arr[2][2])) {
                                player1win = true;
                            } else if ((arr[0][2] == arr[1][1]) && (arr[1][1] == arr[2][0])) {
                                player1win = true;
                            }

                            if (AllowedMove == false) {
                                continue;
                            }

                            player1turn = false;
                            player2turn = true;

                        }

                        System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
                        System.out.println("-+-+-");
                        System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
                        System.out.println("-+-+-");
                        System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);

                        drawCounter = 0;
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {

                                if (arr[i][j] == "X" || arr[i][j] == "O") {
                                    drawCounter++;
                                }
                            }
                        }

                        if (drawCounter == 9 && player1win == false && player2win == false) {
                            System.out.println("DRAW ,, No Winner");
                            player1turn = false;
                            player2turn = false;

                            System.out.println("Press yes to play again , press no to quit game ");
                            tryAgainstr = input.next();

                            if (tryAgainstr.toLowerCase().startsWith("yes")) {
                                tryAgain = true;
                                player1win = false;
                                player2win = false;
                                player1turn = true;
                            } else {
                                tryAgain = false;
                            }

                            break;
                        }
                        if (player1win == true) {
                            System.out.println("Congratulations Player 1 You Are The Winner !!");
                            player1turn = false;
                            player2turn = false;

                            System.out.println("Press yes to play again , press no to quit game ");
                            tryAgainstr = input.next();

                            if (tryAgainstr.toLowerCase().startsWith("yes")) {
                                tryAgain = true;
                                player1win = false;
                                player2win = false;
                                player1turn = true;
                            } else {
                                tryAgain = false;
                            }

                            break;
                        }

                        while (player2turn == true) {
                            System.out.println("Player2 enter the number of square : ");
                            square = input.next();
                            x = Integer.parseInt(square);

                            while (!(x > 0 && x < 10)) {
                                System.out.print("Wrong choice enter right square !");
                                square = input.next();
                                x = Integer.parseInt(square);
                                continue;
                            }

                            if ((x == 1) && (arr[0][0] != "X") && (arr[0][0] != "O")) {
                                arr[0][0] = "O";
                                AllowedMove = true;

                            } else if ((x == 2) && (arr[0][1] != "X") && (arr[0][1] != "O")) {
                                arr[0][1] = "O";
                                AllowedMove = true;

                            } else if ((x == 3) && (arr[0][2] != "X") && (arr[0][2] != "O")) {
                                arr[0][2] = "O";
                                AllowedMove = true;

                            } else if ((x == 4) && (arr[1][0] != "X") && (arr[1][0] != "O")) {
                                arr[1][0] = "O";
                                AllowedMove = true;

                            } else if ((x == 5) && (arr[1][1] != "X") && (arr[1][1] != "O")) {

                                arr[1][1] = "O";
                                AllowedMove = true;

                            } else if ((x == 6) && (arr[1][2] != "X") && (arr[1][2] != "O")) {
                                arr[1][2] = "O";
                                AllowedMove = true;

                            } else if ((x == 7) && (arr[2][0] != "X") && (arr[2][0] != "O")) {
                                arr[2][0] = "O";
                                AllowedMove = true;
                            } else if ((x == 8) && (arr[2][1] != "X") && (arr[2][1] != "O")) {
                                arr[2][1] = "O";
                                AllowedMove = true;
                            } else if ((x == 9) && (arr[2][2] != "X") && (arr[2][2] != "O")) {
                                arr[2][2] = "O";
                                AllowedMove = true;
                            } else {
                                System.out.println("The square is already taken!!");
                                AllowedMove = false;

                            }

                            if ((arr[0][0] == arr[0][1]) && (arr[0][1] == arr[0][2])) {
                                player2win = true;
                            } else if ((arr[1][0] == arr[1][1]) && (arr[1][1] == arr[1][2])) {
                                player2win = true;
                            } else if ((arr[2][0] == arr[2][1]) && (arr[2][1] == arr[2][2])) {
                                player2win = true;
                            } else if ((arr[0][0] == arr[1][0]) && (arr[1][0] == arr[2][0])) {
                                player2win = true;
                            } else if ((arr[0][1] == arr[1][1]) && (arr[1][1] == arr[2][1])) {
                                player2win = true;
                            } else if ((arr[0][2] == arr[1][2]) && (arr[1][2] == arr[2][2])) {
                                player2win = true;
                            } else if ((arr[0][0] == arr[1][1]) && (arr[1][1] == arr[2][2])) {
                                player2win = true;
                            } else if ((arr[0][2] == arr[1][1]) && (arr[1][1] == arr[2][0])) {
                                player2win = true;
                            }

                            if (AllowedMove == false) {
                                continue;
                            }

                            player2turn = false;
                            player1turn = true;

                        }

                        System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2]);
                        System.out.println("-+-+-");
                        System.out.println(arr[1][0] + "|" + arr[1][1] + "|" + arr[1][2]);
                        System.out.println("-+-+-");
                        System.out.println(arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);

                        drawCounter = 0;
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {

                                if (arr[i][j] == "X" || arr[i][j] == "O") {
                                    drawCounter++;
                                }
                            }
                        }

                        if (drawCounter == 9 && player1win == false && player2win == false) {
                            System.out.println("DRAW ,, No Winner");
                            player1turn = false;
                            player2turn = false;

                            System.out.println("Press yes to play again , press no to quit game ");
                            tryAgainstr = input.next();

                            if (tryAgainstr.toLowerCase().startsWith("yes")) {
                                tryAgain = true;
                                player1win = false;
                                player2win = false;
                                player1turn = true;
                            } else {
                                tryAgain = false;
                            }

                            break;
                        }

                        if (player2win == true) {
                            System.out.println("Congratulations Player 2 You Are The Winner !!");
                            player1turn = false;
                            player2turn = false;

                            System.out.println("Press yes to play again , press no to quit game ");
                            tryAgainstr = input.next();

                            if (tryAgainstr.toLowerCase().startsWith("yes")) {
                                tryAgain = true;
                                player1win = false;
                                player2win = false;
                                player1turn = true;
                            } else {
                                tryAgain = false;
                            }

                        }

                    }

                    break;

                default:
                    player1turn = true;
                    player2turn = false;
                    String arr2[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
                    System.out.println(arr2[0][0] + "|" + arr2[0][1] + "|" + arr2[0][2]);
                    System.out.println("-+-+-");
                    System.out.println(arr2[1][0] + "|" + arr2[1][1] + "|" + arr2[1][2]);
                    System.out.println("-+-+-");
                    System.out.println(arr2[2][0] + "|" + arr2[2][1] + "|" + arr2[2][2]);

                    while (player1win == false && player2win == false) {

                        while (player1turn == true) {
                            System.out.println("Player enter the number of square : ");
                            square = input.next();
                            x = Integer.parseInt(square);

                            while (!(x > 0 && x < 10)) {
                                System.out.print("Wrong choice enter right square !");
                                square = input.next();
                                x = Integer.parseInt(square);

                            }

                            if ((x == 1) && (arr2[0][0] != "X") && (arr2[0][0] != "O")) {
                                arr2[0][0] = "X";
                                AllowedMove = true;

                            } else if ((x == 2) && (arr2[0][1] != "X") && (arr2[0][1] != "O")) {
                                arr2[0][1] = "X";
                                AllowedMove = true;

                            } else if ((x == 3) && (arr2[0][2] != "X") && (arr2[0][2] != "O")) {
                                arr2[0][2] = "X";
                                AllowedMove = true;

                            } else if ((x == 4) && (arr2[1][0] != "X") && (arr2[1][0] != "O")) {
                                arr2[1][0] = "X";
                                AllowedMove = true;

                            } else if ((x == 5) && (arr2[1][1] != "X") && (arr2[1][1] != "O")) {

                                arr2[1][1] = "X";
                                AllowedMove = true;

                            } else if ((x == 6) && (arr2[1][2] != "X") && (arr2[1][2] != "O")) {
                                arr2[1][2] = "X";
                                AllowedMove = true;

                            } else if ((x == 7) && (arr2[2][0] != "X") && (arr2[2][0] != "O")) {
                                arr2[2][0] = "X";
                                AllowedMove = true;
                            } else if ((x == 8) && (arr2[2][1] != "X") && (arr2[2][1] != "O")) {
                                arr2[2][1] = "X";
                                AllowedMove = true;
                            } else if ((x == 9) && (arr2[2][2] != "X") && (arr2[2][2] != "O")) {
                                arr2[2][2] = "X";
                                AllowedMove = true;
                            } else {
                                System.out.println("The square is already taken!!");
                                AllowedMove = false;

                            }

                            if ((arr2[0][0] == arr2[0][1]) && (arr2[0][1] == arr2[0][2])) {
                                player1win = true;
                            } else if ((arr2[1][0] == arr2[1][1]) && (arr2[1][1] == arr2[1][2])) {
                                player1win = true;
                            } else if ((arr2[2][0] == arr2[2][1]) && (arr2[2][1] == arr2[2][2])) {
                                player1win = true;
                            } else if ((arr2[0][0] == arr2[1][0]) && (arr2[1][0] == arr2[2][0])) {
                                player1win = true;
                            } else if ((arr2[0][1] == arr2[1][1]) && (arr2[1][1] == arr2[2][1])) {
                                player1win = true;
                            } else if ((arr2[0][2] == arr2[1][2]) && (arr2[1][2] == arr2[2][2])) {
                                player1win = true;
                            } else if ((arr2[0][0] == arr2[1][1]) && (arr2[1][1] == arr2[2][2])) {
                                player1win = true;
                            } else if ((arr2[0][2] == arr2[1][1]) && (arr2[1][1] == arr2[2][0])) {
                                player1win = true;
                            }

                            if (AllowedMove == false) {
                                continue;
                            }

                            player1turn = false;
                            player2turn = true;

                        }

                        System.out.println(arr2[0][0] + "|" + arr2[0][1] + "|" + arr2[0][2]);
                        System.out.println("-+-+-");
                        System.out.println(arr2[1][0] + "|" + arr2[1][1] + "|" + arr2[1][2]);
                        System.out.println("-+-+-");
                        System.out.println(arr2[2][0] + "|" + arr2[2][1] + "|" + arr2[2][2]);

                        drawCounter = 0;
                        for (int i = 0; i < arr2.length; i++) {
                            for (int j = 0; j < arr2[i].length; j++) {

                                if (arr2[i][j] == "X" || arr2[i][j] == "O") {
                                    drawCounter++;
                                }
                            }
                        }

                        if (drawCounter == 9 && player1win == false && player2win == false) {
                            System.out.println("DRAW ,, No Winner");
                            player1turn = false;
                            player2turn = false;
                            System.out.println("Press yes to play again , press no to quit game ");
                            tryAgainstr = input.next();

                            if (tryAgainstr.toLowerCase().startsWith("yes")) {
                                tryAgain = true;
                                player1win = false;
                                player2win = false;
                                player1turn = true;
                            } else {
                                tryAgain = false;
                            }

                            break;
                        }
                        if (player1win == true) {
                            System.out.println("You Win !!");
                            player1turn = false;
                            player2turn = false;
                            System.out.println("Press yes to play again , press no to quit game ");
                            tryAgainstr = input.next();

                            if (tryAgainstr.toLowerCase().startsWith("yes")) {
                                tryAgain = true;
                                player1win = false;
                                player2win = false;
                                player1turn = true;
                            } else {
                                tryAgain = false;
                            }

                            break;
                        }

                        while (player2turn == true) {

                            x = R.nextInt(9) + 1;

                            if ((x == 1) && (arr2[0][0] != "X") && (arr2[0][0] != "O")) {
                                arr2[0][0] = "O";
                                AllowedMove = true;

                            } else if ((x == 2) && (arr2[0][1] != "X") && (arr2[0][1] != "O")) {
                                arr2[0][1] = "O";
                                AllowedMove = true;

                            } else if ((x == 3) && (arr2[0][2] != "X") && (arr2[0][2] != "O")) {
                                arr2[0][2] = "O";
                                AllowedMove = true;

                            } else if ((x == 4) && (arr2[1][0] != "X") && (arr2[1][0] != "O")) {
                                arr2[1][0] = "O";
                                AllowedMove = true;

                            } else if ((x == 5) && (arr2[1][1] != "X") && (arr2[1][1] != "O")) {

                                arr2[1][1] = "O";
                                AllowedMove = true;

                            } else if ((x == 6) && (arr2[1][2] != "X") && (arr2[1][2] != "O")) {
                                arr2[1][2] = "O";
                                AllowedMove = true;

                            } else if ((x == 7) && (arr2[2][0] != "X") && (arr2[2][0] != "O")) {
                                arr2[2][0] = "O";
                                AllowedMove = true;
                            } else if ((x == 8) && (arr2[2][1] != "X") && (arr2[2][1] != "O")) {
                                arr2[2][1] = "O";
                                AllowedMove = true;
                            } else if ((x == 9) && (arr2[2][2] != "X") && (arr2[2][2] != "O")) {
                                arr2[2][2] = "O";
                                AllowedMove = true;
                            } else {

                                AllowedMove = false;

                            }

                            if ((arr2[0][0] == arr2[0][1]) && (arr2[0][1] == arr2[0][2])) {
                                player2win = true;
                            } else if ((arr2[1][0] == arr2[1][1]) && (arr2[1][1] == arr2[1][2])) {
                                player2win = true;
                            } else if ((arr2[2][0] == arr2[2][1]) && (arr2[2][1] == arr2[2][2])) {
                                player2win = true;
                            } else if ((arr2[0][0] == arr2[1][0]) && (arr2[1][0] == arr2[2][0])) {
                                player2win = true;
                            } else if ((arr2[0][1] == arr2[1][1]) && (arr2[1][1] == arr2[2][1])) {
                                player2win = true;
                            } else if ((arr2[0][2] == arr2[1][2]) && (arr2[1][2] == arr2[2][2])) {
                                player2win = true;
                            } else if ((arr2[0][0] == arr2[1][1]) && (arr2[1][1] == arr2[2][2])) {
                                player2win = true;
                            } else if ((arr2[0][2] == arr2[1][1]) && (arr2[1][1] == arr2[2][0])) {
                                player2win = true;
                            }

                            if (AllowedMove == false) {
                                continue;
                            }

                            player2turn = false;
                            player1turn = true;

                        }

                        System.out.println(arr2[0][0] + "|" + arr2[0][1] + "|" + arr2[0][2]);
                        System.out.println("-+-+-");
                        System.out.println(arr2[1][0] + "|" + arr2[1][1] + "|" + arr2[1][2]);
                        System.out.println("-+-+-");
                        System.out.println(arr2[2][0] + "|" + arr2[2][1] + "|" + arr2[2][2]);

                        drawCounter = 0;
                        for (int i = 0; i < arr2.length; i++) {
                            for (int j = 0; j < arr2[i].length; j++) {

                                if (arr2[i][j] == "X" || arr2[i][j] == "O") {
                                    drawCounter++;
                                }
                            }
                        }

                        if (drawCounter == 9 && player1win == false && player2win == false) {
                            System.out.println("DRAW ,, No Winner");
                            player1turn = false;
                            player2turn = false;
                            System.out.println("Press yes to play again , press no to quit game ");
                            tryAgainstr = input.next();

                            if (tryAgainstr.toLowerCase().startsWith("yes")) {
                                tryAgain = true;
                                player1win = false;
                                player2win = false;
                                player1turn = true;
                            } else {
                                tryAgain = false;
                            }
                            break;
                        }

                        if (player2win == true) {
                            System.out.println("You Lose !!");
                            System.out.println("Press yes to play again , press no to quit game ");
                            tryAgainstr = input.next();

                            if (tryAgainstr.toLowerCase().startsWith("yes")) {
                                tryAgain = true;
                                player1win = false;
                                player2win = false;
                                player1turn = true;
                            } else {
                                tryAgain = false;
                            }
                            player1turn = false;
                            player2turn = false;
                        }

                    }

            }

        }

    }
}
