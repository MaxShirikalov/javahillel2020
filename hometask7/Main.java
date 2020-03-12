package hometask7;

public class Main {

    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();
        stringCollection.add("String1");
        stringCollection.add("String2");
        stringCollection.add("String3");
        stringCollection.add("String4");
        stringCollection.add("String5");
        stringCollection.add("String6");
        stringCollection.add("String7");
        stringCollection.add("String8");
        stringCollection.add("String9");
        stringCollection.add("String10");

        System.out.println(stringCollection.contains("String121"));
        System.out.println(stringCollection.getSize());
        stringCollection.clear();
        System.out.println(stringCollection.getSize());



    }

}
