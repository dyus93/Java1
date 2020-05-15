package lesson3.HW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       game();
       System.out.println("Конец игры");

    }

    public static void game() {

        Scanner scanner = new Scanner(System.in);
        int isRunnable;



        do {
            Random random = new Random();
            int rnd = random.nextInt(10);

            System.out.println("Загадываю число...");
            System.out.println("У Вас есть три попытки");
            System.out.println("Введите число от 0 до 9");


            for (int i = 0; i < 3; i++) {

                int num = scanner.nextInt();

                if (rnd == num) {
                    System.out.println("Поздравляю, вы угадали");
                    break;
                } else if (rnd > num) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
            }
            System.out.println("Игра окончена.");
            System.out.println("Начать сначала?");
            System.out.println("Введите 1 или 0");

            isRunnable = scanner.nextInt();
        }while (isRunnable == 1);
    }
}
