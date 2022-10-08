package com.company;
import java.util.Arrays;
public class Mainomom {
    public static void main (String[] args) {
        double numbers[] = {4.9, -7.5, 5.8, 6.9, -4.4, 2.9, 1.7, 7.8, 3.2, 11.8, -8.3, 8.7, -6.1, 2.5, -4.1};

        double sum = 0.0;
        double count = 0.0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers [i] < 0) {
                for (int i1 = i + 1; i1 < numbers.length; i1++) {

                    if (numbers[i1]>0){
                        sum = sum + numbers[i1];
                        count++;
                    }
                }
                break;
            }
        }
        System.out.println("Среднее арифметтическое: " + sum / count);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double num = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = num;
                }
            }
            System.out.println (Arrays.toString(numbers));
        }
    }
}