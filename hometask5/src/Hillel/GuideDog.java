package Hillel;


public class GuideDog extends Pet {
    private boolean isTrained;
    @Override
    public void voice(){
        if(isTrained = true)
            System.out.println("I can take you home");
        else
            System.out.println("Hello, my name is " + name + "Woof");
    }

    public GuideDog(int id, int age, float weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

}

