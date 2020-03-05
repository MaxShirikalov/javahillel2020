package HomeTask2;

public class AverageCalculator {

    // Average of two numbers
    public double averageOfTwoNumbers(double a, double b){
        return (a + b)/2;
    }
    //Average of whole array
    public double averageArrayValue(double [] args){
        double sum = 0;
        for(Double arg : args){
            sum += arg;
        }
         return sum / args.length;
    }
}
