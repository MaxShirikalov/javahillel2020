package Hillel;

public class Giraffe extends Wild {
    public Giraffe(int id, int age, float weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void voice(){
        System.out.println("Hello, I am a wild animal");
    }

    @Override
    public void setPredator(boolean predator) {
        super.setPredator(false);
    }
}
