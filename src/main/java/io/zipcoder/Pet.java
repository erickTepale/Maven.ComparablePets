package io.zipcoder;

public class Pet implements Comparable<Pet>{
    private String name;
    private String type;

    public Pet(String name, String type){
        this.name = name;
        this.type =type;
    }

    public String speak(){
        return "Whimper";
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nPet:\n" +
                "\tName= " + name;
    }

    @Override
    public int compareTo(Pet o) {
        if(name.toLowerCase().compareTo(o.getName().toLowerCase()) > 0)
            return 1;
        else if(name.toLowerCase().compareTo(o.getName().toLowerCase()) < 0)
            return -1;
        else{
            if(this.getType().compareTo(o.getType()) > 0)
                return 1;
            else if(this.getType().compareTo(o.getType()) < 0)
                return -1;
            else
                return 0;
        }
    }

}
