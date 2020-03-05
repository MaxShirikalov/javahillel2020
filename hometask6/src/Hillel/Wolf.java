package hometask6.src.Hillel;

public class Wolf extends Wild implements IAnimal{
    public Wolf(int id, int age, float weight, String color, boolean Predator) {
        super(id, age, weight, color, Predator);
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
