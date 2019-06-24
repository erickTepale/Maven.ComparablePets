package io.zipcoder;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
        Console console = new Console();
        Integer amountOfPets = console.returnInteger("How many pets do you have?");
        ArrayList<Pet> listPets = new ArrayList<Pet>();
        String petType = "";

        for (int i = 0; i < amountOfPets ; i++) {
            petType = console.returnString("What Type of pet do you have?");

            switch(petType.toUpperCase()){
                case "DOG":
                    listPets.add(new Dog(console.returnString("Name of Dog?")));
                    break;
                case "CAT":
                    listPets.add(new Cat(console.returnString("Name of your Cat?")));
                    break;
                case "IGUANA":
                    listPets.add(new Iguana(console.returnString("Name of our Iguana")));
                    break;
                default:
                    i -= 1;
                    break;
            }
        }

        // basic sort using comporable
        Collections.sort(listPets);

        //using annonymous comparator to sort by type then by name
        Collections.sort(listPets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                if(o1.getType().compareTo(o2.getType()) > 0)
                    return 1;
                else if(o1.getType().compareTo(o2.getType()) < 0)
                    return -1;
                else{
                    if(o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase()) > 0)
                        return 1;
                    else if(o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase()) < 0)
                        return -1;
                    else
                        return 0;
                }
            }
        });
        System.out.println(listPets);


    }
}
