package Hillel;


public class GuideDog extends Pet {
    private boolean isTrained;




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
    @Override
    public void voice(){
            System.out.println("I can take you home");
    }
}

