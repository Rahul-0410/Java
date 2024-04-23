import java.util.ArrayList;
import java.util.List;
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends  Animal{
    //@override
    public void eat(){
        System.out.println("Dog is eating");
    }
}
class Rat{
    public void eat(){
        System.out.println("Rat is eating");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
}
public class ArraylistExtend {
    // <? means of any type
    public static  void feedAnimals(List<? extends  Animal> animals){
        for(Animal animal: animals){
            animal.eat();
        }
    }
    public static  void main(String [] args){
        List<Dog> dog=new ArrayList<>();
        dog.add(new Dog());
        dog.add(new Dog());
        List<Cat> cat=new ArrayList<>();
        cat.add(new Cat());
        cat.add(new Cat());
        List<Rat> rat=new ArrayList<>();
        rat.add(new Rat());
       // feedAnimals(rat);
        feedAnimals(dog);
        feedAnimals(cat);
    }
}
