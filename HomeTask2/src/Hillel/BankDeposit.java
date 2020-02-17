package Hillel;

import java.util.Scanner;

import static java.lang.System.in;

public class BankDeposit {
    // Программа, которая предлагает пользователю ввести
    // сумму денежного вклада в гривнах, процент годовых,
    // которые выплачивает банк, длительность вклада (лет).
    // Вывести накопленную сумму денег за каждый год и
    // начисленные проценты.


    public void depositCalculator(double sum, double percentage, int year){
        double FinalAccumulatedAmount = sum;
        for (int i = 1; i <= year; i++){
            //FinalAccumulatedAmount = Math.pow((FinalAccumulatedAmount * (1D + percentage/100D)), i);
            FinalAccumulatedAmount = FinalAccumulatedAmount * (1D + percentage/100D);
        }
        System.out.println("Финальная накопленная сумма: " + FinalAccumulatedAmount);
        System.out.println("Сумма всех накопленных процентов по вкладу: " + (FinalAccumulatedAmount - sum));
    }
}
