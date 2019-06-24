package io.zipcoder;

public class Dog extends Pet{
    public Dog(String name) {
        super(name, "Dog");
    }

    @Override
    public String speak() {
        return "Bork";
    }

    @Override
    public String toString() {
        return super.toString() + " sais " + speak() + "\n";
    }


}
