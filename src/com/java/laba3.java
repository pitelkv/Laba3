package com.java;
import java.util.Scanner;



public class laba3 {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа 3. Подготовил Питель Кирилл, студент группы 1161");
        System.out.println("Задание 1");
        System.out.println("Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на ");
        System.out.println("экран сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик ");
        System.out.println("(отделяя один элемент от другого началом новой строки). Перед созданием массива");
        System.out.println("подумайте, какого он будет размера. ");
        public void mass1(){
            int[] chet = new int[10];
            int a = 0;
            int b = 0;
            for (int i = 0; i < 10; i++) {
                chet[i] = a;
                a += 2;
                System.out.print(a + " ");
            }
            System.out.println(" ");
            for (int i = 0; i < 10; i++) {
                chet[i] = a;
                b += 2;
                System.out.println(+b);
            }
        }
        System.out.println("Задание 2");
        System.out.println("Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а ");
        System.out.println("затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 ");
        System.out.println("95 93 … 7 5 3 1).");

        System.out.println("Задание 3");
        System.out.println("Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на ");
        System.out.println("экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество ");
        System.out.println("на экран на отдельной строке.");

        System.out.println("Задание 4");
        System.out.println("Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых ");
        System.out.println("чисел из отрезка [10;99]. Вывести массив на экран.");


        System.out.println("Задание 5");
        System.out.println("Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых ");
        System.out.println("чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран ");
        System.out.println("индекс строки с наибольшим по модулю произведением элементов. Если таких строк ");
        System.out.println("несколько, то вывести индекс первой встретившейся из них.");
    }
}
