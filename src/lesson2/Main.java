package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int winner = 777;
        int superWinner = 999;

        switch (value){
            case 777: {
                System.out.println("Congrats, are you Winner!!!");
                break;
            }
            case 999:{
                System.out.println("Congrats, are you Super Winner!!!");
            }
            default: {
                System.out.println("Sorry, are you looser");
                System.out.println("Sorry, try again");
            }
        }

    }
}
