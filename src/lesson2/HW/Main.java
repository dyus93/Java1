package lesson2.HW;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rnd = new Random();

//  Задать целочисленный массив, состоящий из элементов 0 и 1.
//  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

//        for (int i = 0; i < arr.length; i++){
//             arr[i] = rnd.nextInt(2);
//            System.out.print("[" + i + "]{" + arr[i] +"}  ");
//        }
//
//        System.out.println();
//
//        for (int j = 0; j <= arr.length -1; j++){
//            if (arr[j] == 0){
//                arr[j] = 1;
//            }
//            else{
//                arr[j] = 0;
//            }
//            System.out.print("[" + j + "]{" + arr[j] +"}  ");
//        }
//
//        System.out.println();


        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

//        int[] voidArr = new int[8];
//        int k = 0;
//        for (int i = 0; i < voidArr.length ; i++  ){
//            voidArr[i] = k;
//            System.out.print("[" + i + "]{" + voidArr[i] +"}  ");
//            k = k + 3;
//        }

//        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        и числа меньшие 6 умножить на 2;

//        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//
//        for (int i = 0; i < array.length; i++){
//            if (array[i] < 6) {
//                array[i] = array[i] * 2;
//            }
//            System.out.print("[" + i + "]{" + array[i] +"}  ");
//        }

//        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

//        int[][] arrSqr = new int [5][5];
//        for (int i = 0; i < arrSqr.length ; i++) {
//            for (int j = 0; j < arrSqr.length ; j++) {
//                if (i==j){
//                    arrSqr[i][j] = 1;
//                }
//                System.out.print(arrSqr[j][i]);
//            }
//            System.out.println();
//
//        }

//        ** Задать одномерный массив и найти в нем минимальный
//        и максимальный элементы (без помощи интернета);

//        int[] minMaxArr = new int[10];
//
//        for (int i = 0; i < minMaxArr.length; i++) {
//            minMaxArr[i] = rnd.nextInt(100);
//            System.out.print(minMaxArr[i] + ", ");
//        }
//        System.out.println();
//
//        Arrays.sort(minMaxArr);
//        System.out.println(minMaxArr[0]);
//        System.out.println(minMaxArr[minMaxArr.length -1]);

    }
}
