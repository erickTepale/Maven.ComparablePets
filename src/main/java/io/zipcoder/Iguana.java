package io.zipcoder;

public class Iguana extends Pet{
    public Iguana(String name) {
        super(name, "Iguana");
    }

    @Override
    public String speak() {
        return "*stick tongue out twice*";
    }

    @Override
    public String toString() {
        return super.toString() + " sais " + speak() + "\n";
    }

}
