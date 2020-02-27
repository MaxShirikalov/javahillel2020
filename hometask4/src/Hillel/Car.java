package Hillel;

public class Car {

        public static double TripPrice;
        public static double fuelPrice = 26.49d;

        private double FuelTankCapacity;
        private double FuelTankBalance;
        private double FuelConsumption;

        public Car(double fuelTankCapacity, double fuelTankBalance, double fuelConsumption){
                this.FuelConsumption = fuelConsumption;
                this.FuelTankBalance = fuelTankBalance;
                this.FuelTankCapacity = fuelTankCapacity;
        }

        public double fillFuel(){
                System.out.println("Заполним бак полностью");
                return this.FuelTankBalance += (FuelTankCapacity - FuelTankBalance);
        }

        public double getNeededFuelForTrip(double distance){
                double fuelNeeded = (distance/100d) * FuelConsumption;
                if(fuelNeeded > FuelTankBalance) {
                        System.out.println("Не хватит " + Math.round(fuelNeeded - FuelTankBalance) +
                                "литров топлива для этой поездки");
                        return 0;
                }
                return FuelTankCapacity - (FuelTankBalance - fuelNeeded);
        }

        public double fillingFullTankAfterTrip(double distance){
                double fuelNeeded = (distance/100d) * FuelConsumption;
                if(fuelNeeded > FuelTankBalance) {
                        System.out.println("Не хватит "+ Math.round(fuelNeeded - FuelTankBalance) +
                                "литров топлива для этой поездки");
                        return 0;
                }

                double fillingTank = FuelTankCapacity - (FuelTankBalance - fuelNeeded);
                System.out.println("Для заполнения бака после поездки понадобится заплатить "
                        + Math.round(fillingTank * fuelPrice) + " гривень");
                this.FuelTankBalance -= fuelNeeded;
                TripPrice += fillingTank * fuelPrice;
                System.out.println("Необходимо будет дозаправить литров: ");
                return fillingTank;
        }

        public double getTripPrice(){
                return TripPrice;
        }






}
