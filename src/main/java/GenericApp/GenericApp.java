package GenericApp;

import java.util.HashMap;
import java.util.Scanner;

public class GenericApp {

    public static void main(String[] args) {
        Animal arrayListHashMap;
        arrayListHashMap = new Animal();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Select Animal Number (0-2)");

        Integer animalNumber = Integer.valueOf(myObj.nextLine());
        String animal = arrayListHashMap.getAnimal(animalNumber);
        System.out.println(animal);

        // Hashmap
        HashMap<Integer, String> map = new HashMap<>();

        map.put(5, "hello");
        map.put(6, "there");

        String greeting = map.get(5);
        System.out.println(greeting);
    }
}
