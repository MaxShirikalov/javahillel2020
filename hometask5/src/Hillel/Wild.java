package Hillel;

public class Wild extends Animal {
    private boolean isPredator;


    @Override
    public void voice(){
        System.out.println("Hello, I am a wild animal");
    }

    public Wild(int id, int age, float weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
