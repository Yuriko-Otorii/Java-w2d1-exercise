import Animal.Crocodile;
import Animal.Eagle;
import Animal.Eel;
import Creature.Creature;
import Species.Birds;
import Species.Fish;
import Species.Reptile;

public class App {
    public static void main(String[] args) throws Exception {
        Creature creature1 = new Creature();

        Reptile reptile1 = new Reptile();
        Fish fish1 = new Fish();
        Birds birds1 = new Birds();

        Crocodile crocodile1 = new Crocodile();
        Eel eel1 = new Eel();
        Eagle eagle1 = new Eagle();



        Creature creature2 = new Creature(20, 30,"animal", "warm");

        Reptile reptile2 = new Reptile(5, 10, "reptile", "cold", true, true, true);
        Fish fish2 = new Fish(8, 15, "fish" ,"cold", true, false);
        Birds birds2 = new Birds(10, 25, "bird", "warm", true, true);

        Crocodile crocodile2 = new Crocodile(100, 100, "reptile", "warm", false, true, false, true);
        Eel eel2 = new Eel(50, 30, "fish", "cold", true, false, true);
        Eagle eagle2 = new Eagle(60, 30, "bird", "warm", true, true);


        //default
        System.out.println(creature1.showInfo());
        System.out.println(reptile1.showInfo());
        System.out.println(fish1.showInfo());
        System.out.println(birds1.showInfo());
        System.out.println(crocodile1.showInfo());
        System.out.println(eagle1.showInfo());
        System.out.println(eel1.showInfo());

        System.out.println("------------------------------------------------------------------");

        //parameterlized
        System.out.println(creature2.showInfo());
        System.out.println(reptile2.showInfo());
        System.out.println(fish2.showInfo());
        System.out.println(birds2.showInfo());
        System.out.println(crocodile2.showInfo());
        System.out.println(eagle2.showInfo());
        System.out.println(eel2.showInfo());
        

        


        



    }
}
