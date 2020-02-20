package Hillel;

import java.util.Arrays;
import java.util.Scanner;


public class task9to12 {
    //Дан массив размерности N,
    // найти наименьший элемент массива и вывести на консоль
    // (если наименьших элементов несколько — вывести их все).

    //В массиве из задания 9. найти наибольший элемент.

    //Поменять наибольший и наименьший элементы массива местами.
    // Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.

    //Найти среднее арифметическое всех элементов массива.
    public static void main(String[] args){
        System.out.println("task 9");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of digits in array: ");
        int N = keyboard.nextInt();

        int[] randomNumbers = new int[N];
        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = (int) (Math.random()*1000);
        }
        for(int i = 0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + ", ");
        }

        System.out.println("\nYour minimum value is: " + getMin(randomNumbers));
        System.out.println("Your maximum value is: " + getMax(randomNumbers));
        System.out.println("The changed array:");
        changeArray(randomNumbers);
        System.out.println("The average value of the array is: " + averageValue(randomNumbers));

    }

    private static int getMin(int [] randomNumbers){
        int min = Integer.MAX_VALUE;
        for (int i: randomNumbers){
            min = Math.min(min, i);
        }
        return min;
    }

    private static int getMax(int [] randomNumbers){
        int max = Integer.MIN_VALUE;
        for(int i: randomNumbers){
            max = Math.max(max, i);
        }
        return max;
    }

    private static void changeArray(int [] randomNumbers){
        int val = 0;
        int pointerMin = -1;
        int pointerMax = -1;
        for(int i = 0; i < randomNumbers.length; i++){
            if(randomNumbers[i] == getMax(randomNumbers)){
                pointerMax = i;
            }
            else if(randomNumbers[i] == getMin(randomNumbers)){
                pointerMin = i;
            }
        }
        val = randomNumbers[pointerMax];
        randomNumbers[pointerMax] = randomNumbers[pointerMin];
        randomNumbers[pointerMin] = val;

        System.out.println(Arrays.toString(randomNumbers));
    }

    private static int averageValue(int [] randomNumbers){
        int average = 0;
        int sum = 0;
        int amount = 0;
        for(int i = 0; i < randomNumbers.length; i++){
            sum += randomNumbers[i];
            amount++;
        }
        average = sum / amount;
        return average;
    }


}
