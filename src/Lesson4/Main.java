package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //  \u007C vertical line
    //  \u005F underscore character
    //  \u00AF macron character
    //  \u00A4 currency sign
    //  \u00D8 O Letter with stroke
    //  \u00B7 Middle dot

    public static void main(String[] args) {
        init();
    }
    static void init(){
        char[] signs = rollPlayingSing();
        char humanSign = signs[0];
        char computerSign = signs[1];

        char[][] fieldValues = getFieldValues();
        drawPlayingField(fieldValues);

        String currentPlayer = "Human";
        char currentPlayerSign = humanSign;
        boolean isWin;

        do {
            int[] coordinates = move(currentPlayer);

            boolean isPlotted;
            do {
                isPlotted = putValueOnField(fieldValues, coordinates, currentPlayerSign);
                if (!isPlotted){
                    coordinates = move(currentPlayer);
                    isPlotted = putValueOnField(fieldValues, coordinates, currentPlayerSign);
                }
            }while(!isPlotted);

            clearField();
            drawPlayingField(fieldValues);

            isWin = checkWin(fieldValues);
            if (!isWin){
                currentPlayer = switchPlayer(currentPlayer);
                currentPlayerSign = switchPlayerSign(currentPlayerSign);
            }
        }while (!isWin);

        if (!isWin){
            System.out.println(String.format("Congrats Mr. %s!!! You are Winner!", currentPlayer));
        }
    }

    static String switchPlayer(String currentUser){
        return currentUser.equals("Human") ? "Computer" : "Human";
    }

    static char switchPlayerSign(char currentPlayerSign){
        return currentPlayerSign == 'X' ? 'O' : 'X';
    }

    static void clearField(){
        for (int i = 0; i < 50 ; i++) {
            System.out.println("\b");
        }
    }

    static boolean putValueOnField(char[][] fieldValues, int[] coordinates, char playerSign){
        if (fieldValues[coordinates[0]][coordinates[1]] == '\u00B7'){
            fieldValues[coordinates[0]][coordinates[1]] = playerSign;
            System.out.println(String.format("Value plotted on coordinates [x: %s, y: %s]", coordinates[0],coordinates[1]));
            return true;
        }
        System.out.println("Value already plotted. Please choose other coordinates");
        return false;
    }

    static int[] move(String currentPlayer){
        if (currentPlayer.equals("Human")){
            return movePlayer();
        }
        return moveComputer();
    }

    static int[] movePlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input X coordinate of [0,1,2]");
        int x = scanner.nextInt();
        System.out.println("Input Y coordinate of [1,3,5]");
        int y = scanner.nextInt();
        return new int[] {x,y};
    }

    static int[] moveComputer(){
        int[] availableXCoordinates = {0,1,2};
        int[] availableYCoordinates = {1,3,5};
        Random random = new Random();
        int x = availableXCoordinates[random.nextInt(3)];
        int y = availableYCoordinates[random.nextInt(3)];
        return new int[]{x,y};
    }

    static boolean checkWin(char[][] fieldValues){
        if (fieldValues[0][1] != '\u00B7' && fieldValues[0][3] != '\u00B7' && fieldValues[0][5] != '\u00B7'){
            return fieldValues[0][1] == fieldValues[0][3] && fieldValues[0][3] == fieldValues[0][5];
        }else if (fieldValues[1][1] != '\u00B7' && fieldValues [1][3] != '\u00B7' && fieldValues[1][5] != '\u00B7'){
            return fieldValues[1][1] == fieldValues[1][3] && fieldValues[1][1] == fieldValues[1][5];
        }else   if (fieldValues[2][1] != '\u00B7' && fieldValues [2][3] != '\u00B7' && fieldValues[2][5] != '\u00B7'){
            return fieldValues[1][1] == fieldValues[1][3] && fieldValues[2][1] == fieldValues[1][5];
        }
        return false;
    }

    static char[][] getFieldValues(){
        return new char[][] {
                {'\u007C', '\u00B7', '\u007C', '\u00B7', '\u007C', '\u00B7', '\u007C'},
                {'\u007C', '\u00B7', '\u007C', '\u00B7', '\u007C', '\u00B7', '\u007C'},
                {'\u007C', '\u00B7', '\u007C', '\u00B7', '\u007C', '\u00B7', '\u007C'}
        };
    }

    static char[] rollPlayingSing(){
        char[] signs = new char[2];

        System.out.println("Choosing X or O ...");
        switch (new Random().nextInt(2)){
            case 0:{
                signs[0] = 'O';
                signs[1] = 'X';
                System.out.println("Your sign: O");
                break;
            }
            case    1:{
                signs[0] = 'X';
                signs[1] = 'Y';
                System.out.println("Your sign: X");
                break;
            }
            default:{
                System.out.println("Something went wrong. Unknown sign rather than [X,O]");
                System.exit(-1);
            }
        }
        return signs;
    }

    static void drawPlayingField(char[][] fieldValues){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 7 ; j++) {
                System.out.print(fieldValues[i][j]);
            }
            System.out.println();
        }
    }
}
