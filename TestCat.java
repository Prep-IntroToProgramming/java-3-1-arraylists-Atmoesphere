import java.util.*;
public class TestCat {
    public static void main (String[] args){
    ArrayList<Cat> CatList = new ArrayList<Cat>(); // <> for array lists
    Cat cat1 = new Cat("cat1"); //created new cat
    Cat cat2 = new Cat("cat2"); //created new cat
    Cat cat3 = new Cat("cat3"); //created new cat
    Cat cat4 = new Cat("cat4"); //created new cat
    
    CatList.add(0,cat1);//names for cat constructors
    CatList.add(1,cat2);
    CatList.add(2,cat3);
    CatList.add(3,cat4);
    
    int x=0;
    for (Cat i: CatList){
        double w = (Math.random()*10)+5;
        CatList.get(x).setWeight(w);
        x = x + 1;
    }
    
    x = 0; 
    for (Cat i: CatList){
        System.out.println(CatList.get(x).getName() + " " + CatList.get(x).getWeight());
        System.out.println(CatList.get(x).getName() + " says ");
        CatList.get(x).meow();
        x = x + 1;
    }
}
}