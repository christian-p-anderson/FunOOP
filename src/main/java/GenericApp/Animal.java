package GenericApp;

import java.util.ArrayList;

public class Animal {

    private String myAnimal;

//    public String getMyAnimal() {
//        return myAnimal;
//    }

    public void setMyAnimal(String myAnimal) {
        this.myAnimal = myAnimal;
    }

    String getAnimal(Integer animalNumber) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cat");
        list.add("dog");
        list.add("alligator");

        return this.myAnimal = list.get(animalNumber);
    }

}
