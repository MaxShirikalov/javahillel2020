package hometask4.src.Hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //автомобиль Range Rover Расход 12.4 литра на сто километров
        //объём бака - 80 литров
        //Жашков - Кривое озеро  = 153.2 км
        // Жашков - Киев = 151.2 км
        // Одесса - Кривое озеро = 178.8 км
        // в классе Мейн надо определить и вывести на экран сколько надо
        // долить топлива и его стоимость если маршрут у нас Одесса - Киев
        //+ 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
        //+ сколько будет стоить полная поездка
        //+ остаток топлива в пункте назначения

        double OdessaToKriveOzero = 178.8d;
        double KriveOzeroToZashkov = 153.2d;
        double ZashkovToKiev = 151.2d;

        Car carOdessaKiev = new Car(80, 10, 15.9);

        System.out.println("Считаем путь Одесса - Киев");
        System.out.println("Делим на этапы:");

        System.out.println(carOdessaKiev.fillFuel());
        System.out.println("Этап 1 Одесса - Кривое Озеро");
        System.out.println(Math.round(carOdessaKiev.fillingFullTankAfterTrip(OdessaToKriveOzero)));
        System.out.println("Остаток в баке: " + Math.round(carOdessaKiev.getNeededFuelForTrip(OdessaToKriveOzero)));
        System.out.println("\n");

        System.out.println(carOdessaKiev.fillFuel());
        System.out.println("Этап 2 Кривое Озеро - Жашков");
        System.out.println(Math.round(carOdessaKiev.fillingFullTankAfterTrip(KriveOzeroToZashkov)));
        System.out.println("Остаток в баке: " + Math.round(carOdessaKiev.getNeededFuelForTrip(KriveOzeroToZashkov)));
        System.out.println("\n");

        System.out.println(carOdessaKiev.fillFuel());
        System.out.println("Этап 3 Жашков - Киев");
        System.out.println(Math.round(carOdessaKiev.fillingFullTankAfterTrip(ZashkovToKiev)));
        System.out.println("Остаток в баке: " + Math.round(carOdessaKiev.getNeededFuelForTrip(ZashkovToKiev)));
        System.out.println("Стоимость всей поездки составит: " + Math.round(carOdessaKiev.getTripPrice()) + " гривень");



        //System.out.println("");


    }
}
