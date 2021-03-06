package Hillel;

public class Lion extends Wild {
    public Lion(int id, int age, float weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void setPredator(boolean predator) {
        super.setPredator(true);
    }

    @Override
    public void voice(){
        System.out.println("Hello, I am a wild animal and I am angry");
    }
}
