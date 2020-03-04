package Hillel;

public class Pet extends Animal{
    protected String name;
    private boolean isVaccinated;


    @Override
    public void voice(){
        System.out.println("Hello, my name is " + name);
    }

    public Pet(int id, int age, float weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
}
