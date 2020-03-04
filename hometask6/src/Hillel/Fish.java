package Hillel;

public class Fish extends Pet implements IAnimal{
    public Fish(int id, int age, float weight, String color, String name, boolean Vaccinated) {
        super(id, age, weight, color, name, Vaccinated);
    }

    @Override
    public void voice(){
        System.out.println("...");
    }
}
