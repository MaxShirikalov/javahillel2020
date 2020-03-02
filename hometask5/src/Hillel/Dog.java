package Hillel;

public class Dog extends Pet {
    public Dog(int id, int age, float weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice(){
        System.out.println("Hello, my name is " + name + "Woof");
    }
}
