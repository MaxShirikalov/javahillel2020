package Hillel;

public class Fish extends Pet {
    public Fish(int id, int age, float weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice(){
        System.out.println("...");
    }
}
