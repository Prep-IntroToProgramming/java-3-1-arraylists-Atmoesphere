
public class Cat {
    private String name;
    private double weight;

    void setName (String aName){
        name = aName; 
    }

    void setWeight (double aName){
        weight = aName;
    }

    String getName (){
        return name;
    }

    double getWeight(){
        return weight;
    }

    public Cat(){//constructor

    }

    public Cat(String aName){
        name = aName;
    }

    void meow(){
        System.out.println("meow");
    }
}
