package Hillel;

public class Dog extends Pet implements IAnimal {
    public Dog(int id, int age, float weight, String color, String name, boolean Vaccinated) {
        super(id, age, weight, color, name, Vaccinated);
    }

    @Override
    public void voice(){
        System.out.println("Hello, my name is " + name + "Woof");
    }
}