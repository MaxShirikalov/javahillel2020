package hometask3.src.Hillel;

import java.lang.reflect.Array;
import java.util.Arrays;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        System.out.println("task 1");
        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0 )
                System.out.print(i +  ", ");
        }
        System.out.println("\ntask 2");
        int n = 12;
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("task 3");
        int i = 0;
        while(i <= 100){
            if(i % 2 != 0)
            {System.out.print(i + ", ");}
            i++;
        }

        n = 29;
         i = 1;
        factorial = 1;
        while(i <= n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);


        System.out.println("task 4");
        i = 0;
        do{
            if(i % 2 != 0)
                System.out.print(i + ", ");
            i++;
        }while(i <= 100);

        n = 29;
        i = 1;
        factorial = 1;
        do{
            factorial *= i;
            i++;
        }while(i <= n);
        System.out.println(factorial);

        System.out.println("task 5");
        int x = 10;
        n = 2;
        System.out.println(Math.pow(x,n));

        System.out.println("task 6");
        i = 0;
        while(i >= -50){
            if(i % 5 == 0)
                System.out.print(i + " ");
            i--;
        }

        System.out.println("\ntask 7");
        int X = 14;
        for(i = 1; i <= 10; i++){
            System.out.println(X + "*" + i + "=" + X*i);
        }

        System.out.println("task 8");
        int[] OddValues = new int[20];
        for(i = 0; i < OddValues.length; i++){
            if(i % 2 != 0) {
                OddValues[i] += i;
            }
        }

        System.out.println(Arrays.toString(OddValues));




    }


}
