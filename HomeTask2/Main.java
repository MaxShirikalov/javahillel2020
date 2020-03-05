package HomeTask2;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        double[] array = {2.3, 6.8, 4.6, 5, 12, 9};

        AverageCalculator calculate = new AverageCalculator();

        // Average value of two numbers
        System.out.println(calculate.averageOfTwoNumbers(14, 15));

        // Average value of random amount of numbers
        System.out.println(calculate.averageArrayValue(array));

        //Bank deposit



        Scanner scan = new Scanner(in);

        System.out.println("Введите сумму вашего вклада в гривне");
        double sum = scan.nextDouble();

        System.out.println("Введите процент по депозиту");
        double percentage = scan.nextDouble();

        System.out.println("Введите количество лет, на которое открывается депозит");
        int year = scan.nextInt();

        BankDeposit BankDeposit = new BankDeposit();
        BankDeposit.depositCalculator(sum, percentage, year);
        scan.close();


    }
}
